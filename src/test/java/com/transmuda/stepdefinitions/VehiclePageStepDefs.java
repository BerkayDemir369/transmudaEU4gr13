package com.transmuda.stepdefinitions;

import com.transmuda.pages.BasePage;
import com.transmuda.pages.VehicleInfoPage;
import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class VehiclePageStepDefs extends BasePage {
    VehicleInfoPage vehicleInfoPage = new VehicleInfoPage();

    @Given("Navigate Fleet Vecihle")
    public void navigate_Fleet_Vecihle() {
        navigateToModule("Fleet", "Vehicles");
        BrowserUtils.waitFor(8);

    }

    @When("click on the sidebar widgets buttton on the vehicle page")
    public void click_on_the_sidebar_widgets_buttton_on_the_vehicle_page() {
        vehicleInfoPage.sidebarWidgetButton.click();
        BrowserUtils.waitFor(3);
    }

    @And("click on the recent email add button")
    public void click_on_the_recent_email_add_button() {
        vehicleInfoPage.recentEmailsAddButton.click();
        BrowserUtils.waitFor(5);
    }

    @And("click on the sticky note add button")
    public void click_on_the_sticky_note_add_button() {
        vehicleInfoPage.stickyNoteAddButton.click();
        BrowserUtils.waitFor(4);
    }

    @And("click on the task list add button")
    public void click_on_the_task_list_add_button() {
        vehicleInfoPage.taskListAddButton.click();
        BrowserUtils.waitFor(5);
    }

    @And("click on the close button on the sidebar widgets window")
    public void click_on_the_close_button_on_the_sidebar_widgets_window() {
        vehicleInfoPage.closeButton.click();
        BrowserUtils.waitFor(3);
    }

    @Then("truck driver can add email sticky task")
    public void truck_driver_can_add_email_sticky_task() {

    }

    @Given("navigate to Fleet Vehicle")
    public void navigate_to_Fleet_Vehicle() {
        navigateToModule("Fleet", "Vehicles");
        BrowserUtils.waitFor(5);

    }

    @When("click on the pin button on the vehicle page")
    public void click_on_the_pin_button_on_the_vehicle_page() {
        vehicleInfoPage.pinButton.click();
        BrowserUtils.waitFor(10);
    }

    @Then("truck driver can pin the page")
    public void truck_driver_can_pin_the_page() {
        String actualURL = Driver.get().getCurrentUrl();
        String expectURL = "https://qa.transmuda.com/entity/Extend_Entity_Carreservation?restore=1";
        Assert.assertEquals(actualURL, expectURL);
        BrowserUtils.waitFor(5);
    }

    @When("click on the favorite button on the vehicle page")
    public void click_on_the_favorite_button_on_the_vehicle_page() {
        vehicleInfoPage.favoriteButton.click();
        BrowserUtils.waitFor(4);
    }

    @Then("truck driver can make the page favorite on the vehicle page")
    public void truck_driver_can_make_the_page_favorite_on_the_vehicle_page() {

    }


}
