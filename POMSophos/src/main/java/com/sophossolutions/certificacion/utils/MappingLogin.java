package com.sophossolutions.certificacion.utils;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;

public class MappingLogin {

    public static List<By> guruFields() {
        By username = By.name("uid");
        By password = By.name("password");
        By btnLogin = By.xpath("//*[@value='LOGIN']");
        return addFields(username, password, btnLogin);
    }

    public static List<By> automationFields() {
        By emailAddress = By.id("email");
        By password = By.id("passwd");
        By btnSignIn2 = By.id("SubmitLogin");
        return addFields(emailAddress, password, btnSignIn2);
    }

    private static List<By> addFields(By... by) {
        List<By> fields = new ArrayList<By>();
        fields.add(by[0]);
        fields.add(by[1]);
        fields.add(by[2]);
        return fields;
    }

    public static List<By> sauceFields() {
        By userName = By.id("user-name");
        By password = By.id("password");
        By btnLogin = By.id("login-button");
        return addFields(userName, password, btnLogin);
    }
}

