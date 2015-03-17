package com.mps.misys.dao;

import java.util.List;

import com.mps.misys.model.Product;

public interface ProductDAO {
	public Product create();
	public void save(Product product);
	public void delete(Product product);
	public void update(Product product);
	public Product findById(int id);
	public List<Product> findAll();
	public List<Product> findByReference(String reference);
}
