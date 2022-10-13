package com.sophossolutions.certificacion.pages;

import com.sophossolutions.certificacion.actions.Action;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class WayToAutomationHomePage extends PageObject {


	By registrationSection = By.xpath("//a[text()='Registration']");

	public void clicRegistrationImage() {
		Action.clicTo(getDriver(), registrationSection);
	}


}
