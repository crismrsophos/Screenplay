package com.sophossolutions.certificacion.models;

public class SauceLabsInfo {

    private String userName;
    private String password;
    private String maxValue;


    public SauceLabsInfo(String _UserName, String _Password, String _MaxValue) {
        super();
        userName = _UserName;
        password = _Password;
        maxValue = _MaxValue;


    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getMaxValue() {
        return maxValue;
    }
}
