package com.fh.shop.producr.biz;

import com.fh.shop.ServerResponse;
import com.fh.shop.producr.po.Product;

public interface IProductService {
    public ServerResponse addProduct(Product product);

    ServerResponse findList();
}
