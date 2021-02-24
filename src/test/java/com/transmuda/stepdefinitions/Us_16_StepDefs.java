package com.transmuda.stepdefinitions;

import com.transmuda.pages.GridBasePage;
import com.transmuda.pages.VehicleOdometerPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Us_16_StepDefs extends GridBasePage {
    @When("the user click export grid")
    public void the_user_click_export_grid() {
        new VehicleOdometerPage().exportGrid.click();
    }

    @Then("verify options are CSV, XLSX")
    public void verify_options_are_CSV_XLSX() {
        VehicleOdometerPage vehicleOdometerPage=new VehicleOdometerPage();
        Assert.assertTrue(vehicleOdometerPage.csv.getText().equals("CSV"));
        Assert.assertTrue(vehicleOdometerPage.csv.getText().equals("XLSX"));
    }

    @When("the user click CSV")
    public void the_user_click_CSV() {
        new VehicleOdometerPage().csv.click();
    }

    @Then("verify {string} message appear on the top")
    public void verify_message_appear_on_the_top(String message) {
        message="Export started successfully. You will receive email notification upon completion.";
        Assert.assertEquals(message, new VehicleOdometerPage().successfullyMessage.getText());
    }

    @When("the user click XLSX")
    public void the_user_click_XLSX() {
        new VehicleOdometerPage().xlsx.click();
    }

    @When("the user click view per page dropdown button")
    public void the_user_click_view_per_page_dropdown_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("verify options are {int}, {int}, {int}, {int}")
    public void verify_options_are(Integer int1, Integer int2, Integer int3, Integer int4) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user select {int}")
    public void the_user_select(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("verify record table content decrease {int}")
    public void verify_record_table_content_decrease(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user click next page arrow")
    public void the_user_click_next_page_arrow() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("verify page changed to second page")
    public void verify_page_changed_to_second_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the user can see vehicle odometre page")
    public void the_user_can_see_vehicle_odometre_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
