package main.java.pageEvents;

import static test.java.BaseTest.driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;

import main.java.pageObjects.ItemPageElements;
import main.java.pageObjects.CheckoutPageElements;
import main.java.pageObjects.HomePageElements;
import main.java.pageObjects.RegisterPageElements;
import main.java.utils.Constants;
import main.java.utils.ElementFetch;
import main.java.utils.ExcelPropertyLoader;
import test.java.BaseTest;

public class ItemPageEvents {
	
	public void clickOnSearch() {
		
		//When we click the search icon
		BaseTest.logger.info("Click the search icon");		
		ElementFetch elementFetch = new ElementFetch();
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.pollingEvery(250,  TimeUnit.MILLISECONDS);
		wait.withTimeout(10, TimeUnit.SECONDS);
		
		wait.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(HomePageElements.loader)));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ItemPageElements.search)));
		elementFetch.getWebElement("XPATH", ItemPageElements.search).click();      
		
	}
	
	public void searchingItems() {
		
		//Entering the name of product to search
		BaseTest.logger.info("Enter the name of product");
		
		ElementFetch elementFetch = new ElementFetch();
	
		ExcelPropertyLoader excelPropertyLoader = new ExcelPropertyLoader();
		excelPropertyLoader.LoadFile(Constants.ExcleFilePath);
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.pollingEvery(500,  TimeUnit.MILLISECONDS);
		wait.withTimeout(10, TimeUnit.SECONDS);
		
		wait.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(HomePageElements.loader)));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ItemPageElements.inSearchBox)));
		elementFetch.getWebElement("XPATH", ItemPageElements.inSearchBox).sendKeys(BaseTest.excelPropertyLoader.getValue("item"));
		
		
		
	}

    public void clickOnItem() {
    	//Clicking on the product to see the details
    	BaseTest.logger.info("See Product Details");
        
    	ElementFetch elementFetch = new ElementFetch();
		
    	FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.pollingEvery(250,  TimeUnit.MILLISECONDS);
		wait.withTimeout(10, TimeUnit.SECONDS);
		
		wait.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(HomePageElements.loader)));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ItemPageElements.itemToAdd)));    		
		elementFetch.getWebElement("XPATH", ItemPageElements.itemToAdd).click();
    }
    public void clickOnAddMore() {
    	//Selecting the quantity of the product
    	BaseTest.logger.info("Select Quantity");
        
    	ElementFetch elementFetch = new ElementFetch();
		
    	FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.pollingEvery(250,  TimeUnit.MILLISECONDS);
		wait.withTimeout(10, TimeUnit.SECONDS);
		
		wait.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ItemPageElements.addMoreItems)));    		
		elementFetch.getWebElement("XPATH", ItemPageElements.addMoreItems).click();
    }
    public void clickOnAddToCart() {
    	//Add product to cart
    	BaseTest.logger.info("Add to Cart");   
    	ElementFetch elementFetch = new ElementFetch();	
    	FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.pollingEvery(250,  TimeUnit.MILLISECONDS);
		wait.withTimeout(10, TimeUnit.SECONDS);
		
		wait.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ItemPageElements.addToCart)));    		
		elementFetch.getWebElement("XPATH", ItemPageElements.addToCart).click();
		
    }

}