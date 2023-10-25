package com.automationpractice.common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.File;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class Browser extends Driver{

    private WebDriver initChrome() {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        chromePrefs.put("profile.default_content_settings.popups", 0);
        String downloadPath = "/Users/sheikhgeeuk/IdeaProjects/Test.Automationpractice.Project/src/test/java/com/automationpractice"+ File.separator + "DownloadFiles";
        //String downloadPath = "/Users/sheikhgeeuk/IdeaProjects/Test.Automationpractice.Project/src"+ File.separator + "DownloadFiles";
        chromePrefs.put("download.default_directory", downloadPath);
        options.setExperimentalOption("prefs",chromePrefs);

        return new ChromeDriver(options);
    }
    private WebDriver initHeadlessChrome() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-gpu", "--headless");
        return new ChromeDriver(options);
    }

    private WebDriver initFirefox() {
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }

    private WebDriver initHeadlessFirefox() {
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--disable-gpu", "--headless");
        return new FirefoxDriver(options);

    }

    private WebDriver initInternetExplorer() {
        WebDriverManager.iedriver().setup();
        return new InternetExplorerDriver();
    }
    public void launchBrowser(String browser){

        switch (browser) {
            case "Chrome":
                driver = initChrome();
                break;
            case "HeadlessChrome":
                driver = initHeadlessChrome();
                break;

            case "Firefox":
                driver = initFirefox();
                break;
            case "HeadlessFirfox":
                driver = initHeadlessFirefox();
                break;
            case "IE" :
            case "ie":
            case "InternetExplorer":
            case "internetexplorer":
                driver = initInternetExplorer();
                break;
            default:
                driver = initChrome();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    }

    public void closeBrowser(){
        driver.manage().deleteAllCookies();
        driver.quit();

    }

}
