package org.rnd.sel.training;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelEx {

    static WebDriver driver;
    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

        driver = new ChromeDriver();

        driver.get("https://workspace.google.com/intl/en-US/gmail/");

        WebElement element = driver.findElement(By.xpath("(//div[text()='Create an account'])[1]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);
        WebElement el= driver.findElement(By.xpath("(//span[text()='For my personal use'])[1]"));
//        driver.get("https://demo.guru99.com/test/newtours/register.php");
        executor.executeScript("arguments[0].click();", el);

        Thread.sleep(3000);
//        Select s= new Select(driver.findElement(By.name("country")));
//        Thread.sleep(5000);
//        s.selectByVisibleText("BAKER ISLAND");
//        Thread.sleep(5000);
//        s.selectByValue("AUSTRIA");
//        Thread.sleep(5000);
//        s.selectByIndex(9);
//        Thread.sleep(5000);
//
//        //first click on dropdown(xpath of dropdown)
//
//        //2nd xpath of element //li[2]
//
//        driver.quit();

    }

}
