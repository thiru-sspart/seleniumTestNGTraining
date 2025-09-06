package org.rnd.sel.training;

import org.testng.annotations.*;

public class TestNgEx1 {

    @Test(groups = {"regression", "sanity"})  //Testcase
    public void z() {
       System.out.println("Hi");
       //search check  //login //logout
    }

    @Test(groups = {"regression"},priority = 1)
    public void d() {
        System.out.println("No Test annotation"); //enter in serach
    }

    @Test(dataProvider = "addition")
    public void add(int a, int b, int c) { // 2 datas
        System.out.println(a+b+c);
    }

    @Test
    public void pr(String userName, String password) {
        System.out.println(userName+ " "+password);
    }

    @DataProvider(name = "addition")
    public Object[][] sum() {

        return new Object[][]{{1,2,3},
                              {2,7,8},
                              {3,9,7}};

    }

}
