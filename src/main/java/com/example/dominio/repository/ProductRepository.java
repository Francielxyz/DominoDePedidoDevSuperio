package com.example.dominio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dominio.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
