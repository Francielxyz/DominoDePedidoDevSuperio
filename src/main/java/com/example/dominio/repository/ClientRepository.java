package com.example.dominio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dominio.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
