package com.meuaprendizado.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meuaprendizado.course.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {

}
