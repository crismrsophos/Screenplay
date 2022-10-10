package com.sophossolutions.certificacion.pages;

import com.sophossolutions.certificacion.actions.Action;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class AutomationBuyProceedPage extends PageObject {

	By btnCheckout = By.xpath("//*[text()='Proceed to checkout']");

	By email = By.id("email");
	By password = By.id("passwd");
	By btnSign = By.id("SubmitLogin");
	By btnAgree = By.id("cgv");

	By btnProceedToCheckOut = By.xpath("//*[@class='button btn btn-default standard-checkout button-medium']");

	By totalPrice = By.id("total_price");

	public void clicCheckout() {
		Action.clicTo(getDriver(), btnCheckout);
	}

	public void signAutomation(String email, String password) {
		Action.setText(getDriver(), this.email, email);
		Action.setText(getDriver(), this.password, password);
		Action.clicTo(getDriver(), btnSign);
	}

	public void clicCheckoutA() {
		Action.clicTo(getDriver(), btnProceedToCheckOut);
	}

	public void clicAgree() {
		Action.clicTo(getDriver(), btnAgree);
		Action.clicTo(getDriver(), btnProceedToCheckOut);
	}

	public void comparation(String total) {
		Action.validateTextOfField(getDriver(), totalPrice, total);
	}

	public void shippingTShirt(String email, String password) {
		clicCheckout();
		signAutomation(email, password);
		clicCheckoutA();
		clicAgree();
	}
}
