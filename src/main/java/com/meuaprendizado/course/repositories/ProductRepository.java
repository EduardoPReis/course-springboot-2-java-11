package com.meuaprendizado.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meuaprendizado.course.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {

}
