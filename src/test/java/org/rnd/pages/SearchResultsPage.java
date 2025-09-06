package org.rnd.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.rnd.utils.Base;

public class SearchResultsPage extends Base{

    public SearchResultsPage() {

    }

    public void clickLink() {
        driver.findElement(By.xpath("//a[@jsname='UWckNb']/h3[text()='Selenium']")).click();
    }

}
