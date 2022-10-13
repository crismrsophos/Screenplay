package com.sophossolutions.certificacion.pages;

import com.sophossolutions.certificacion.actions.Action;
import com.sophossolutions.certificacion.utilities.GetTarget;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class AutomationShoppingPage extends PageObject {

	By btnCheckout = By.xpath("//*[text()='Proceed to checkout']");
	By email = By.id("email");
	By password = By.id("passwd");
	By btnSign = By.id("SubmitLogin");
	By btnAgree = By.id("cgv");
	By btnCheckoutShipping = By.name("processCarrier");
	By btnProceedToCheckOut = By.name("processAddress");
	By totalPrice = By.id("total_price");

	public void clicCheckout() {
		Action.clicTo(getDriver(), btnCheckout);
	}

	public void login(String user, String passw, String app) {
		Action.setText(getDriver(), GetTarget.ofApp(app).get(0), user);
		Action.setText(getDriver(), GetTarget.ofApp(app).get(1), passw);
		Action.clicTo(getDriver(), GetTarget.ofApp(app).get(2));
	}

	public void clicCheckoutA() {
		Action.clicTo(getDriver(), btnProceedToCheckOut);
	}

	public void clicAgree() {
		Action.clicTo(getDriver(), btnAgree);
		Action.clicTo(getDriver(), btnCheckoutShipping);
	}

	public void comparison(String total) {
		Action.validateTextOfField(getDriver(), totalPrice, total);
	}

	public void shippingTShirt(String email, String password, String app) {
		clicCheckout();
		login(email, password, app);
		clicCheckoutA();
		clicAgree();
	}
}
