package com.syscho.shoping.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.syscho.shoping.form.ProductForm;

@Repository
public class ProductDao {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	

	
	class ProductRowMapper implements RowMapper<ProductForm> {
		@Override
		public ProductForm mapRow(ResultSet rs, int rowNum) throws SQLException {
			ProductForm prod = new ProductForm();
			prod.setProdId(rs.getLong("PROD_ID"));
			prod.setProdName(rs.getString("PROD_NAME"));
			prod.setProdCategory(rs.getString("PROD_CATEGORY"));
			return prod;
		}

	}
	
	public List<ProductForm> findAll() {
		return jdbcTemplate.query("select * from product", new ProductRowMapper());
	}

	public ProductForm findById(long id) {
		return jdbcTemplate.queryForObject("select * from product where PROD_ID=?", new Object[] { id },
				new BeanPropertyRowMapper<ProductForm>(ProductForm.class));
	}

	public int deleteById(long id) {
		return jdbcTemplate.update("delete from product where PROD_ID=?", new Object[] { id });
	}

	public int insert(ProductForm prodForm) {
		return jdbcTemplate.update("insert into product (PROD_ID, PROD_NAME, PROD_CATEGORY) " + "values(?,  ?, ?)",
				new Object[] { prodForm.getProdId(), prodForm.getProdName(), prodForm.getProdCategory() });
	}

	public int update(ProductForm prodForm) {
		return jdbcTemplate.update("update product " + " set PROD_NAME = ?, PROD_CATEGORY = ? " + " where PROD_ID = ?",
				new Object[] { prodForm.getProdName(), prodForm.getProdCategory(), prodForm.getProdId() });
	}
}
