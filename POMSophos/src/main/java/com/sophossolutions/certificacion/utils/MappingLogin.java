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

    public static List<By> sauceDemoFields() {

        By userName = By.id("user-name");
        By password = By.id("password");
        By btnLogin = By.id("login-button");
        return addFields(userName, password, btnLogin);
    }

    private static List<By> addFields(By... by) {
        List<By> fields = new ArrayList<By>();
        for (int i = 0; i < by.length; i++) {
            fields.add(by[i]);
        }

        return fields;
    }

}
