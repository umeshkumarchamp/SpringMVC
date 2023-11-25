package com.springmvc.model;

public class Employee {

	private String name;
	private String email;
	private String username;
	private String password;
	private Long contact;

	public Employee() {
		super();
	}

	public Employee(String name, String email, String username, String password, Long contact) {
		super();
		this.name = name;
		this.email = email;
		this.username = username;
		this.password = password;
		this.contact = contact;
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getContact() {
		return contact;
	}

	public void setContact(Long contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", email=" + email + ", username=" + username + ", password=" + password
				+ ", contact=" + contact + "]";
	}

}
