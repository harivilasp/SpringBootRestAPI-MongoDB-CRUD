package com.hari.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="haristore")
public class Car {
	
	@Id
	String modelNo;
	String carName;
	String dateOfSale;
	int price;
	
	public String getModelNo() {
		return modelNo;
	}
	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getDateOfSale() {
		return dateOfSale;
	}
	public void setDateOfSale(String dateOfSale) {
		this.dateOfSale = dateOfSale;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [modelNo=" + modelNo + ", carName=" + carName + ", dateOfSale=" + dateOfSale + ", price=" + price
				+ "]";
	}
	
	
}
