package com.syscho.shopping.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syscho.shoping.dao.ProductDaoHibernate;
import com.syscho.shoping.form.ProductForm;

@Service
public class ProductHibernate {

	@Autowired
	ProductDaoHibernate productDaoHibernate;

	public List<ProductForm> findAll() {
		return productDaoHibernate.findAll();
	}

	public Optional<ProductForm> findById(long id) {
		return productDaoHibernate.findById(id);
	}

	public void deleteById(long id) {
		productDaoHibernate.deleteById(id);
	}

	public ProductForm insert(ProductForm prodForm) {
		return productDaoHibernate.save(prodForm);
	}

	public ProductForm update(ProductForm prodForm) {
		return productDaoHibernate.save(prodForm);
	}
}
