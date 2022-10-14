package com.sophossolutions.certificacion.pages;

import org.openqa.selenium.By;

import com.sophossolutions.certificacion.actions.Action;

import net.serenitybdd.core.pages.PageObject;

public class GuruNewCustomerPage extends PageObject{

	By customerName = By.name("name");
	By radioBtnGender = By.xpath("//*[@value='m']");
	By dateOfBirth = By.name("dob");
	By address = By.name("addr");
	By city = By.name("city");
	By state = By.name("state");
	By pin = By.name("pinno");
	By mobileNumber = By.name("telephoneno");
	By eMail = By.name("emailid");
	By password = By.name("password");
	By btnSubmit  = By.xpath("//*[@value='Submit']");
	By mensajeExito = By.xpath("//*[@class='heading3']");
	
	By btnCloseSpam = By.xpath("//*[text()='Close']");
	By btnCloseSpam2 = By.id("dismiss-button");
	By idFrame = By.id("google_ads_iframe_/24132379/INTERSTITIAL_DemoGuru99_0");
	private final String ID_IFRAME = "google_ads_iframe_/24132379/INTERSTITIAL_DemoGuru99_0";
	private final Long FIVE = 5L;

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
	
	public void closePublicity () {
		if (Action.waitForElement(getDriver(), idFrame, FIVE)) {
			Action.switchToFrame(getDriver(), ID_IFRAME, FIVE);
			//By x = By.name("ad_iframe");
			String x1 = "ad_iframe";

			if (Action.waitForElement(getDriver(), btnCloseSpam, FIVE)) {
				Action.clicTo(getDriver(), btnCloseSpam);
			} else {
				Action.switchToFrame(getDriver(), x1, FIVE);
				Action.clicTo(getDriver(), btnCloseSpam2);
			}
			getDriver().switchTo().defaultContent();
		}
	}

	public void validateText(String message) {
		Action.validateTextOfField(getDriver(), mensajeExito, message);
	}

}
