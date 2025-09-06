package org.rnd.utils;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Base {

    public static WebDriver driver;
    public ResourceUtil resourceUtil = new ResourceUtil();

         @BeforeSuite
         public void openBrowser(){
            driver = DriverUtil.getDriver();
         }

         @BeforeTest
    public void launchApp() {
             driver.get(resourceUtil.getProperty("baseUrl"));
         }

         @AfterSuite
    public void closeBro() {
             driver.quit();
         }

}
