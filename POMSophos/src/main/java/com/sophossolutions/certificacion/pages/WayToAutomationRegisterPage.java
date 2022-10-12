package com.sophossolutions.certificacion.pages;

import com.sophossolutions.certificacion.actions.Action;
import com.sophossolutions.certificacion.models.newUserWay2Automation;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class WayToAutomationRegisterPage extends PageObject {

    By nameField = By.name("name");
    By phoneField = By.name("phone");
    By emailField = By.name("email");
    By countryField = By.name("country");
    By country = By.xpath("//*[@value='Colombia']"); //PDTE mejorar
    By cityField = By.name("city");
    By userNameField = By.xpath("//*[@id='load_box']//*[@name='username']");
    By passwordField = By.xpath("//*[@id='load_box']//*[@name='password']");

    By btnSubmit = By.xpath("//*[@id='load_box']//*[@value='Submit']");

    By alertMessage = By.id("alert");

    public void setInformationAndSubmit(newUserWay2Automation newUserInfo) {
        Action.setText(getDriver(), nameField, newUserInfo.getName());
        Action.setText(getDriver(), phoneField, newUserInfo.getPhone());
        Action.setText(getDriver(), emailField, newUserInfo.getEmail());
        Action.clicTo(getDriver(), countryField);
        Action.clicTo(getDriver(), country);
        Action.setText(getDriver(), cityField, newUserInfo.getCity());
        Action.setText(getDriver(), userNameField, newUserInfo.getUsername());
        Action.setText(getDriver(), passwordField, newUserInfo.getPassword());
        Action.clicTo(getDriver(), btnSubmit);
    }
    public void validateText(String message) {
        Action.waitForVisibility(getDriver(),alertMessage, 5);
        Action.validateTextOfField(getDriver(), alertMessage, message);
    }
}
