package com.transmuda.stepdefinitions;

import com.transmuda.pages.GridBasePage;
import com.transmuda.pages.LoginPage;
import com.transmuda.utilities.BrowserUtils;

public class gridBaseCodeTest {
    public static void main(String[] args) {

        //GridBasePage code tests
        LoginPage loginPage = new LoginPage();
        loginPage.loginForSalesManagerStoreManager("driver");

        GridBasePage gridBasePage = new GridBasePage();
        gridBasePage.navigateToModule("Fleet", "Vehicle Odometer");
        BrowserUtils.waitFor(8);
        System.out.println(gridBasePage.getGridTableHeaderIndex("Date"));

        System.out.println(gridBasePage.findRowValue("Date", "May 9, 1951"));
        //Assert.assertTrue(gridBasePage.findRowValue("DATE", "Mar 28, 2019"));
        System.out.println("gridBasePage.getGridTableFirstHeaderIsCheckBox() = " + gridBasePage.getGridTableFirstHeaderIsCheckBox());

//        gridBasePage.navigateToModule("Fleet", "Vehicles");
//        BrowserUtils.waitFor(5);
//        System.out.println(gridBasePage.getGridTableHeaderIndex("License Plate"));
//        System.out.println(gridBasePage.findRowValue("License Plate", "victory13-3"));

    }
}
