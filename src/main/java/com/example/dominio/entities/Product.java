package com.example.dominio.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Double prrice;

	public Product() {

	}

	public Product(Long id, String name, Double prrice) {
		super();
		this.id = id;
		this.name = name;
		this.prrice = prrice;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrrice() {
		return prrice;
	}

	public void setPrrice(Double prrice) {
		this.prrice = prrice;
	}

}
