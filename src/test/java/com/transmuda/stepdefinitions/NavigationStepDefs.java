package com.transmuda.stepdefinitions;

import com.transmuda.pages.BasePage;
import io.cucumber.java.en.Given;

public class NavigationStepDefs extends BasePage {

    // Please use this feature step template. Dont create again and again.
    // When navigate "Fleet" to "Vehicle Costs"
    @Given("navigate {string} to {string}")
    public void navigateTo(String main, String sub) {
        navigateToModule(main, sub);
    }
}
