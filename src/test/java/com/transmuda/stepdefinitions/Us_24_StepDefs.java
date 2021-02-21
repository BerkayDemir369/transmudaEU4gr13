package com.transmuda.stepdefinitions;

import com.transmuda.pages.VehicleOdometerPage;
import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Us_24_StepDefs {
    @Then("expected title should be {string}")
    public void expected_title_should_be(String expectedTitle) {

        BrowserUtils.waitFor(5);
        String title= Driver.get().getTitle();
        Assert.assertEquals(expectedTitle,title);

    }

    @Then("{string} message should be displayed.")
    public void message_should_be_displayed(String expectedPermissionMessage) {

        BrowserUtils.waitFor(5);
        String actualPermissionMessage= new VehicleOdometerPage().permissionMessage.getText();
        Assert.assertEquals(expectedPermissionMessage,actualPermissionMessage);


    }

}
