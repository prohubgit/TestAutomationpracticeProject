package com.automationpractice.pages;

import com.automationpractice.common.Driver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.io.File;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class BasePage extends Driver {

    public String BASE_URL = "https://www.automationexercise.com/";
   public String urlCustome = "https://www.automationexercise.com/payment_done/400";

    // Declaring Select variable;
    private static Select select;
    private static Actions action;





    static {
        //driver = null;
        select = null;
        action = null;

    }

//#################################################################################
//            Method for launching browser
// ################################################################################
    public void launchUrl(){
        driver.navigate().to(urlCustome);

    }
//  *******************************************************************************

    //#################################################################################
//            Method for lSelecting By text from ListBox
// ################################################################################
    public void selectByText(WebElement element, String text){
        select = new Select(element);
        select.selectByVisibleText(text);

    }
//  *******************************************************************************

    //#################################################################################
//            Method for lSelecting By Value from ListBox
// ################################################################################
    public void selectByValue(WebElement element, String value){
        select = new Select(element);
        select.selectByValue(value);

    }
//  *******************************************************************************

    //#################################################################################
//            Method for lSelecting by Index from ListBox
// ################################################################################
    //Define method to select by index
    public void selectByIndex(WebElement element, int index){
        select = new Select(element);
        select.selectByIndex(index);

    }
    //  *******************************************************************************
//#################################################################################
//            Method for Scroll Web Page Vertical
// ################################################################################
// use negative vale to traverse upward
    public void scrollPageVerticall(){
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,2000)");

    }
    //  *******************************************************************************
//#################################################################################
//            Method for Scroll within WebElement/dropdown Vertical
// ################################################################################
// use negative vale to traverse upward
    public void scrollWebElementVerticall(){
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,2000)");

    }
//  *******************************************************************************

/*#################################################################################
         Method for Hover over an Element
// ################################################################################*/
    public static void HoverOver(WebElement element) throws Exception {
        action = new Actions(driver);
        action.moveToElement(element).build().perform();

    }
//  *******************************************************************************


    public static void switchToIframe(WebElement element){
        driver.switchTo().frame(element);

    }

    public static void  switchToMainDom(){
        driver.switchTo().defaultContent();
    }




    /*++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    Method for Retreving Data from DataBase
     ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
        public void connectToMySQLDB(){
            // Declaring connect object for MYSQL DB and assigned null value
            Connection con = null;
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_demo", "root", "AdminRoot");
                if (con.isClosed()){

                    System.out.println(" demo database connection is unsuccessfull");
                } else {

                    System.out.println("demo database connection is successful");
                }


                Statement statement = con.createStatement();

                ResultSet resultSet = statement.executeQuery("select * from products;");

                System.out.println("ID      "+"    Name"+"               Description          "+"Available Stock   "+"           Supplyer");
                while(resultSet.next()) {

                    System.out.print(resultSet.getInt("productsID"));
                    System.out.print("    "+resultSet.getString("productsName"));
                    System.out.print("            "+resultSet.getString("productsDescription"));
                    System.out.print("            "+resultSet.getString("productsStock"));
                    System.out.print("                     "+resultSet.getString("productsSuppler"));
                    System.out.println();

                }
                //MySQLDB connection closed
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }
    ///=================================================================================



    /*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            Take Screenshot Method:
     +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
        public static File takeScreenShot() throws Exception
        {
            return ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        }
    //====================================================================================

    /*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            Save Screenshot as File Method:
     +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
            public static void saveScreenshot() throws Exception
            {
                String dateNow = new SimpleDateFormat("ddMMyy").format(new GregorianCalendar().getTime());
                String timeNow = new SimpleDateFormat("hhmmss").format(new GregorianCalendar().getTime());

                String fileName = String.format(".\\Screenshots\\%s\\screenshot_%s", dateNow, timeNow);

                File screenshot = takeScreenShot();

                FileUtils.copyFile(screenshot, new File(fileName));

            }

    //======================================================================================

}
