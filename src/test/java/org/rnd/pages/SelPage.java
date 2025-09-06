package org.rnd.pages;

import org.openqa.selenium.WebDriver;
import org.rnd.utils.Base;

public class SelPage extends Base{

    public SelPage( ) {
    }

    public String getSelTitle() {
        return Base.driver.getTitle();
    }

}
