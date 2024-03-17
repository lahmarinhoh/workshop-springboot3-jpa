package com.laramarinho.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laramarinho.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
