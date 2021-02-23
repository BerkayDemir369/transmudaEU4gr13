package com.transmuda.stepdefinitions;

import com.transmuda.pages.CreateVehicleOdometerPage;
import com.transmuda.pages.DashboardPage;
import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US_22StepDefs {

    CreateVehicleOdometerPage createVehicleOdometerPage=new CreateVehicleOdometerPage();

    @Given("navigate Fleet to Vehicle Odometer")
    public void navigate_Fleet_to_Vehicle_Odometer() {
        DashboardPage dashboardPage=new DashboardPage();
        dashboardPage.navigateToModule("Fleet","Vehicle Odometer");
        BrowserUtils.waitFor(3);
    }

    @And("select any vehicle odometer on the Vehicle Odometer list")
    public void select_any_vehicle_odometer_on_the_Vehicle_Odometer_list() {

        createVehicleOdometerPage.vechileOdometerlist.click();
        BrowserUtils.waitFor(3);
    }

    @And("click on the Delete Button to delete Vehicle Odometer")
    public void click_on_the_Delete_Button_to_delete_Vehicle_Odometer() {
      createVehicleOdometerPage.deleteBNT.click();
        BrowserUtils.waitFor(3);
    }

    @Then("can see the delete confirmation window")
    public void can_see_the_delete_confirmation_window() {
 createVehicleOdometerPage.deleteconfirmationWindow.isDisplayed();
        BrowserUtils.waitFor(3);

    }

    @When("click on the Yes, Delete Button on the delete confirmation window")
    public void click_on_the_Yes_Delete_Button_on_the_delete_confirmation_window() {
   createVehicleOdometerPage.yesDeleteBNT.click();
        BrowserUtils.waitFor(3);
    }

    @Then("vehicle odometer deleted from the list")
    public void vehicle_odometer_deleted_information_display() {

    String actualuRL= Driver.get().getCurrentUrl();
    String expectedUrl="https://qa.transmuda.com/entity/Extend%5CEntity%5CVehiclesOdometer";

        Assert.assertEquals(expectedUrl,actualuRL);

    }

}