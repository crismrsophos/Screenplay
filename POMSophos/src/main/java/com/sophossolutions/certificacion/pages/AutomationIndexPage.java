package com.sophossolutions.certificacion.pages;

import org.openqa.selenium.By;

import com.sophossolutions.certificacion.actions.Action;

import net.serenitybdd.core.pages.PageObject;

public class AutomationIndexPage extends PageObject {

	By btnTshirt = By.xpath("//*[@id='block_top_menu']/ul/li/a[text() = 'T-shirts']");

	public void clicTshirt() {
		Action.clicTo(getDriver(), btnTshirt);
	}

}
