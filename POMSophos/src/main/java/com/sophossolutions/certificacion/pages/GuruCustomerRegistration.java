package com.sophossolutions.certificacion.pages;

import com.sophossolutions.certificacion.actions.Action;
import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;

public class GuruCustomerRegistration extends PageObject {

    By title = By.xpath("//*[text()='Customer Registered Successfully!!!']");

    public void validateText(String pTitle) {

        Action.validateTextOfField(getDriver(), title, pTitle);

    }

}
