package com.transmuda.stepdefinitions;

import com.transmuda.pages.DashboardPage;
import com.transmuda.pages.LoginPage;
import com.transmuda.pages.VehicleOdometerPage;
import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class Us_21_StepDefs {



    @Given("the user login as a {string}")
    public void the_user_login_as_a(String usernameType) {

        LoginPage loginPage=new LoginPage();
        loginPage.loginForSalesManagerStoreManager(usernameType);
        BrowserUtils.waitFor(3);
    }


    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {


        BrowserUtils.waitFor(3);
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("Dashboard",actualTitle);


    }

    @When("the user navigates to {string} , {string}")
    public void the_user_navigates_to(String tab, String module) {


        new DashboardPage().navigateToModule(tab,module);


    }

    @When("the user click first odometer information on the table")
    public void the_user_click_first_odometer_information_on_the_table() {



        BrowserUtils.waitFor(7);

        new VehicleOdometerPage().firstOdometer.click();
        BrowserUtils.waitFor(2);

    }

    @When("the user click Edit button")
    public void the_user_click_Edit_button() {


        new VehicleOdometerPage().editButton.click();
        BrowserUtils.waitFor(2);

    }

    @Then("information  Edit page should be open")
    public void information_Edit_page_should_be_open() {

       String actualTitle= new VehicleOdometerPage().GenaeralText.getText();
       String expectedTitle="General";
       Assert.assertEquals(expectedTitle,actualTitle);

       BrowserUtils.waitFor(1);

    }

    @When("the user enter the valid values")
    public void the_user_enter_the_valid_values() {


        VehicleOdometerPage vehicleOdometer_page =new VehicleOdometerPage();

        vehicleOdometer_page.odometerValue.click();
        BrowserUtils.waitFor(1);
        vehicleOdometer_page.odometerValue.clear();
        vehicleOdometer_page.odometerValue.sendKeys("215");

        //=======date===========
        vehicleOdometer_page.chooseDate.click();
        BrowserUtils.waitFor(1);
        Select select=new Select(vehicleOdometer_page.monthSelect);

        select.selectByIndex(4);

        Select selectYear=new Select(vehicleOdometer_page.yearSelect);

        selectYear.selectByIndex(10);

        vehicleOdometer_page.daySelect.click();


        //=======driver=====

        vehicleOdometer_page.driver.click();
        vehicleOdometer_page.driver.clear();
        vehicleOdometer_page.driver.sendKeys("MahmutAbi");




        vehicleOdometer_page.xButton.click();

        BrowserUtils.waitFor(1);
        vehicleOdometer_page.unitDropDown.click();

        vehicleOdometer_page.km.click();

        //=======addButton=======

        vehicleOdometer_page.addButton.click();
        BrowserUtils.waitFor(3);
        vehicleOdometer_page.sdet.click();

        vehicleOdometer_page.selectButton.click();




    }

    @When("click Save And Close button")
    public void click_Save_And_Close_button() {

        new VehicleOdometerPage().saveAndCloseButton.click();
        BrowserUtils.waitFor(1);


    }

    @Then("the user should be able to see {string} message")
    public void the_user_should_be_able_to_see_message(String expectedMessage) {

        BrowserUtils.waitFor(3);
        VehicleOdometerPage vehicleOdometer_page =new VehicleOdometerPage();
        //
         String  actualDisplayMessage= vehicleOdometer_page.entityMessage.getText();
//        Alert alert=Driver.get().switchTo().alert();
//        String actualDisplayMessage=alert.getText();
        Assert.assertEquals(expectedMessage,actualDisplayMessage);

    }

    @When("the user enter letter as a Odometer Value")
    public void the_user_enter_letter_as_a_Odometer_Value() {

        VehicleOdometerPage vehicleOdometer_page =new VehicleOdometerPage();

        vehicleOdometer_page.odometerValue.click();
        BrowserUtils.waitFor(1);
        vehicleOdometer_page.odometerValue.clear();
        vehicleOdometer_page.odometerValue.sendKeys("ford");

        BrowserUtils.waitFor(2);

    }

    @Then("{string} error message should be displayed")
    public void error_message_should_be_displayed(String expectedErrorMessage) {

        String actualMessage=new VehicleOdometerPage().odometerMessage.getText();
        Assert.assertEquals(expectedErrorMessage,actualMessage);


    }




}
