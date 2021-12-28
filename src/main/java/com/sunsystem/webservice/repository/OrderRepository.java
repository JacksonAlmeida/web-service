package com.sunsystem.webservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunsystem.webservice.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
