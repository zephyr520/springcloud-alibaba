package com.zephyr.product.service.impl;

import com.zephyr.domain.Product;
import com.zephyr.product.dao.ProductDAO;
import com.zephyr.product.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ProductServiceImpl implements ProductService {

    @Resource(name = "productDAO")
    private ProductDAO productDAO;

    public Product findById(Integer pid) {
        return productDAO.findById(pid).orElse(null);
    }
}
