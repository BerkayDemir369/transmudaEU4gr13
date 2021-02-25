package com.transmuda.stepdefinitions;

import com.transmuda.pages.DashboardPage;
import com.transmuda.pages.VehicleCostsPage;
import com.transmuda.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Us_25_StepDefs {
    VehicleCostsPage vehicleCostsPage=new VehicleCostsPage();
    @Given("navigate to Fleet Vehicle Costs")
    public void navigate_to_Fleet_Vehicle_Costs() {
        DashboardPage dashboardPage=new DashboardPage();
        dashboardPage.navigateToModule("Fleet","Vehicle Costs");
        BrowserUtils.waitFor(10);
    }

    @When("click on the Page button on the Vehicle Costs page")
    public void click_on_the_Page_button_on_the_Vehicle_Costs_page() {
       vehicleCostsPage.pageChangeButton.click();
       BrowserUtils.waitFor(3);
    }

    @Then("truck driver can change page number")
    public void truck_driver_can_change_page_number() {
       // truck driver can change page number

    }

    @When("click on the View Per Page button on the Vehicle Costs page")
    public void click_on_the_View_Per_Page_button_on_the_Vehicle_Costs_page() {
        vehicleCostsPage.viewPerPageChooseButton.click();
        BrowserUtils.waitFor(2);
    }

    @Then("truck driver can change the entity number")
    public void truck_driver_can_change_the_entity_number() {

       vehicleCostsPage.perPage10Button.click();
       BrowserUtils.waitFor(3);
        vehicleCostsPage.viewPerPageChooseButton.click();
       vehicleCostsPage.perPage25Button.click();
        BrowserUtils.waitFor(3);
        vehicleCostsPage.viewPerPageChooseButton.click();
       vehicleCostsPage.perPage50Button.click();
        BrowserUtils.waitFor(3);
        vehicleCostsPage.viewPerPageChooseButton.click();
       vehicleCostsPage.perPage100Button.click();
        BrowserUtils.waitFor(3);
    }

    @When("click on the Export Grid CSV button on the Vehicle Costs page")
    public void click_on_the_Export_Grid_CSV_button_on_the_Vehicle_Costs_page() {
        vehicleCostsPage.exportGridButton.click();
        BrowserUtils.waitFor(3);
        vehicleCostsPage.csvButton.click();


    }
    @When("click on the Export Grid XLSX button on the Vehicle Costs page")
    public void click_on_the_Export_Grid_XLSX_button_on_the_Vehicle_Costs_page() {
        vehicleCostsPage.exportGridButton.click();
        BrowserUtils.waitFor(2);
        vehicleCostsPage.xlsxButton.click();
    }

    @Then("truck driver can get all informations to own email adress")
    public void truck_driver_can_get_all_informations_to_own_email_adress() {
        String expectMessage="Export started successfully. You will receive email notification upon completion.";
        BrowserUtils.waitFor(3);
        Assert.assertTrue(vehicleCostsPage.AlertMessage.getText().contains(expectMessage));

    }


}
