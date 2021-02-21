package com.transmuda.stepdefinitions;

import com.transmuda.pages.LoginPage;
import com.transmuda.pages.VehicleOdometerPage;
import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

public class Us_23_StepDefs {


    @When("the user click Add Attachment Button")
    public void the_user_click_Add_Attachment_Button() {

        new VehicleOdometerPage().addAttachmentButton.click();
        BrowserUtils.waitFor(5);

    }

    @Then("user should be able to enter valid input to Add Attachment window")
    public void user_should_be_able_to_enter_valid_input_to_Add_Attachment_window() throws AWTException {


        VehicleOdometerPage vehicleOdometerPage = new VehicleOdometerPage();

        vehicleOdometerPage.addAttachmentButton.click();
        BrowserUtils.waitFor(7);
        vehicleOdometerPage.Test.click();
        BrowserUtils.waitFor(4);
        File filePath = new File("/Users/s.o.f/Desktop/Screenshot 2021-02-15 at 02.54.26.png");
        StringSelection stringSelection = new StringSelection(filePath.getAbsolutePath());

        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_META);

        robot.keyPress(KeyEvent.VK_TAB);

        robot.keyRelease(KeyEvent.VK_META);

        robot.keyRelease(KeyEvent.VK_TAB);

        robot.delay(500);
        //Open Goto window

        robot.keyPress(KeyEvent.VK_META);

        robot.keyPress(KeyEvent.VK_SHIFT);

        robot.keyPress(KeyEvent.VK_G);

        robot.keyRelease(KeyEvent.VK_META);

        robot.keyRelease(KeyEvent.VK_SHIFT);

        robot.keyRelease(KeyEvent.VK_G);

//Paste the clipboard value

        robot.keyPress(KeyEvent.VK_META);

        robot.keyPress(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_META);

        robot.keyRelease(KeyEvent.VK_V);

//Press Enter key to close the Goto window and Upload window

        robot.keyPress(KeyEvent.VK_ENTER);

        robot.keyRelease(KeyEvent.VK_ENTER);

        robot.delay(500);

        robot.keyPress(KeyEvent.VK_ENTER);

        robot.keyRelease(KeyEvent.VK_ENTER);

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


        new VehicleOdometerPage().saveButton.click();
        BrowserUtils.waitFor(1);


    }


    @Then("{string} error message should be displayed.")
    public void error_message_should_be_displayed(String expectedMessage) {


        String actualMessage = new VehicleOdometerPage().fileChoosingErrorMessage.getText();
        Assert.assertEquals(expectedMessage, actualMessage);


    }


}