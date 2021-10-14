package main.java.pageObjects;

import test.java.BaseTest;

public interface HomePageElements {
	//Identifiers
    String signInButton = "//*[@id='menuUser']";
	String homeButton = "/html/body/div[3]/nav/a[1]";
<<<<<<< HEAD
    String searchButton = "//*[@id='menuSearch']";
    String searchBar ="//*[@id='autoComplete']";

    //String newAccountButton = "/html/body/login-modal/div/div/div[3]/a[2]";
    //String speakersCategory = "//*[@id='speakersImg']";
    //String tabletsCategory = "//*[@id='tabletsImg']";
=======
	String loader = "/html/body/div[2]";
	String userAccountName = "//*[@id=\'menuUserLink\']/span[contains(text(), '"+BaseTest.excelPropertyLoader.getValue("username")+"')] ";
>>>>>>> testCasesAddedTogether
}