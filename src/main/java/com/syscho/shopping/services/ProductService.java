package com.syscho.shopping.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syscho.shoping.dao.ProductDao;
import com.syscho.shoping.form.ProductForm;

@Service
public class ProductService {

	
	ProductDao productDao;
	@Autowired
	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

	public List<ProductForm> findAll() {
		return productDao.findAll();
	}

	public ProductForm findById(long id) {
		return productDao.findById(id);
	}

	public int deleteById(long id) {
		return productDao.deleteById(id);
	}

	public int insert(ProductForm prodForm) {
		return productDao.insert(prodForm);
	}

	public int update(ProductForm prodForm) {
		return productDao.update(prodForm);
	}
}
