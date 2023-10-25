package com.automationpractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AccountCreatedPage extends BasePage{
    public AccountCreatedPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }



}
