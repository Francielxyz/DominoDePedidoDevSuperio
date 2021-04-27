package com.example.dominio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dominio.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
