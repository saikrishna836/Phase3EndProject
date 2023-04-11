package com.project.Phase3EndProject.Entity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity(name="reports")
public class Reports {
	@javax.persistence.Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	private String prodname;
	private String brand;
	private String username;
	private String gender;
	
	private Date localdate;
	@Column(name="user_id")
	private int u_id;
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	public Reports(){}
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getLocaldate() {
		return localdate;
	}

	public void setLocaldate(Date date) {
		this.localdate = date;
	}

	@Override
	public String toString() {
		return "Reports [Id=" + Id + ", prodname=" + prodname + ", brand=" + brand + ", username=" + username
				+ ", gender=" + gender + ", localdate=" + localdate + ", u_id=" + u_id + "]";
	}
	
	
	
}
