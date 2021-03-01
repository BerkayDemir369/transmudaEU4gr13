package com.transmuda.stepdefinitions;

import com.transmuda.pages.VehicleOdometerPage;
import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.concurrent.TimeUnit;

public class Us_23_StepDefs {


    @When("the user click Add Attachment Button")
    public void the_user_click_Add_Attachment_Button() {

        new VehicleOdometerPage().addAttachmentButton.click();
        BrowserUtils.waitFor(5);

    }

    @Then("user should be able to enter valid input to Add Attachment window")
    public void user_should_be_able_to_enter_valid_input_to_Add_Attachment_window() throws AWTException {

        VehicleOdometerPage vehicleOdometerPage = new VehicleOdometerPage();


        System.out.println(vehicleOdometerPage.fullPath);
        vehicleOdometerPage.chooseFileButton.sendKeys(vehicleOdometerPage.fullPath);
        BrowserUtils.waitFor(1);


        vehicleOdometerPage.commentBox.sendKeys("text");

        vehicleOdometerPage.selectOwnerButton.click();
        BrowserUtils.waitFor(2);
        vehicleOdometerPage.manageFilters.click();
        BrowserUtils.waitFor(3);
        vehicleOdometerPage.firstNameCheckBox.click();

        vehicleOdometerPage.lastName.click();
        BrowserUtils.waitFor(1);
        vehicleOdometerPage.containsOfLastname.click();
        BrowserUtils.waitFor(1);
        vehicleOdometerPage.isEqualTo.click();
        BrowserUtils.waitFor(1);
        vehicleOdometerPage.nameBox.sendKeys("admin");
        vehicleOdometerPage.lastNameUpdateButton.click();
        BrowserUtils.waitFor(3);
        vehicleOdometerPage.firstOwnerRow.click();




    }

    @When("the user click Save Button")
    public void the_user_click_Save_Button() {

        BrowserUtils.waitFor(3);
        new VehicleOdometerPage().saveButton.click();

    }

    @Then("{string} message should be displayed")
    public void message_should_be_displayed(String expectedMessage) {

        BrowserUtils.waitFor(3);
        String actualMessage = new VehicleOdometerPage().fileErrorMessage.getText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @When("the user click Save Button without any choose file")
    public void the_user_click_Save_Button_without_any_choose_file() {


        new VehicleOdometerPage().saveButton.click();
        BrowserUtils.waitFor(1);


    }


    @Then("{string} error message should be displayed.")
    public void error_message_should_be_displayed(String expectedMessage) {


        String actualMessage = new VehicleOdometerPage().fileChoosingErrorMessage.getText();
        Assert.assertEquals(expectedMessage, actualMessage);


    }


}