package com.sophossolutions.certificacion.pages;

import com.sophossolutions.certificacion.actions.Action;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

import java.time.Duration;

public class AutomationTshirtPage extends PageObject {

	By tShirtColorOrange = By.xpath("//*[@id='color_1']");
	By tShirtColorBlue = By.xpath("//*[@id='color_2']");
	Long duracion = 5L;

	public void clicColor(String color) {
		if (color.equals("Orange")) {
			Action.clicTo(getDriver(), tShirtColorOrange);
			Action.waitForElement(getDriver(), tShirtColorOrange, duracion);
			Action.clicTo(getDriver(), tShirtColorOrange);
		} else {
			Action.clicTo(getDriver(), tShirtColorBlue);
			Action.waitForElement(getDriver(), tShirtColorBlue, duracion);
			Action.clicTo(getDriver(), tShirtColorBlue);
		}
	}

}
