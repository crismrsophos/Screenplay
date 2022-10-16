package com.sophossolutions.certificacion.models;

public class Registration {

    private String name;
    private String phone;
    private String email;
    private String country;
    private String city;
    private String user;
    private String password;

    public Registration(String name, String phone, String email, String country, String city,
                        String user, String password) {
        super();
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.country = country;
        this.city = city;
        this.user = user;
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

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

}
