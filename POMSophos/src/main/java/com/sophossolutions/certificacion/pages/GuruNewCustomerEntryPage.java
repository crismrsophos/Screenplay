package com.sophossolutions.certificacion.pages;

import com.sophossolutions.certificacion.actions.Action;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class GuruNewCustomerEntryPage extends PageObject {

    By customerName = By.name("name");
    By gender = By.xpath("//*[@value='m']");
    By dateOfBirth = By.id("dob");
    By address = By.name("addr");
    By city = By.name("city");
    By state = By.name("state");
    By pin = By.name("pinno");
    By mobileNumber = By.name("telephoneno");
    By email = By.name("emailid");
    By password = By.name("password");
    By btnSubmit = By.xpath("//*[@value='Submit']");

    By btnCloseSpam = By.xpath("//*[text()='close']");

    public void entryNewCustomer (String pCustomerName, String pGender, String pDateOfBirth, String pAddress, String pCity,
                                  String pState, String pPin, String pMobileNumber, String pEmail, String pPassword) {
        //Action.clicTo(getDriver(), btnCloseSpam); //Se agrega esta línea para clicar "close" en el aviso-spam de la página
        Action.setText(getDriver(), customerName, pCustomerName);
        Action.clicTo(getDriver(), gender);
        Action.setText(getDriver(), dateOfBirth, pDateOfBirth);
        Action.setText(getDriver(), address, pAddress);
        Action.setText(getDriver(), city, pCity);
        Action.setText(getDriver(), state, pState);
        Action.setText(getDriver(), pin, pPin);
        Action.setText(getDriver(), mobileNumber, pMobileNumber);
        Action.setText(getDriver(), email, pEmail);
        Action.setText(getDriver(), password, pPassword);
        Action.clicTo(getDriver(), btnSubmit);

    }
}
