package com.sophossolutions.certificacion.models;

public class Usuario {

	private String name;
	private String phone;
	private String email;
	private String country;
	private String city;
	private String username;
	private String password;

	public Usuario(String name, String phone, String email, String country, String city, String username, String password) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.country = country;
		this.city = city;
		this.username = username;
		this.password = password;
	}
	
	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	public String getCountry() {
		return country;
	}

	public String getCity() {
		return city;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}
}
