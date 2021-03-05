package com.transmuda.stepdefinitions;

import com.transmuda.pages.BasePage;
import io.cucumber.java.en.Given;

public class Us_30_StepDefs extends BasePage {

    @Given("navigate  {string} to  {string}")
    public void navigateTo(String main, String sub) {
        navigateToModule(main, sub);
    }
}
