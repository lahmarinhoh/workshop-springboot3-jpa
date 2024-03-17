package com.laramarinho.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laramarinho.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
