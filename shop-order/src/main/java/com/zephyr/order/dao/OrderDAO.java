package com.zephyr.order.dao;

import com.zephyr.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDAO extends JpaRepository<Order, Long> {
}
