package com.automationpractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.*;

public class HomePage extends BasePage{


//#################################################################################
//            Constructor for the HomePage class
// ################################################################################
    //
    public HomePage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
//  *******************************************************************************


    @FindBy(css ="a[href='/login']")
    private WebElement signupLogin;
//#################################################################################
//            Method for navigate to HomePage
// ################################################################################
    //
    public LoginPage clickOnLoginLink ()  {
            connectToMySQLDB();
        String homePageTitle = driver.getTitle();
        signupLogin.click();
        return new LoginPage(driver);
    }
//  *******************************************************************************


}
