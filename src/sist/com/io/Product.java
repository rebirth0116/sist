package sist.com.io;

import java.io.Serializable;

//생성하여 내보낼 객체
//Serializable 직렬화 대상 객체 명시
public class Product implements Serializable{
	private String productName;
	private int price;
	private String productCategory;
	private String productOrigin;
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public String getProductOrigin() {
		return productOrigin;
	}
	public void setProductOrigin(String productOrigin) {
		this.productOrigin = productOrigin;
	}
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", price=" + price + ", productCategory=" + productCategory
				+ ", productOrigin=" + productOrigin + "]";
	}
	
	
}
