package com.sophossolutions.certificacion.pages;

import com.sophossolutions.certificacion.actions.Action;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class GuruNewCustomerPage extends PageObject{

	//By addCustomer = By.xpath("//a[text()='Manager']");
	By customerName = By.xpath("//*[@type='text'][@name='name']");
	By radioBtnGender = By.xpath("//*[@type='radio'][@name='rad1'][@value='m']");
	By dateOfBirth = By.xpath("//*[@type='date'][@name='dob']");
	By address = By.xpath("//*[@name='addr']");
	By city = By.xpath("//*[@type='text'][@name='city']");
	By state = By.xpath("//*[@type='text'][@name='state']");
	By pin = By.xpath("//*[@type='text'][@name='pinno']");
	By mobileNumber = By.xpath("//*[@type='text'][@name='telephoneno']");
	By eMail = By.xpath("//*[@type='text'][@name='emailid']");
	By password = By.xpath("//*[@type='password'][@name='password']");
	By btnSubmit  = By.xpath("//*[@type='submit'][@name='sub']");
	By mensajeExito = By.xpath("//*[@class='heading3']");

	public void goToUrl(String url) {
		Action.navegateToUrl(getDriver(), url);
	}
	
	public void newCustomer(String _customerName, String _dateOfBirth, String _address,
							String _city, String _state, String _pin, String _mobileNumber, String _eMail,
							String _password) {
		Action.setText(getDriver(), customerName, _customerName);
		Action.clicTo(getDriver(), radioBtnGender);
		Action.setText(getDriver(), dateOfBirth, _dateOfBirth);
		Action.setText(getDriver(), address, _address);
		Action.setText(getDriver(), city, _city);
		Action.setText(getDriver(), state, _state);
		Action.setText(getDriver(), pin, _pin);
		Action.setText(getDriver(), mobileNumber, _mobileNumber);
		Action.setText(getDriver(), eMail, _eMail);
		Action.setText(getDriver(), password, _password);
		Action.clicTo(getDriver(), btnSubmit);
	}

	public void validateText(String message) {
		Action.validateTextOfField(getDriver(), mensajeExito, message);
	}

}
