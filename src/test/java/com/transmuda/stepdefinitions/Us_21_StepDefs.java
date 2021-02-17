package com.transmuda.stepdefinitions;

import com.transmuda.pages.DashboardPage;
import com.transmuda.pages.LoginPage;
import com.transmuda.pages.Us_21_Page;
import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.ConfigurationReader;
import com.transmuda.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Map;

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

        new Us_21_Page().firstOdometer.click();
        BrowserUtils.waitFor(2);

    }

    @When("the user click Edit button")
    public void the_user_click_Edit_button() {


        new Us_21_Page().editButton.click();
        BrowserUtils.waitFor(2);

    }

    @Then("information  Edit page should be open")
    public void information_Edit_page_should_be_open() {

       String actualTitle= new Us_21_Page().GenaeralText.getText();
       String expectedTitle="General";
       Assert.assertEquals(expectedTitle,actualTitle);

       BrowserUtils.waitFor(1);

    }

    @When("the user enter the valid values")
    public void the_user_enter_the_valid_values() {


        Us_21_Page us_21_page=new Us_21_Page();

        us_21_page.odometerValue.click();
        BrowserUtils.waitFor(1);
        us_21_page.odometerValue.clear();
        us_21_page.odometerValue.sendKeys("215");

        //=======date===========
        us_21_page.chooseDate.click();
        BrowserUtils.waitFor(1);
        Select select=new Select(us_21_page.monthSelect);

        select.selectByIndex(4);

        Select selectYear=new Select(us_21_page.yearSelect);

        selectYear.selectByIndex(10);

        us_21_page.daySelect.click();


        //=======driver=====

        us_21_page.driver.click();
        us_21_page.driver.clear();
        us_21_page.driver.sendKeys("MahmutAbi");




        us_21_page.xButton.click();

        BrowserUtils.waitFor(1);
        us_21_page.unitDropDown.click();

        us_21_page.km.click();

        //=======addButton=======

        us_21_page.addButton.click();
        BrowserUtils.waitFor(3);
        us_21_page.sdet.click();

        us_21_page.selectButton.click();




    }

    @When("click Save And Close button")
    public void click_Save_And_Close_button() {

        new Us_21_Page().saveAndCloseButton.click();
        BrowserUtils.waitFor(1);


    }

    @Then("the user should be able to see {string} message")
    public void the_user_should_be_able_to_see_message(String expectedMessage) {

        BrowserUtils.waitFor(3);
        Us_21_Page us_21_page=new Us_21_Page();
        //
         String  actualDisplayMessage=us_21_page.entityMessage.getText();
//        Alert alert=Driver.get().switchTo().alert();
//        String actualDisplayMessage=alert.getText();
        Assert.assertEquals(expectedMessage,actualDisplayMessage);

    }

    @When("the user enter letter as a Odometer Value")
    public void the_user_enter_letter_as_a_Odometer_Value() {

        Us_21_Page us_21_page=new Us_21_Page();

        us_21_page.odometerValue.click();
        BrowserUtils.waitFor(1);
        us_21_page.odometerValue.clear();
        us_21_page.odometerValue.sendKeys("ford");

        BrowserUtils.waitFor(2);

    }

    @Then("{string} error message should be displayed")
    public void error_message_should_be_displayed(String expectedErrorMessage) {

        String actualMessage=new Us_21_Page().odometerMessage.getText();
        Assert.assertEquals(expectedErrorMessage,actualMessage);


    }




}
