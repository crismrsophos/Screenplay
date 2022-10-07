package com.sophossolutions.certificacion.pages;

import com.sophossolutions.certificacion.actions.Action;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class GuruNewCustomerPage extends PageObject {

    By name = By.name("name");
    By gender =  By.xpath("//*[@value='m']");
    By date = By.name("dob");
    By address = By.name("addr");
    By city = By.name("city");
    By state = By.name("state");
    By pin = By.name("pinno");
    By mobile = By.name("telephoneno");
    By email = By.name("emailid");
    By password = By.name("password");
    By btnSubmit = By.xpath("//*[@value='Submit']");

    public void goToUrl(String url) {
        Action.navegateToUrl(getDriver(), url);
    }

    public void newCustomerGuru(String name,String gender, String date, String address, String city,
                                String state, String pin, String mobile, String email, String password) {
        Action.setText(getDriver(), this.name, name);
        Action.setText(getDriver(), this.gender, gender);
        Action.setText(getDriver(), this.date, date);
        Action.setText(getDriver(), this.address, address);
        Action.setText(getDriver(), this.city, city);
        Action.setText(getDriver(), this.state, state);
        Action.setText(getDriver(), this.pin, pin);
        Action.setText(getDriver(), this.mobile, mobile);
        Action.setText(getDriver(), this.email, email);
        Action.setText(getDriver(), this.password, password);
        Action.clicTo(getDriver(), btnSubmit);
    }

}

