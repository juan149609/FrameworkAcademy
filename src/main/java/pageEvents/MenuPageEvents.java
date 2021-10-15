package main.java.pageEvents;

import static test.java.BaseTest.driver;

import org.openqa.selenium.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import main.java.pageObjects.MenuPageElements;
import main.java.utils.ElementFetch;
import test.java.BaseTest;

public class MenuPageEvents {
	
	public void onModalOpen() {
		ElementFetch elementFetch = new ElementFetch();
		BaseTest.logger.info("Click on Create New Account");
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.pollingEvery(250,  TimeUnit.MILLISECONDS);
		wait.withTimeout(10, TimeUnit.SECONDS);
		
		wait.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(MenuPageElements.createNewAccount)));
		
		elementFetch.getWebElement("XPATH", MenuPageElements.createNewAccount).click();
	}

}