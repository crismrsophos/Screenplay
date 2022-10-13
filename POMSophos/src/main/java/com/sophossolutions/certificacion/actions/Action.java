package com.sophossolutions.certificacion.actions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Action {

	public static void navegateToUrl(WebDriver driver, String url) {
		driver.navigate().to(url);
	}

	public static void setText(WebDriver driver, By target, String text) {
		driver.findElement(target).clear();
		driver.findElement(target).sendKeys(text);
	}

	public static void clicTo(WebDriver driver, By target) {
		driver.findElement(target).click();
	}

	public static void validateTextOfField(WebDriver driver, By target, String message) {
		String getMessage = driver.findElement(target).getText();
		Assert.assertTrue("El valor esperado: \"" + message + "\", no es igual al obtenido: \"" + getMessage + "\"",
				getMessage.equals(message));
	}

	public static Boolean waitForVisibility(WebDriver driver, By target, long seconds) {
		try {
			waitFor(driver, Duration.ofSeconds(seconds))
					.until(ExpectedConditions.or(ExpectedConditions.visibilityOfElementLocated(target)));
			return Boolean.TRUE;
		} catch (Exception e) {
			return Boolean.FALSE;
		}
	}

	public static WebDriverWait waitFor(WebDriver driver, Duration seconds) {
		return new WebDriverWait(driver, seconds);
	}

	public static Boolean waitForElement(WebDriver driver, By target, long seconds) {
		try {
			waitFor(driver, Duration.ofSeconds(seconds))
					.until(ExpectedConditions.or(ExpectedConditions.elementToBeClickable(target),
							ExpectedConditions.presenceOfElementLocated(target)));
			return Boolean.TRUE;
		} catch (Exception e) {
			return Boolean.FALSE;
		}
	}

	public static void switchToFrame(WebDriver driver, String target, long seconds) {
		waitFor(driver, Duration.ofSeconds(seconds));
		driver.switchTo().frame(target);
	}

	public static float getNumberOfField(WebDriver driver, By target) {
		return Float.parseFloat(driver.findElement(target).getText());
	}

	public static void moveToNewWindow(WebDriver driver) {
		String currentWindow = driver.getWindowHandle();
		ArrayList<String> allWindows = new ArrayList<>(driver.getWindowHandles());
		allWindows.remove(currentWindow);
		driver.switchTo().window(allWindows.get(0));
	}
	//List<WebElement> listProductsWithValueUnderOf
	public static void selectProductsWithValueUnderOf (WebDriver driver, By target, String strBtnAddToCart, String maxValue) {

		List<WebElement> productList = new ArrayList<>();
		List<WebElement> productListUnderValueOF = new ArrayList<>();
		List<Integer> xpathProductPosition = new ArrayList<>();

		productList = driver.findElements(target);

		for (int i = 0; i < productList.size(); i ++) {
			if (Float.parseFloat(productList.get(i).getText().replace("$", "").replace("ADD TO CART", "")) < Float.parseFloat(maxValue)) {
				productListUnderValueOF.add(productList.get(i));
				xpathProductPosition.add(i+1);
			}
		}

		for (int i = 0; i < productListUnderValueOF.size(); i ++) {
			By btnAddToCart;
			Integer newProductPosition;
			newProductPosition = xpathProductPosition.get(i) - i;
			btnAddToCart = By.xpath(String.format(strBtnAddToCart, newProductPosition.toString()));
			clicTo(driver, btnAddToCart);

		}


	}


}
