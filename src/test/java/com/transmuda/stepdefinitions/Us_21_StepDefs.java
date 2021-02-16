package com.transmuda.stepdefinitions;

import com.transmuda.pages.DashboardPage;
import com.transmuda.pages.LoginPage;
import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.ConfigurationReader;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class Us_21_StepDefs {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {

        String url = ConfigurationReader.get("url");
        //WebDriver driver = Driver.get();
        Driver.get().get(url);


    }

    @When("the user login as a TruckDriver")
    public void the_user_login_as_a_TruckDriver(Map<String,String> userInfo) {

        new LoginPage().login(userInfo.get("username"),userInfo.get("password"));



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



    }

    @When("the user click Edit button")
    public void the_user_click_Edit_button() {



    }

    @Then("information  Edit page should be open")
    public void information_Edit_page_should_be_open() {



    }

    @When("the user enter the valid values")
    public void the_user_enter_the_valid_values() {



    }

    @When("click Save And Close button")
    public void click_Save_And_Close_button() {



    }

    @Then("the user should be able to see {string} message")
    public void the_user_should_be_able_to_see_message(String expectedMessage) {


    }

    @When("the user enter letter as a Odometer Value")
    public void the_user_enter_letter_as_a_Odometer_Value() {


    }

    @Then("{string} error message should be displayed")
    public void error_message_should_be_displayed(String expectedErrorMessage) {



    }

    @When("the user should click date box")
    public void the_user_should_click_date_box() {



    }

    @Then("The user should be able to select any date")
    public void the_user_should_be_able_to_select_any_date() {


    }


}
