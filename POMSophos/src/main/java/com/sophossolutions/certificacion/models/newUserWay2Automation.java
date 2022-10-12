package com.sophossolutions.certificacion.models;

public class newUserWay2Automation {

    private  String section;
    private String name;
    private String phone;
    private String email;
    private String country;
    private String city;
    private String username;
    private String password;

    public newUserWay2Automation(String _section, String _name, String _phone, String _email, String _country, String _city, String _username, String _password) {
        super();
        section = _section;
        name = _name;
        phone = _phone;
        email = _email;
        country = _country;
        city = _city;
        username = _username;
        password = _password;
    }

    public String getSection() {
        return section;
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
