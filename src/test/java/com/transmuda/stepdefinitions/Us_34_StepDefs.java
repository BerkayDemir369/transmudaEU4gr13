package com.transmuda.stepdefinitions;

import com.transmuda.pages.VehicleCostsPage;
import com.transmuda.utilities.BrowserUtils;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.tr.Ve;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.function.BooleanSupplier;

public class Us_34_StepDefs {
    VehicleCostsPage vehicleCostsPage = new VehicleCostsPage();

    @Then("click Grid Settings Button")
    public void click_Grid_Settings_Button() {

        BrowserUtils.waitFor(1);
        vehicleCostsPage.gridSettingsButton.click();

        BrowserUtils.waitFor(1);

    }

    @When("the user select any check box related columns")
    public void the_user_select_any_check_box_related_columns() {


        if (vehicleCostsPage.idCheckBox.isSelected()) {

        } else {
            vehicleCostsPage.idCheckBox.click();
        }
        BrowserUtils.waitFor(1);

        if (vehicleCostsPage.typeCheckBox.isSelected()) {

        } else {
            vehicleCostsPage.typeCheckBox.click();
        }

        BrowserUtils.waitFor(1);

        if (vehicleCostsPage.totalPriceCheckBox.isSelected()) {

        } else {
            vehicleCostsPage.totalPriceCheckBox.click();
        }

        BrowserUtils.waitFor(1);

        if (vehicleCostsPage.dateCheckBox.isSelected()) {

        } else {
            vehicleCostsPage.dateCheckBox.click();
        }


    }

    @Then("selected columns should be attached on the current page")
    public void selected_columns_should_be_attached_on_the_current_page() {

        BrowserUtils.waitFor(1);

        String actualIdColumn = vehicleCostsPage.idColumn.getText();
        System.out.println("actualIdColumn = " + actualIdColumn);


        String actualTypeColumn = vehicleCostsPage.typeColumn.getText();
        System.out.println("actualTypeColumn = " + actualTypeColumn);


        String actualTotalPrice = vehicleCostsPage.totalPriceColumn.getText();
        System.out.println("actualTotalPrice = " + actualTotalPrice);


        String actualDate = vehicleCostsPage.dateColumn.getText();
        System.out.println("actualDate = " + actualDate);


        Assert.assertEquals("ID", actualIdColumn);
        Assert.assertEquals("TYPE", actualTypeColumn);
        Assert.assertEquals("TOTAL PRICE", actualTotalPrice);
        Assert.assertEquals("DATE", actualDate);


    }

    @Then("click Filters Button")
    public void click_Filters_Button() {

        vehicleCostsPage.filterButton.click();


    }

    @When("the user click Manage Filters Button")
    public void the_user_click_Manage_Filters_Button() {

        BrowserUtils.waitFor(1);
        vehicleCostsPage.manageFiltersButton.click();

    }

    @Then("the user should be able to filter informations")
    public void the_user_should_be_able_to_filter_informations() {

        vehicleCostsPage.typeFilterBox.click();
        BrowserUtils.waitFor(2);
        vehicleCostsPage.totalPriceFilterBox.click();
        BrowserUtils.waitFor(5);
        vehicleCostsPage.dateFilterBox.click();
        BrowserUtils.waitFor(2);

        Assert.assertTrue(vehicleCostsPage.typeAll.isDisplayed());
        Assert.assertTrue(vehicleCostsPage.totalPriceAll.isDisplayed());
        Assert.assertTrue(vehicleCostsPage.dateAll.isDisplayed());


    }

    @When("the user click Refresh Button")
    public void the_user_click_Refresh_Button() {

        vehicleCostsPage.refreshButton.click();





    }

    @Then("system should be able to refresh the page")
    public void system_should_be_able_to_refresh_the_page() {

        BrowserUtils.waitFor(2);
        vehicleCostsPage.refreshButton.isDisplayed();

    }

    @When("the user click Reset Button")
    public void the_user_click_Reset_Button() {
        vehicleCostsPage.filterButton.click();
        BrowserUtils.waitFor(1);

        vehicleCostsPage.manageFiltersButton.click();
        BrowserUtils.waitFor(1);
        vehicleCostsPage.typeFilterBox.click();
        BrowserUtils.waitFor(1);
        vehicleCostsPage.totalPriceFilterBox.click();
        BrowserUtils.waitFor(1);
        vehicleCostsPage.dateFilterBox.click();
        BrowserUtils.waitFor(1);

        Assert.assertTrue(vehicleCostsPage.typeAll.isDisplayed());
        Assert.assertTrue(vehicleCostsPage.totalPriceAll.isDisplayed());
        Assert.assertTrue(vehicleCostsPage.dateAll.isDisplayed());

        vehicleCostsPage.resetButton.click();
        BrowserUtils.waitFor(5);

    }

    @Then("system should be able to reset the filtering settings")
    public void system_should_be_able_to_reset_the_filtering_settings() {



        vehicleCostsPage.manageFiltersButton.click();
        BrowserUtils.waitFor(1);

        Assert.assertFalse(vehicleCostsPage.typeFilterBox.isSelected());

        Assert.assertFalse(vehicleCostsPage.totalPriceFilterBox.isSelected());

        Assert.assertFalse(vehicleCostsPage.dateFilterBox.isSelected());






    }

}
