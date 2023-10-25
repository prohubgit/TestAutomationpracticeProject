package com.automationpractice.stepDefinitions;

import com.automationpractice.pages.BasePage;
import com.automationpractice.pages.HomePage;
import com.automationpractice.pages.LoginPage;
import com.automationpractice.pages.SignUpPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;


public class InfoUserNewAccountSteps extends BasePage {
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    SignUpPage signUpPage = PageFactory.initElements(driver, SignUpPage.class);
    @Given("i navigate to Home Page")
    public void inavigatetohomepage() {
        launchUrl();
    }
    @Given("I can click on Sign-Up or Login link")
    public void icanclickonsignuporloginlink() {
        loginPage = homePage.clickOnLoginLink();
    }
    @When("I enter the Name")
    public void ienterthename() throws InterruptedException {
        loginPage.enterUserName();

    }
    @When("I enter the Email Address")
    public void ientertheemailaddress() {
        loginPage.enterUserEmailAddress();
    }
    @When("I click on Sign-up button")
    public void iclickonsignupbutton() {
        signUpPage = loginPage.clickOnSignUPButton();
    }
    @Then("sing-up page should be dispaly")
    public void sing_up_page_should_be_dispaly() {
        signUpPage.nameFieldVerification();
    }

    /////////////// Scenario 2 Methods///////////////////////
    @Given("I navigate to Home page")
    public void i_navigate_to_home_page() throws InterruptedException {
       launchUrl();;
       String homePageTile = driver.getTitle();
       System.out.println("HomePage "+ homePageTile);
       loginPage = homePage.clickOnLoginLink();
       loginPage.enterUserName();
       loginPage.enterUserEmailAddress();
        signUpPage = loginPage.clickOnSignUPButton();
    }
    @When("I click on tile radio button")
    public void i_click_on_tile_radio_button() {

    }

    @When("I select <{string}> from the day dropdown")
    public void i_select_from_the_day_dropdown(String string) {

    }

    @When("I select <{string}> from the month dropdown")
    public void i_select_from_the_month_dropdown(String string) {

    }

    @When("I select <{string}> from the year dropdown")
    public void i_select_from_the_year_dropdown(String string) {

    }

    @When("I click on newsleter check bok")
    public void i_click_on_newsleter_check_bok() {

    }

    @When("I click on receive offers from our partners checkbox")
    public void i_click_on_receive_offers_from_our_partners_checkbox() {

    }

    @When("I select <{string}> from the country dropdown")
    public void i_select_from_the_country_dropdown(String string) {

    }

    @When("I enter <{string}> from the state dropdown")
    public void i_enter_from_the_state_dropdown(String string) {

    }

    @When("I enter <{string}> in to the city field")
    public void i_enter_in_to_the_city_field(String string) {

    }

}
