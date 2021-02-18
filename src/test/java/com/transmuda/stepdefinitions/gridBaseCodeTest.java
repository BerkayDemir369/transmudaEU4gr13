package com.transmuda.stepdefinitions;

import com.transmuda.pages.GridBasePage;
import com.transmuda.pages.LoginPage;
import com.transmuda.utilities.BrowserUtils;
import org.junit.Assert;

public class gridBaseCodeTest {
    public static void main(String[] args) {

        //GridBasePage code tests
        LoginPage loginPage = new LoginPage();
        loginPage.loginForSalesManagerStoreManager("driver");

        GridBasePage gridBasePage = new GridBasePage();
        gridBasePage.navigateToModule("Fleet", "Vehicle Odometer");
        BrowserUtils.waitFor(5);
        System.out.println(gridBasePage.getGridTableHeaderIndex("DATE"));

        System.out.println(gridBasePage.findRowValue("DRIVER", "Mar 28, 2019"));
        //Assert.assertTrue(gridBasePage.findRowValue("DATE", "Mar 28, 2019"));


        gridBasePage.navigateToModule("Fleet", "Vehicles");
        BrowserUtils.waitFor(5);
        System.out.println(gridBasePage.getGridTableHeaderIndex("LICENSE PLATE"));

        System.out.println(gridBasePage.findRowValue("LICENSE PLATE", "victory13-3"));

    }
}
