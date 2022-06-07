package com.meuaprendizado.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meuaprendizado.course.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {

}
