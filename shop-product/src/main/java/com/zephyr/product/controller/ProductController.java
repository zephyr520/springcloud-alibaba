package com.zephyr.product.controller;

import com.zephyr.domain.Product;
import com.zephyr.product.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ProductController {

    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/product/{pid}")
    public Product queryProductById(@PathVariable Integer pid) {
        log.info("查询的商品编号：{}", pid);
        Product product = productService.findById(pid);
        log.info("查询出来的商品是：{}", product);
        return product;
    }
}
