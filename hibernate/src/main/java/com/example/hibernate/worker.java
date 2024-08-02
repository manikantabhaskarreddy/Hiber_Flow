package com.example.hibernate;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "worker")
public class worker {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "name")
	private String name;
	
//	@Pattern("regexp")
	
	private String email;
	
	private String password;
	
	private long phno;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	public worker(int id, String name, String email, String password, long phno) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.phno = phno;
	}

	public worker() {
		super();
		// TODO Auto-generated constructor stub
	}
	
//	private orders ord;

}
