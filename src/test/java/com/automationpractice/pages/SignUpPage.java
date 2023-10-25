package com.automationpractice.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends BasePage{

//#################################################################################
//            Constructor for the SignUpPage class
// ################################################################################
//
    public SignUpPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
//  *******************************************************************************

@FindBy(css ="#name[value]")
    WebElement userName;
@FindBy(css = "#email[value]")
WebElement userEMail;


    public void nameFieldVerification(){
        System.out.println(userName.getAttribute("value"));
        String uName = "Alex Flame";
        String uEMail = "alexflame2005@gmail.com";
        System.out.println("===And== "+userEMail.getAttribute("value"));
        Assert.assertTrue((userName.getAttribute("value")).equals(uName) & (userEMail.getAttribute("value")).equals(uEMail));
    }

}

