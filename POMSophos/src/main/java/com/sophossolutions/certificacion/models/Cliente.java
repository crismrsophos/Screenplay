package com.sophossolutions.certificacion.models;

public class Cliente {

	private String user;
	private String passwd;
	private String firstName;
	private String lastName;
	private String postalCode;

	public Cliente (String user, String passwd, String firstName, String lastName, String postalCode){
		super();
		this.user = user;
		this.passwd = passwd;
		this.firstName = firstName;
		this.lastName = lastName;
		this.postalCode = postalCode;
	}

	public String getUser() {
		return user;
	}

	public String getPassword() {
		return passwd;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPostalCode() {
		return postalCode;
	}
}
