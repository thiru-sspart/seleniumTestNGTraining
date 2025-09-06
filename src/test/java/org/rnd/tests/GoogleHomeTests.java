package org.rnd.tests;

import org.rnd.pages.GoogleHomePage;
import org.rnd.pages.SearchResultsPage;
import org.rnd.pages.SelPage;
import org.rnd.utils.Base;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleHomeTests extends Base{

    GoogleHomePage googleHomePage = new GoogleHomePage();
    SearchResultsPage searchResultsPage = new SearchResultsPage();
    SelPage selPage = new SelPage();

    //Search for selenium in google & click on selenium link
    @Test
    public void tc_01() {
        String rewult;
        try {
            googleHomePage.enterInSearch("Selenium");
            googleHomePage.clickSearchButton();
            searchResultsPage.clickLink();
            String re = selPage.getSelTitle();

            Assert.assertEquals("Selenium", re, "Title didnt match");

        } catch(Exception e){

    }
    }

    //Varify serach button is clickable & able to enter text
    @Test
    public void tc_02() {
        googleHomePage.enterInSearch("Selenium");
        googleHomePage.clickSearchButton();
    }

    //enter text in serach bar & click it without clicking serach button
    @Test
    public void tc_03() {
        googleHomePage.enterInSearch("Selenium");
        googleHomePage.clickSearchButton();
    }

}
