package org.rnd.sel.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FirstSel {

    static WebDriver driver;
    public static void main(String args[]) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

        driver = new ChromeDriver();

        driver.get("https://www.w3schools.com/sql/sql_update.asp");

        String ex= driver.findElement(By.xpath("(//table)[1]/tbody/tr/th[1]")).getText();
        System.out.println(ex);

        List<WebElement> li=  driver.findElements(By.xpath("(//table)[1]/tbody/tr/th"));
        System.out.println(li.size());
        for(int i=0; i<li.size(); i++) {
            System.out.println(li.get(i));
        }




        Thread.sleep(5000);

        driver.quit();

    }


    public void addt(String value) {

        //css xpath
        List<WebElement> el= driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
        WebElement ele = driver.findElement(By.xpath("//span[text()='"+value+"']/parent::a/div//i"));
    }
}
