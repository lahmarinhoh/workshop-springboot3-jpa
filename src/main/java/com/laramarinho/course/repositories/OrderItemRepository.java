package com.laramarinho.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laramarinho.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
