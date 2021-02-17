package com.transmuda.stepdefinitions;

import com.transmuda.pages.LoginPage;
import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LoginStepDefs {
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
}
