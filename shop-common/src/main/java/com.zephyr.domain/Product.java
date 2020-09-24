package com.zephyr.domain;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity(name = "shop_product")
@Data
@ToString
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pid;
    /*商品名称*/
    private String productName;
    /*商品价格*/
    private BigDecimal price;
    /*库存*/
    private Integer stock;
}
