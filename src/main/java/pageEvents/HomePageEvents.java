package main.java.pageEvents;

import static test.java.BaseTest.driver;

import org.openqa.selenium.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import main.java.pageObjects.HomePageElements;
import main.java.utils.ElementFetch;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.java.BaseTest;

import static test.java.BaseTest.driver;

public class HomePageEvents {
<<<<<<< HEAD


    public void clickOnMenu() {
=======
	//Test cases
    public void clickOnMenu() { 
>>>>>>> testCasesAddedTogether
		ElementFetch elementFetch = new ElementFetch();
		BaseTest.logger.info("Clicking the menu icon");//The specific test info for the report
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);//Declare and initialise a fluent wait
		wait.pollingEvery(500,  TimeUnit.MILLISECONDS); //Here we specify the timeout of the wait
		wait.withTimeout(10, TimeUnit.SECONDS); //We specify the polling time
		
		wait.ignoring(NoSuchElementException.class);//Here we specify what exceptions to ignore
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageElements.signInButton))); //Here is where we specify the condition to wait on
		elementFetch.getWebElement("XPATH", HomePageElements.signInButton).click();
	}

	public void clickOnSearch() {
		ElementFetch elementFetch = new ElementFetch();
		BaseTest.logger.info("Clicking the search button");
		elementFetch.getWebElement("XPATH", HomePageElements.searchButton).click();
	}

	public void searchItem() {
		BaseTest.logger.info("Entering Item for Search");
		String item = "Laptop";

		WebDriverWait wait = new WebDriverWait(driver, 20);
		ElementFetch elementFetch = new ElementFetch();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageElements.searchBar)));
		elementFetch.getWebElement("XPATH", HomePageElements.searchBar).sendKeys(item);
		elementFetch.getWebElement("XPATH", HomePageElements.searchBar).sendKeys(Keys.ENTER);
	}

}
