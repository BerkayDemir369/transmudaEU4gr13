package com.transmuda.stepdefinitions;

import com.transmuda.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Us_16_StepDef {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {


    }
    @When("the user login as a {string}")
    public void the_user_login_as_a(String str) {
        LoginPage loginpage= new LoginPage();
        loginpage.loginForSalesManagerStoreManager(str);
    }
    @When("the user navigates to {string} , {string}")
    public void the_user_navigates_to(String string, String string2) {
    }
    @Then("the user can see vehicle odometre column")
    public void the_user_can_see_vehicle_odometre_column() {
    }

}
