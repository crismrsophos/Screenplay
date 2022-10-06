package com.sophossolutions.certificacion.pages;

import org.openqa.selenium.By;

import com.sophossolutions.certificacion.actions.Action;

import net.serenitybdd.core.pages.PageObject;

public class GuruValidation extends PageObject{

    By title = By.xpath("//*[text()='Customer Registered Successfully!!!']");

    public void validateText(String message) {
        Action.validateTextOfField(getDriver(), title, message);
    }

}
