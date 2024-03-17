package com.laramarinho.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laramarinho.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
