package com.sophossolutions.certificacion.models;

public class Cliente {

    private String firstName;
    private String lastName;
    private String postalCode;
    private String maxValue;

    public Cliente(String firstName, String lastName, String postalCode, String maxValue) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.postalCode = postalCode;
        this.maxValue = maxValue;
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

    public String getMaxValue() {
        return maxValue;
    }
}
