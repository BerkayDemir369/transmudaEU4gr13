package com.transmuda.stepdefinitions;

import com.transmuda.pages.DashboardPage;
import com.transmuda.pages.VehicleCostsPage;
import com.transmuda.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Us_25_StepDefs {
    VehicleCostsPage vehicleCostsPage=new VehicleCostsPage();
    @Given("navigate to Fleet Vehicle Costs")
    public void navigate_to_Fleet_Vehicle_Costs() {
        DashboardPage dashboardPage=new DashboardPage();
        dashboardPage.navigateToModule("Fleet","Vehicle Costs");
        BrowserUtils.waitFor(5);
    }

    @When("click on the Page button on the Vehicle Costs page")
    public void click_on_the_Page_button_on_the_Vehicle_Costs_page() {
       vehicleCostsPage.pageChangeButton.click();
       BrowserUtils.waitFor(3);
    }

    @Then("truck driver can change page number")
    public void truck_driver_can_change_page_number() {
       vehicleCostsPage.viewPerPageChooseButton.click();

    }

    @When("click on the View Per Page button on the Vehicle Costs page")
    public void click_on_the_View_Per_Page_button_on_the_Vehicle_Costs_page() {
        vehicleCostsPage.viewPerPageChooseButton.click();
    }

    @Then("truck driver can change the entity number")
    public void truck_driver_can_change_the_entity_number() {
       vehicleCostsPage.perPage10Button.click();
       vehicleCostsPage.perPage25Button.click();
       vehicleCostsPage.perPage50Button.click();
       vehicleCostsPage.perPage100Button.click();
    }

    @When("click on the Export Grid button on the Vehicle Costs page")
    public void click_on_the_Export_Grid_button_on_the_Vehicle_Costs_page() {
        vehicleCostsPage.exportGridButton.click();
        vehicleCostsPage.csvButton.click();
        vehicleCostsPage.xlsxButton.click();
    }

    @Then("truck driver can get all informations to own email adress")
    public void truck_driver_can_get_all_informations_to_own_email_adress() {

    }


}
