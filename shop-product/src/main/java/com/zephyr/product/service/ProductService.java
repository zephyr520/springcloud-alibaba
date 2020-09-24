package com.zephyr.product.service;

import com.zephyr.domain.Product;

public interface ProductService {
    Product findById(Integer pid);
}
