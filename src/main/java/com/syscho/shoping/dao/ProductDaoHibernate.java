package com.syscho.shoping.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.syscho.shoping.form.ProductForm;
@Repository
@Component
public interface ProductDaoHibernate extends JpaRepository<ProductForm, Long>{

}
