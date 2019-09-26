package com.cg.springmvcdemo.dao;

import java.util.List;

import com.cg.springmvcdemo.dto.Product;

public interface ProductDao {
	public Product save(Product prod);
	public List<Product> findAll();
	public Product findByProductId(int prodId);
	public void remove(int prodId);
}
