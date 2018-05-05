package com.syscho.shoping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.syscho.shoping.form.ProductForm;
import com.syscho.shopping.services.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;

	@PostMapping(path = "/addProduct")
	public int addProduct(@RequestBody ProductForm form) {
		return productService.insert(form);
	}

	@DeleteMapping(path = "/delProduct/{prodId}")
	public int delProduct(@PathVariable("prodId") String prodId) {

		return productService.deleteById(Long.valueOf(prodId));
	}

	@GetMapping(path = "/viewAllProduct")
	public List<ProductForm> viewAllProduct() {

		return productService.findAll();
	}

	@GetMapping(path = "/search/{prodId}")
	public ProductForm findById(@PathVariable("prodId") String prodId) {

		return productService.findById(Long.valueOf(prodId));
	}

	@PutMapping(path = "/updateProduct")
	public int updateProduct(@RequestBody ProductForm form) {
		return productService.update(form);
	}

	
	
	/*@Autowired
	private ProductHibernate productService;


	@PostMapping(path = "/addProduct")
	public ProductForm addProduct(@RequestBody ProductForm form) {
		return productService.insert(form);
	}

	@DeleteMapping(path = "/delProduct/{prodId}")
	public void delProduct(@PathVariable("prodId") String prodId) {

		 productService.deleteById(Long.valueOf(prodId));
	}

	@GetMapping(path = "/viewAllProduct")
	public List<ProductForm> viewAllProduct() {

		return productService.findAll();
	}

	@GetMapping(path = "/search/{prodId}")
	public Optional<ProductForm> findById(@PathVariable("prodId") String prodId) {

		return productService.findById(Long.valueOf(prodId));
	}

	@PutMapping(path = "/updateProduct")
	public ProductForm updateProduct(@RequestBody ProductForm form) {
		return productService.update(form);
	}*/
	
	
}
