package org.rnd.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.rnd.utils.Base;

public class GoogleHomePage extends  Base{

    By searchInput = By.xpath("//textarea[@title='Search']");
    By searchButton = By.xpath("//div[@jsname='VlcLAe']//input[@value='Google Search']");

    public void enterInSearch(String val) {
       driver.findElement(searchInput).sendKeys(val);
    }

    public void clickSearchButton() {
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", driver.findElement(searchButton));
        try{
            Thread.sleep(15000);
        }catch (Exception e) {

        }
    }


}
