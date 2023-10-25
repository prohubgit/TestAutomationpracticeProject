package com.automationpractice.stepDefinitions;

import com.automationpractice.pages.BasePage;
import com.automationpractice.pages.PaymentDonePage;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class FileUitilityForMultipurposesSteps extends BasePage {
    PaymentDonePage paymentDonePage = PageFactory.initElements(driver, PaymentDonePage.class);


    @Given("I paid for my shopping on payment-done page")
    public void i_paid_for_my_shopping_on_payment_done_page() {
        launchUrl();
    }

    @When("I click on download invoice button")
    public void i_click_on_download_invoice_button() throws InterruptedException {
        paymentDonePage.clickOnDownloadInvoice();
    }

    @Then("Invoice of customer's shopping downloaded")
    public void invoice_of_customer_s_shopping_downloaded() {

    }


////////////////////////////////
    //Scenario 2;

    @Given("Customer paid for my shopping on payment-done page")
    public void customer_paid_for_my_shopping_on_payment_done_page() {
        //launchUrl();
    }

    @When("Customer click on download invoice button")
    public void customer_click_on_download_invoice_button() throws InterruptedException {
        //paymentDonePage.clickOnDownloadInvoice();
    }



}
