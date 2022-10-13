package com.sophossolutions.certificacion.pages;

import com.sophossolutions.certificacion.actions.Action;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class AutomationSelectionPage extends PageObject {

	By btnQuantity = By.xpath("//*[@id='quantity_wanted_p']/a[2]/span");
	By quantityField = By.id("quantity_wanted");
	By btnSizeList = By.id("uniform-group_1");
	String sizeSelector = "//*[@title='%s']";
	By btnSizeValue;
	By btnAddToCart = By.xpath("//*[text()='Add to cart']");
	By btnCheckout = By.xpath("//*[@title='Proceed to checkout']");

	public void selectQuantity(String quantity) {
		//int i = Integer.parseInt(quantity);
		//for (int j = 1; j < i; j++) {
		//	Action.clicTo(getDriver(), btnQuantity);
		//}
		Action.setText(getDriver(), quantityField, quantity);
	}

	public void selectSize(String size) {
		Action.clicTo(getDriver(), btnSizeList);
		btnSizeValue = By.xpath(String.format(sizeSelector, size));
		Action.clicTo(getDriver(), btnSizeValue);
	}

	public void procedToCheckout() {
		Action.clicTo(getDriver(), btnAddToCart);
		if (Action.waitForVisibility(getDriver(), btnCheckout, 6)) {
			Action.clicTo(getDriver(), btnCheckout);
		}
	}

	public void theTShirt(String quantity, String size) {
		selectQuantity(quantity);
		selectSize(size);
		procedToCheckout();
	}

}
