package com.example.dominio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dominio.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
