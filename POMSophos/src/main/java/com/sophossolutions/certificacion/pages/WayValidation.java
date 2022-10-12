package com.sophossolutions.certificacion.pages;

import io.cucumber.java.en_old.Ac;
import org.openqa.selenium.By;

import com.sophossolutions.certificacion.actions.Action;

import net.serenitybdd.core.pages.PageObject;

public class WayValidation extends PageObject{

    By name = By.name("name");
    By phone = By.name("phone");
    By email = By.name("email");
    By country = By.name("country");
    By city = By.name("city");
    By userName = By.name("username");
    By password = By.name("password");

    public void registrateUser(String name, String phone, String email, String country, String city,
                               String userName, String password){
        Action.setText(getDriver(),this.name,name);
        Action.setText(getDriver(),this.phone,phone);
        Action.setText(getDriver(),this.email,email);
        Action.setText(getDriver(),this.country,country);
        Action.setText(getDriver(),this.city,city);
        Action.setText(getDriver(),this.userName,userName);
        Action.setText(getDriver(),this.password,password);

    }
}
