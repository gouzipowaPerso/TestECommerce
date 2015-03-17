package com.mps.misys.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import com.mps.misys.dao.ProductDAO;
import com.mps.misys.model.Product;

public class ProductDAOImpl implements ProductDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	public ProductDAOImpl(){
	}
	
	public ProductDAOImpl(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public Product create() {
		return new Product();
	}

	@Override
	public void save(Product product) {
		sessionFactory.getCurrentSession().save(product);
	}

	@Override
	public void delete(Product product) {
		sessionFactory.getCurrentSession().delete(product);
	}

	@Override
	public void update(Product product) {
		sessionFactory.getCurrentSession().update(product);
	}

	@Override
	public Product findById(int id) {
		return (Product) sessionFactory.getCurrentSession().get(Product.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> findAll() {
		List<Product> products = sessionFactory.getCurrentSession()
				.createQuery("from Products").list();
		return products;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> findByReference(String reference) {
		Criteria cr = sessionFactory.getCurrentSession().createCriteria(Product.class);
		cr.add(Restrictions.eq("reference", reference));
		return cr.list();
	}

}
