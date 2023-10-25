package com.automationpractice.pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.desktop.SystemSleepEvent;
import java.io.File;


import static java.lang.Thread.sleep;

public class PaymentDonePage extends BasePage{


    /*###################################################################
            Constructor for PaymentDonePage
    ###################################################################*/

    public PaymentDonePage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //###################################################################

    @FindBy(css = ".btn.btn-default.check_out")
    private WebElement downloadInvoiceButton;
    @FindBy(css = "#aswift_1")
    private WebElement parentIframe;
    @FindBy(css = "#ad_iframe[id=ad_iframe]")
    private WebElement alertFrame;
    @FindBy(css = "#dismiss-button")

    private WebElement closeButtonIframe;

    /*###################################################################
            Method for Downloading File using DownloadInvoice button
    ###################################################################*/

    public void clickOnDownloadInvoice() throws InterruptedException {

        downloadInvoiceButton.click();

        switchToIframe(parentIframe);
        switchToIframe(alertFrame);

        closeButtonIframe.click();
        //here path of download folder"DownloadFiles" is speceficed
        String downloadPath = "/Users/sheikhgeeuk/IdeaProjects/Test.Automationpractice.Project/src/test/java/com/automationpractice"+ File.separator + "DownloadFiles";
        Thread.sleep(15000);
//        File file = new File(downloadPath+File.separator +"invoice.txt");
        File file = new File(downloadPath+File.separator +"invoice.txt");
            if(file.exists()){
            System.out.println("Ivoice is sucessfully Downloaded");
            }else {
            System.out.println("Invoice is not downloaded");
            }


    }







}
