package com.transmuda.stepdefinitions;

import com.transmuda.pages.BasePage;
import com.transmuda.pages.LoginPage;
import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.ConfigurationReader;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs extends BasePage {

    LoginPage loginPage = new LoginPage();

    @Given("the user login as a {string}")
    public void the_user_login_as_a(String usernameType) {
        loginPage.loginForSalesManagerStoreManager(usernameType);
    }


    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        BrowserUtils.waitFor(8);
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("Dashboard", actualTitle);
    }

    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
        ConfigurationReader.get("url");
    }

    @When("the user logs in using {string} and {string}")
    public void theUserLogsInUsingAnd(String username, String password) {
        loginPage.login(username,password);
    }
}
