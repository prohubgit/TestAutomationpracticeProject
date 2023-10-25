package com.automationpractice.pages;

import lombok.experimental.FieldNameConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


//#################################################################################
//            Constructor for the LoginPage
// ################################################################################
//
public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
//  *******************************************************************************

    @FindBy(css = "input[placeholder='Name']")
    private WebElement userName;

//#################################################################################
//            Method for Enter User Name
// ################################################################################
//
    public void enterUserName() throws InterruptedException {
//        Thread.sleep(5000);
        userName.sendKeys("Alex Flame");
        }
//  *******************************************************************************


    @FindBy(css = "input[data-qa='signup-email']")
    private WebElement userEmail;
//#################################################################################
//            Method for Enter User E-Mail
// ################################################################################
//
    public void enterUserEmailAddress(){
        userEmail.sendKeys("alexflame2005@gmail.com");
    }
//  *******************************************************************************

    @FindBy(css = "button[data-qa='signup-button']")
    private WebElement signupButton;
//#################################################################################
//            Method for Click on SignUp Button
// ################################################################################
//
    public SignUpPage clickOnSignUPButton(){
        signupButton.click();
        return new SignUpPage(driver);
    }
//  *******************************************************************************

}
