package com.sunsystem.webservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunsystem.webservice.entity.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
