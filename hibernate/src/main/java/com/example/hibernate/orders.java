package com.example.hibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class orders {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int orderid;
	
	private String ordername;
	
	private String orderemail;

	public int getId() {
		return orderid;
	}

	public void setId(int id) {
		this.orderid = id;
	}

	public String getOrdername() {
		return ordername;
	}

	public void setOrdername(String ordername) {
		this.ordername = ordername;
	}

	public String getOrderemail() {
		return orderemail;
	}

	public void setOrderemail(String orderemail) {
		this.orderemail = orderemail;
	}

	public orders() {
		super();
		// TODO Auto-generated constructor stub
	}

	public orders(int id, String ordername, String orderemail) {
		super();
		this.orderid = id;
		this.ordername = ordername;
		this.orderemail = orderemail;
	}
	
	

}
