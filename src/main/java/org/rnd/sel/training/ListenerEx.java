package org.rnd.sel.training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.*;

import java.util.Arrays;

public class ListenerEx implements ITestListener, ISuiteListener {
public static WebDriver driver;

    @Override
    public void onStart(ISuite suite) {
        ISuiteListener.super.onStart(suite);

        String bro= suite.getParameter("browser");
        System.out.println(bro);

        if(bro.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
            driver= new ChromeDriver();
        }


    }

    public void onStart(ITestContext context) {
        driver.get("https://www.google.com");
        ITestListener.super.onStart(context);
        System.out.println(Arrays.toString(context.getAllTestMethods()));

    }

    @Override
    public void onFinish(ISuite suite) {
        ISuiteListener.super.onFinish(suite);
        driver.quit();
    }
}
