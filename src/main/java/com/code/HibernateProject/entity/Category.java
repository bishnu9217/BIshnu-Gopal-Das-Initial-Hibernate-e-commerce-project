package com.code.HibernateProject.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "category")
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "name", unique = true, nullable = false)
	private String name;
	
	private String discription;
	
	@OneToMany(mappedBy = "category",
		    cascade = CascadeType.ALL,
		    fetch = FetchType.LAZY)
	List<Product> products;

	public Category(String name, String discription) {
		super();
		this.name = name;
		this.discription = discription;
	}
	public Category() {
	
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", discription=" + discription + "]";
	}
	
	
}
