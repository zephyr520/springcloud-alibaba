package com.zephyr.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity(name = "shop_order")
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /*订单ID*/
    private Long oid;
    /*用户ID*/
    private Integer uid;
    /*用户名*/
    private String username;
    /*商品ID*/
    private Integer pid;
    /*商品名称*/
    private String productName;
    /*商品单价*/
    private BigDecimal price;
    /*购买数量*/
    private Integer number;
}
