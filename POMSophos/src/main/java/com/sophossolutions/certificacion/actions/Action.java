package com.sophossolutions.certificacion.actions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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

	public static void getWindows(WebDriver driver){
		Set <String> handles = driver.getWindowHandles();
		for (String windowHandle : handles) {
			if (!windowHandle.equals(driver.getWindowHandle())) {
				driver.switchTo().window(windowHandle);
			}
		}
	}

	public static void recorrer(WebDriver driver){
		List <WebElement> botones = driver.findElements(By.cssSelector("div.inventory_item_price"));
		List <String> precios = new ArrayList<String>();
		List <String> reemplazos = new ArrayList<String>();
		List <Float> valores = new ArrayList<Float>();
		List <By> btnToClick = new ArrayList<By>();
		int count = 0;

		for (WebElement boton : botones){
			precios.add(boton.getText());
		}

		int r = 1;
		for(int i = 0; i < precios.size(); i++){
			reemplazos.add(precios.get(i).replace("$", ""));
			valores.add(Float.parseFloat(reemplazos.get(i)));
			if(valores.get(i) < 20){
				btnToClick.add(By.xpath("(//*[@class='btn btn_primary btn_small btn_inventory'])["+r+"]"));
			}
			r = r +1;
		}

		for(int j = btnToClick.size() -1; j >= 0; j--){
			System.out.println(btnToClick.get(j));
			clicTo(driver, btnToClick.get(j));
		}

	}

}
