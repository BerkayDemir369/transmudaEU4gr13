package com.transmuda.stepdefinitions;

import com.transmuda.pages.VehicleCostsPage;
import com.transmuda.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.Select;

public class Us_33_StepDefs {

    VehicleCostsPage vehicleCostsPage = new VehicleCostsPage();
    String actualPageNumber;

    @Then("the user should be able to see costs information")
    public void the_user_should_be_able_to_see_costs_information() {

        Assert.assertTrue(vehicleCostsPage.allVehicleCosts.isDisplayed());


    }

    @When("the user click Page button to next page or previous page")
    public void the_user_click_Page_button_to_next_page_or_previous_page() {

        BrowserUtils.waitFor(10);

        vehicleCostsPage.viewPerPageChooseButton.click();
        BrowserUtils.waitFor(3);
        vehicleCostsPage.perPage10Button.click();

        BrowserUtils.waitFor(5);
        actualPageNumber = vehicleCostsPage.pageNumber.getAttribute("value");
        System.out.println("actualPageNumber = " + actualPageNumber);
        vehicleCostsPage.pageChangeButton.click();


    }

    @Then("the user should be able to see next or previous page")
    public void the_user_should_be_able_to_see_next_or_previous_page() {
        BrowserUtils.waitFor(5);

        Boolean page = false;

        String nextPage = vehicleCostsPage.pageNumber.getAttribute("value");

        System.out.println("nextPage = " + nextPage);

        if (!actualPageNumber.equals(nextPage)) {
            page = true;
        } else {
            page = false;
        }

        vehicleCostsPage.previousPage.click();
        BrowserUtils.waitFor(5);
        String verifyPreviousPage = vehicleCostsPage.pageNumber.getAttribute("value");

        System.out.println("verifyPreviousPage = " + verifyPreviousPage);
        Assert.assertEquals(actualPageNumber, verifyPreviousPage);
        BrowserUtils.waitFor(5);
        System.out.println("pass");


    }

    @Then("the user click View Per Page button")
    public void the_user_click_View_Per_Page_button() {

        vehicleCostsPage.viewPerPageChooseButton.click();
        BrowserUtils.waitFor(5);

    }

    @Then("the user should be able to see entity number of View Per page")
    public void the_user_should_be_able_to_see_entity_number_of_View_Per_page() {

        Assert.assertTrue(vehicleCostsPage.perPage10Button.isDisplayed());
        Assert.assertTrue(vehicleCostsPage.perPage25Button.isDisplayed());
        Assert.assertTrue(vehicleCostsPage.perPage50Button.isDisplayed());
        Assert.assertTrue(vehicleCostsPage.perPage100Button.isDisplayed());
        BrowserUtils.waitFor(5);

    }

    @When("the user click any entity number in the View Per Page drop List")
    public void the_user_click_any_entity_number_in_the_View_Per_Page_drop_List() {


        vehicleCostsPage.perPage10Button.click();
    }

    @Then("System should be change the entity number of View Per Page")
    public void system_should_be_change_the_entity_number_of_View_Per_Page() {

        String verifyEntity = vehicleCostsPage.viewPerPageChooseButton.getText();
        System.out.println("verifyEntity = " + verifyEntity);

        Assert.assertEquals("10", verifyEntity);

    }

    @Then("the user click Export Grid button")
    public void the_user_click_Export_Grid_button() {

        vehicleCostsPage.exportGridButton.click();

    }

    @When("the user select any options of Export Grid Button")
    public void the_user_select_any_options_of_Export_Grid_Button() {

        BrowserUtils.waitFor(2);
        vehicleCostsPage.csvButton.click();

    }

    @Then("{string} Email message should be displayed")
    public void email_message_should_be_displayed(String expectedMessage) {

        BrowserUtils.waitFor(2);
        String actualMessage= vehicleCostsPage.flashMessage.getText();
        System.out.println("actualMessage = " + actualMessage);
        Assert.assertEquals(expectedMessage,actualMessage);


    }
}
