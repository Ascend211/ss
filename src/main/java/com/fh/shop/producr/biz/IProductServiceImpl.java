package com.fh.shop.producr.biz;

import com.fh.shop.BrandFeignClient;
import com.fh.shop.ServerResponse;
import com.fh.shop.producr.mapper.IProductMapper;
import com.fh.shop.producr.po.Product;
import com.fh.shop.producr.vo.ProductVo;
import com.fh.shop.vo.BrandVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service("productService")
public class IProductServiceImpl implements IProductService {
    @Autowired
    private IProductMapper productMapper;

    @Autowired
    private BrandFeignClient brandFeignClient;
    @Override
    public ServerResponse addProduct(Product product) {
        productMapper.insert(product);
        return ServerResponse.success();
    }

    @Override
    public ServerResponse findList() {
        List<Product> products = productMapper.selectList(null);

        List<ProductVo> productVoList = buildProductVo(products);

        return ServerResponse.success(productVoList);
    }

    private List<ProductVo> buildProductVo(List<Product> products) {
        List<ProductVo> productVoList = new ArrayList<>();
        products.forEach(x ->{
            ProductVo pv = new ProductVo();
            ServerResponse<BrandVo> brandById = brandFeignClient.findBrandById(x.getBrandId());
            if(brandById != null){
                pv.setBrandName(brandById.getData().getName());
            }
            pv.setName(x.getProName());
            pv.setPrice(x.getPrice());
            productVoList.add(pv);
        });
        return productVoList;
    }
}
