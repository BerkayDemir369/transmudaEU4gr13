package com.transmuda.stepdefinitions;

import com.transmuda.pages.LoginPage;
import com.transmuda.pages.VehicleOdometerPage;
import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Us_23_StepDefs {



    @When("the user click Add Attachment Button")
    public void the_user_click_Add_Attachment_Button() {

        new VehicleOdometerPage().addAttachmentButton.click();
        BrowserUtils.waitFor(5);

    }

    @Then("user should be able to enter valid input to Add Attachment window")
    public void user_should_be_able_to_enter_valid_input_to_Add_Attachment_window() {

        VehicleOdometerPage vehicleOdometerPage= new VehicleOdometerPage();

//        BrowserUtils.waitFor(5);
//        String projectPath = System.getProperty("user.dir");
//        String filePath = "/Users/s.o.f/Desktop/Screenshot 2021-02-15 at 02.54.26.png";
//        String fullPath = projectPath+"/"+filePath;
//
//        vehicleOdometerPage.chooseFileButton.sendKeys(filePath);

        //======
//        vehicleOdometerPage.commentBox.click();
//        BrowserUtils.waitFor(5);
//        vehicleOdometerPage.commentBox.sendKeys("Benden sana bir akil, aklin varsa tek takil");

        vehicleOdometerPage.selectOwnerButton.click();
        BrowserUtils.waitFor(7);
        vehicleOdometerPage.manageFilters.click();
        BrowserUtils.waitFor(1);
        vehicleOdometerPage.firstNameCheckBox.click();

        vehicleOdometerPage.lastName.click();
        BrowserUtils.waitFor(1);
        vehicleOdometerPage.containsOfLastname.click();
        BrowserUtils.waitFor(5);
        vehicleOdometerPage.isEqualTo.click();
        BrowserUtils.waitFor(5);
        vehicleOdometerPage.nameBox.sendKeys("admin");

        BrowserUtils.waitFor(5);
        vehicleOdometerPage.firstOwnerRow.click();
        BrowserUtils.waitFor(5);
        vehicleOdometerPage.saveButton.click();
        BrowserUtils.waitFor(5);




    }

    @When("the user click Save Button")
    public void the_user_click_Save_Button() {


    }

    @Then("{string} message should be displayed")
    public void message_should_be_displayed(String string) {


    }

    @When("the user click Save Button without any choose file")
    public void the_user_click_Save_Button_without_any_choose_file() {

        new  VehicleOdometerPage().saveButton.click();
        BrowserUtils.waitFor(1);


    }

    @Then("{string} error message should be displayed.")
    public void error_message_should_be_displayed(String expectedMessage) {


        String actualMessage=new VehicleOdometerPage().fileChoosingErrorMessage.getText();
        Assert.assertEquals(expectedMessage,actualMessage);


    }





}