package com.fh.shop.producr.biz;

import com.fh.shop.producr.po.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class IProductServiceImplTest {

    @Autowired
    private IProductService productService;
    @Test
    public void addProduct() {
        Product p = new Product();
        p.setProName("武汉");
        p.setBrandId(1);
        productService.addProduct(p);
    }
}