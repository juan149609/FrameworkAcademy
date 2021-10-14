package test.java;

<<<<<<< HEAD
import main.java.pageEvents.*;
=======
import main.java.pageEvents.CheckoutPageEvents;
import main.java.pageEvents.HomePageEvents;
import main.java.pageEvents.ItemPageEvents;
import main.java.pageEvents.MenuPageEvents;
import main.java.pageEvents.PaymentPageEvents;
import main.java.pageEvents.RegisterPageEvents;
>>>>>>> testCasesAddedTogether

import org.testng.annotations.Test;

public class SampleTest extends BaseTest {
	
	//Full Test Cases
   @Test
<<<<<<< HEAD
    public void fullTestMethod() {
       HomePageEvents homePageEvents = new HomePageEvents();
       ItemPageEvents itemPageEvents = new ItemPageEvents();
//        homePageEvents.clickOnMenu();
//
//        /*MenuPageEvents menuPageEvents = new MenuPageEvents();
//        menuPageEvents.onModalOpen();
//
//        RegisterPageEvents registerPageEvents = new RegisterPageEvents();
//        registerPageEvents.registerForm();
//        registerPageEvents.clickOnRegister();
//        registerPageEvents.validateRegister();*/
//
//        CheckoutPageEvents checkoutPageEvents = new CheckoutPageEvents();
//        checkoutPageEvents.loginMethod();
//        checkoutPageEvents.clickOnCart();
//        checkoutPageEvents.clickOnCheckout();
//        checkoutPageEvents.clickOnNext();
//
//        PaymentPageEvents paymentPageEvents = new PaymentPageEvents();
//        paymentPageEvents.paymentSelection();
//        paymentPageEvents.paymentUserAndPass();
//        paymentPageEvents.clickOnPayButton();

       homePageEvents.clickOnSearch();
       homePageEvents.searchItem();
       itemPageEvents.clickOnExit();
       itemPageEvents.selectItem();
       itemPageEvents.addToTheCart();
=======
    public void fullTestMethod() { 
    	HomePageEvents homePageEvents = new HomePageEvents();
        homePageEvents.clickOnMenu();
        
        MenuPageEvents menuPageEvents = new MenuPageEvents();
        menuPageEvents.onModalOpen();
        
        RegisterPageEvents registerPageEvents = new RegisterPageEvents();
        registerPageEvents.registerForm();
        registerPageEvents.clickOnRegister();    
        registerPageEvents.validateRegister();
        
        ItemPageEvents ItemPageEvents = new ItemPageEvents();
        ItemPageEvents.clickOnSearch();
        ItemPageEvents.searchingItems();
        ItemPageEvents.clickOnItem();      
        ItemPageEvents.clickOnAddMore();
        ItemPageEvents.clickOnAddToCart();
        
        
        CheckoutPageEvents checkoutPageEvents = new CheckoutPageEvents();
        checkoutPageEvents.clickOnCart();
        checkoutPageEvents.clickOnCheckout();
        checkoutPageEvents.clickOnNext();
        
        PaymentPageEvents paymentPageEvents = new PaymentPageEvents();
        //paymentPageEvents.paymentSelection();
        paymentPageEvents.paymentUserAndPass();
        paymentPageEvents.clickOnPayButton();
        paymentPageEvents.validatingOrder();
>>>>>>> testCasesAddedTogether
    }
    
}

