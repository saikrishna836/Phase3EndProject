package com.project.Phase3EndProject.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity(name = "product")
public class Product {
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int Id;
	@Column(name = "prodname")
	private String prodname;
	private String brand;
	private String gender;
	private int size;
	private String price;

	Product() {
	};

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getProdname() {
		return prodname;
	}

	public void setProdname(String prodname) {
		this.prodname = prodname;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [Id=" + Id + ", prodname=" + prodname + ", brand=" + brand + ", gender=" + gender + ", size="
				+ size + ", price=" + price + "]";
	}

}
