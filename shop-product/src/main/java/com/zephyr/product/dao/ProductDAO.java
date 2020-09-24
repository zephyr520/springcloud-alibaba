package com.zephyr.product.dao;

import com.zephyr.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDAO extends JpaRepository<Product, Integer> {
}
