package com.transmuda.stepdefinitions;

import com.transmuda.pages.DashboardPage;
import com.transmuda.pages.GridBasePage;
import com.transmuda.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class Us_17_StepDefs extends GridBasePage {
    @Given("The truck driver user accesses the {string} - {string}")
    public void theTruckDriverUserAccessesThe(String tab, String module) {
        new DashboardPage().navigateToModule(tab, module);
        BrowserUtils.waitFor(9);
    }

    @When("The truck driver click Grid Settings button")
    public void theTruckDriverClickGridSettingsButton() {
        GridSettingsButton.click();
        BrowserUtils.waitFor(2);
    }

    @Then("The truck driver can see Grid Settings Popup")
    public void theTruckDriverCanSeeGridSettingsPopup() {
        Assert.assertTrue(GridSettingsPopup.isDisplayed());
    }

    @And("The truck driver should only be able to see the column headings selected from the grid settings popup in the odometer table")
    public void theTruckDriverShouldOnlyBeAbleToSeeTheColumnHeadingsSelectedFromTheGridSettingsPopupInTheOdometerTable() {

        for (WebElement gridSettingsRowName : GridSettingsRowNames) {
            boolean flag = true;
            for (WebElement gridTableHeader : GridTableHeaders) {
                if (gridSettingsRowName.getText().equals(gridTableHeader.getText())) {
                    flag = true;
                    System.out.println("gridTableHeader.getText() = " + gridTableHeader.getText());
                    return;
                } else {
                    flag = false;
                }
            }

        }
    }

    @When("The truck driver change selected header {string} in the grid settings popup")
    public void theTruckDriverChangeSelectedHeaderInTheGridSettingsPopup(String RowHeaderName) {
        for (WebElement gridSettingsRowName : GridSettingsRowNames) {
            if (gridSettingsRowName.getText().equals(RowHeaderName)) {
                GridSettingsRowCheckBoxes.get(GridSettingsRowNames.indexOf(gridSettingsRowName)).click();
            }
        }
    }

    @When("the truck driver clicks on the Selected link in the grid settings popup")
    public void theTruckDriverClicksOnTheSelectedLinkInTheGridSettingsPopup() {
        Selected.click();
    }

    @Then("Truck driver should be able to see only those with checkboxes in popup table")
    public void truckDriverShouldBeAbleToSeeOnlyThoseWithCheckboxesInPopupTable() {

        for (WebElement gridSettingsRowName : GridSettingsRowNames) {
            if (gridSettingsRowName.isSelected()) {
                Assert.assertTrue(GridSettingsRowCheckBoxes.get(GridSettingsRowNames.indexOf(gridSettingsRowName)).isDisplayed());
            }
        }

    }

    @When("the truck driver clicks on the Select All link in the grid settings popup")
    public void theTruckDriverClicksOnTheSelectAllLinkInTheGridSettingsPopup() {
        All.click();
        BrowserUtils.waitFor(1);
        SelectAll.click();
    }

    @Then("The truck driver should be able to see in the popup table that all checkboxes have been marked")
    public void theTruckDriverShouldBeAbleToSeeInThePopupTableThatAllCheckboxesHaveBeenMarked() {
        for (WebElement gridSettingsRowName : GridSettingsRowNames) {
            Assert.assertTrue(gridSettingsRowName.isDisplayed());
        }
    }

    @When("The truck driver user clicks Filters button")
    public void theTruckDriverUserClicksFiltersButton() {
        FilterButton.click();
    }

    @Then("The truck driver user can see Manage Filters Box")
    public void theTruckDriverUserCanSeeManageFiltersBox() {
        Assert.assertTrue(FilterBoxArea.isDisplayed());
    }

    @And("Click Manage filters link button")
    public void clickManageFiltersLinkButton() {
        ManageFilters.click();
    }

    @Then("The truck driver user should be able to see Manage filters popup")
    public void theTruckDriverUserShouldBeAbleToSeeManageFiltersPopup() {
        Assert.assertTrue(ManageFiltersPopup.isDisplayed());
    }

    @When("The truck driver user select filter option in the Manage filters popup")
    public void theTruckDriverUserSelectFilterOptionInTheManageFiltersPopup() {

    }

    @Then("Truck driver user should be able to see selected filter setting on the right side of manage filter")
    public void truckDriverUserShouldBeAbleToSeeSelectedFilterSettingOnTheRightSideOfManageFilter() {
    }

    @When("Truck driver user Click selected Filter Option button")
    public void truckDriverUserClickSelectedFilterOptionButton() {
    }

    @Then("Truck driver user should be able to see Filter Option popup")
    public void truckDriverUserShouldBeAbleToSeeFilterOptionPopup() {
    }

    @When("Truck driver user Select Condition keyword in the selected Filter Option popup")
    public void truckDriverUserSelectConditionKeywordInTheSelectedFilterOptionPopup() {
    }

    @And("Truck driver user enter data for selected Condition keyword in the selected Filter Option popup")
    public void truckDriverUserEnterDataForSelectedConditionKeywordInTheSelectedFilterOptionPopup() {
    }

    @And("Truck driver user Click Update button in the selected Filter Option popup")
    public void truckDriverUserClickUpdateButtonInTheSelectedFilterOptionPopup() {
    }

    @Then("Truck driver user should be able to see results for selected filter settings in the Filter settings")
    public void truckDriverUserShouldBeAbleToSeeResultsForSelectedFilterSettingsInTheFilterSettings() {
    }

    @When("The truck driver user clicks Refresh button")
    public void theTruckDriverUserClicksRefreshButton() {
    }

    @Then("The truck driver user should be able to see the page reloaded")
    public void theTruckDriverUserShouldBeAbleToSeeThePageReloaded() {
    }

    @When("The truck driver user clicks Reset button")
    public void theTruckDriverUserClicksResetButton() {
    }

    @Then("The truck driver user should be able to see if all filters and settings applied to the page have been reset and reloaded")
    public void theTruckDriverUserShouldBeAbleToSeeIfAllFiltersAndSettingsAppliedToThePageHaveBeenResetAndReloaded() {
    }
}
