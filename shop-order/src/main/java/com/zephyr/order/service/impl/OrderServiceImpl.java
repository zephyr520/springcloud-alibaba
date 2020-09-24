package com.zephyr.order.service.impl;

import com.zephyr.order.dao.OrderDAO;
import com.zephyr.order.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OrderServiceImpl implements OrderService {

    @Resource(name = "orderDAO")
    private OrderDAO orderDAO;
}
