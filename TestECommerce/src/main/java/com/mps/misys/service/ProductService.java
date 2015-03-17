package com.mps.misys.service;

import java.util.List;

import com.mps.misys.model.Product;

public interface ProductService {
	public Product create();
	public void delete(Product product);
	public void save(Product product);
	public void update(Product product);
	public Product findById(int id);
	public List<Product> findAll();
}
