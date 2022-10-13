package com.sophossolutions.certificacion.models;

public class Cliente {

	private String firstName;
	private String lastName;
	private String postalCode;

	public Cliente (String firstName, String lastName, String postalCode){
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.postalCode = postalCode;
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
