package com.syscho.shoping.form;



public class ProductForm {
	
	private long prodId;
	private String prodName;
	private String prodCategory;
	public ProductForm() {
		super();
	}
	public long getProdId() {
		return prodId;
	}
	public void setProdId(long prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getProdCategory() {
		return prodCategory;
	}
	public void setProdCategory(String prodCategory) {
		this.prodCategory = prodCategory;
	}
	@Override
	public String toString() {
		return "ProductForm [prodId=" + prodId + ", prodName=" + prodName + ", prodCategory=" + prodCategory + "]";
	}
	
}
