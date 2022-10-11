package com.sophossolutions.certificacion.pages;

import com.sophossolutions.certificacion.actions.Action;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class AutomationTshirtPage extends PageObject {

	By tShirtColorOrange = By.xpath("//*[@id='color_1']");
	By tShirtColorBlue = By.xpath("//*[@id='color_2']");

	public void clicColor(String color) {
		if (color.equals("Orange")) {
			Action.clicTo(getDriver(), tShirtColorOrange);
		} else {
			Action.clicTo(getDriver(), tShirtColorBlue);
		}
	}

}
