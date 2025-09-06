package org.rnd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import training.Bike;
import training.First;


public class A extends Bike {

    public void t() {
        model();
    }

    static WebDriver driver ;

    public static void main(String args[]) {
        First f = new First();
        f.add();
        First.pr();
        driver= new ChromeDriver();
        driver = new FirefoxDriver();
        driver.get("google");

       A a= new A();
       a.t();

    }
}
