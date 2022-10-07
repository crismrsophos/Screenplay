package com.sophossolutions.certificacion.actions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Action {

    public static void navegateToUrl(WebDriver driver, String url) {
        driver.navigate().to(url);
    }

    public static void setText(WebDriver driver, By target, String text) {
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

    public static Boolean waitForElement(WebDriver driver, By target, long seconds) {

        try {
            waitFor(driver, Duration.ofSeconds(seconds)).until(ExpectedConditions.or(
                    ExpectedConditions.elementToBeClickable(target),
                    ExpectedConditions.presenceOfElementLocated(target)
            ));
            return Boolean.TRUE;
        } catch (Exception e) {
            return Boolean.FALSE;
        }
    }

    public static WebDriverWait waitFor(WebDriver driver, Duration seconds) {
        return new WebDriverWait(driver, seconds);
    }

    public static void switchToFrame(WebDriver driver, String target, long seconds) {
        waitFor(driver, Duration.ofSeconds(seconds));
        driver.switchTo().frame(target);
    }

    public static void switchToFrameAndClick(WebDriver driver, By target, By target2, long seconds) {
        try {
            if (waitForElement(driver, target, seconds)) {
                //switchToFrame(driver, target, seconds);
                clicTo(driver, target2);
            }
        } catch (Exception e) {

        }
    }


}
