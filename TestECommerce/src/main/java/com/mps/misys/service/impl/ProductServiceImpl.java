package com.mps.misys.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mps.misys.dao.ProductDAO;
import com.mps.misys.model.Product;
import com.mps.misys.service.ProductService;

public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductDAO productDAO;
	
	@Override
	public Product create() {
		return new Product();
	}

	@Override
	public void delete(Product product) {
		productDAO.delete(product);
	}

	@Override
	public void save(Product product) {
		productDAO.save(product);
	}

	@Override
	public void update(Product product) {
		productDAO.update(product);
	}

	@Override
	public Product findById(int id) {
		return productDAO.findById(id);
	}

	@Override
	public List<Product> findAll() {
		return productDAO.findAll();
	}

}
