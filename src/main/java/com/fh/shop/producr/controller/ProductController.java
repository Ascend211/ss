package com.fh.shop.producr.controller;

import com.fh.shop.ServerResponse;
import com.fh.shop.producr.biz.IProductService;
import com.fh.shop.producr.po.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("api/products")
@CrossOrigin
public class ProductController {
    @Resource(name = "productService")
    private IProductService productService;


    @PostMapping
    public ServerResponse addProduct(@RequestBody  Product product){
        return productService.addProduct(product);
    }

    @GetMapping
    public ServerResponse findList(){
        return productService.findList();
    }
}
