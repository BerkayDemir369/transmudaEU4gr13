package com.transmuda.stepdefinitions;

import com.transmuda.pages.*;
import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class VehicleOdometerStepDefs extends GridBasePage {

    //US-16

    @When("the user click export grid")
    public void the_user_click_export_grid() {
        BrowserUtils.waitFor(10);
        new VehicleOdometerPage().exportGrid.click();
    }

    @Then("verify options are CSV, XLSX")
    public void verify_options_are_CSV_XLSX() {
        VehicleOdometerPage vehicleOdometerPage = new VehicleOdometerPage();
        Assert.assertTrue(vehicleOdometerPage.csv.getText().equals("CSV"));
        Assert.assertTrue(vehicleOdometerPage.xlsx.getText().equals("XLSX"));
    }

    @When("the user click CSV")
    public void the_user_click_CSV() {
        new VehicleOdometerPage().csv.click();
    }

    @Then("verify {string} message appear on the top")
    public void verify_message_appear_on_the_top(String message) {
        message = "Export started successfully. You will receive email notification upon completion.";
        Assert.assertEquals(message, new VehicleOdometerPage().successfullyMessage.getText());
    }

    @When("the user click XLSX")
    public void the_user_click_XLSX() {
        new VehicleOdometerPage().exportGrid.click();
        new VehicleOdometerPage().xlsx.click();

    }

    @When("the user click view per page dropdown button")
    public void the_user_click_view_per_page_dropdown_button() {
        BrowserUtils.waitFor(10);
        new VehicleOdometerPage().perpageDropdown.click();
    }

    @Then("verify options are {int}, {int}, {int}, {int}")
    public void verify_options_are(Integer int1, Integer int2, Integer int3, Integer int4) {
        List<String> dropdownElement = BrowserUtils.getElementsText(new VehicleOdometerPage().dropdownItemList);
        Assert.assertEquals("10", dropdownElement.get(0));
        Assert.assertEquals("25", dropdownElement.get(1));
        Assert.assertEquals("50", dropdownElement.get(2));
        Assert.assertEquals("100", dropdownElement.get(3));
    }

    @When("the user select {int}")
    public void the_user_select(Integer int1) {
        if (int1 == 10) {
            new VehicleOdometerPage().dropdownItemList.get(0).click();
        } else if (int1 == 25) {
            new VehicleOdometerPage().dropdownItemList.get(1).click();
        } else if (int1 == 50) {
            new VehicleOdometerPage().dropdownItemList.get(2).click();
        } else if (int1 == 100) {
            new VehicleOdometerPage().dropdownItemList.get(3).click();
        }
        BrowserUtils.waitFor(2);

    }

    @Then("verify record table content decrease {int}")
    public void verify_record_table_content_decrease(Integer int1) {
        Integer number1 = new VehicleOdometerPage().tableRow.size();
        Assert.assertEquals(int1, number1);

    }

    @When("the user click next page arrow")
    public void the_user_click_next_page_arrow() {
        BrowserUtils.waitFor(10);
        new VehicleOdometerPage().nextPageButton.click();
        BrowserUtils.waitFor(2);
    }

    @Then("verify page changed to second page")
    public void verify_page_changed_to_second_page() {
        String num = new VehicleOdometerPage().pageNumber.getAttribute("value");
        Assert.assertEquals("2", num);
    }

    @Then("the user can see vehicle odometre page")
    public void the_user_can_see_vehicle_odometre_page() {
        BrowserUtils.waitFor(10);
        String actualUrl = Driver.get().getCurrentUrl();
        System.out.println("actualUrl = " + actualUrl);
        String expectedUrl = "https://qa.transmuda.com/entity/Extend_Entity_VehiclesOdometer";
        Assert.assertEquals(actualUrl, expectedUrl);
    }

//US-17

    String activeFilter = null;

    @Given("The truck driver user accesses the {string} - {string}")
    public void theTruckDriverUserAccessesThe(String tab, String module) {
        navigateToModule(tab, module);
    }

    @When("The truck driver click Grid Settings button")
    public void theTruckDriverClickGridSettingsButton() {
        BrowserUtils.waitFor(7);
        GridSettingsButton.click();
    }

    @Then("The truck driver can see Grid Settings Popup")
    public void theTruckDriverCanSeeGridSettingsPopup() {
        BrowserUtils.waitFor(3);
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
        JavascriptExecutor executor = (JavascriptExecutor) Driver.get();
        executor.executeScript("arguments[0].click();", SelectAll);
    }

    @Then("The truck driver should be able to see in the popup table that all checkboxes have been marked")
    public void theTruckDriverShouldBeAbleToSeeInThePopupTableThatAllCheckboxesHaveBeenMarked() {
        for (WebElement gridSettingsRowName : GridSettingsRowNames) {
            Assert.assertTrue(gridSettingsRowName.isDisplayed());
        }
    }

    @When("The truck driver user clicks Filters button")
    public void theTruckDriverUserClicksFiltersButton() {
        BrowserUtils.waitFor(4);
        FilterButton.click();
    }

    @Then("The truck driver user can see Manage Filters Box")
    public void theTruckDriverUserCanSeeManageFiltersBox() {
        BrowserUtils.waitFor(1);
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

    @When("The truck driver user select filter option {string} in the Manage filters popup")
    public void theTruckDriverUserSelectFilterOptionInTheManageFiltersPopup(String FilterColumnName) {
        activeFilter = FilterColumnName;
        for (int i = 0; i < ManageFiltersHeaders.size(); i++) {
            if (ManageFiltersHeaders.get(i).getText().contains(FilterColumnName)) {
                ManageFiltersHeaders.get(i).click();
            }
        }
    }

    @Then("Truck driver user should be able to see selected {string} filter setting on the right side of manage filter")
    public void truckDriverUserShouldBeAbleToSeeSelectedFilterSettingOnTheRightSideOfManageFilter(String FilterColumnName) {
        Assert.assertTrue(findFilterHeader(FilterColumnName));
    }

    @When("Truck driver user Click selected Filter Option {string} button")
    public void truckDriverUserClickSelectedFilterOptionButton(String FilterColumnName) {
        for (WebElement manageFilterItem : ManageFilterItems) {
            if (manageFilterItem.getText().contains(FilterColumnName)) {
                manageFilterItem.click();
            }
        }
    }

    @Then("Truck driver user should be able to see {string} in the Filter Option popup")
    public void truckDriverUserShouldBeAbleToSeeFilterOptionPopup(String FilterColumnName) {
        Assert.assertTrue(ManageFilterSelectedPopup.isDisplayed());
    }

    @When("Truck driver user Select Condition keyword {string} for in the selected Filter Option popup")
    public void truckDriverUserSelectConditionKeywordInTheSelectedFilterOptionPopup(String conditionKeyword) {
        filterConditionButton().click();
        BrowserUtils.waitFor(2);
        conditionKeywordClick(conditionKeyword);
        // TO-DO: select condition type must be dynamic

    }

    @And("Truck driver user enter data {string} {string} for Condition keyword in the selected Filter Option popup")
    public void truckDriverUserEnterDataForSelectedConditionKeywordInTheSelectedFilterOptionPopup(String searchText, String searchText2) {
        BrowserUtils.waitFor(2);
        filterStartValue(searchText);
        BrowserUtils.waitFor(2);
        if (searchText2 != null) {
            try {
                filterEndValue(searchText2);
            } catch (Exception ignored) {
            }
        }
    }

    @And("Truck driver user Click Update button in the selected Filter Option popup")
    public void truckDriverUserClickUpdateButtonInTheSelectedFilterOptionPopup() {
        BrowserUtils.waitFor(2);
        FilterUpdateButton.click();
    }

    @Then("Truck driver user should only be able to see results for {string} {string} {string} selected filter settings in the Filter settings")
    public void truckDriverUserShouldBeAbleToSeeResultsForSelectedFilterSettingsInTheFilterSettings(String condition, String searchText, String searchText2) {
        BrowserUtils.waitFor(3);
        Assert.assertTrue(checkRowValue(activeFilter, condition, searchText, searchText2));
    }

    @When("The truck driver user clicks Refresh button")
    public void theTruckDriverUserClicksRefreshButton() {
        RefreshButton.click();
    }

    @Then("The truck driver user should be able to see the page reloaded")
    public void theTruckDriverUserShouldBeAbleToSeeThePageReloaded() {

    }

    @When("The truck driver user clicks Reset button")
    public void theTruckDriverUserClicksResetButton() {
        ResetButton.click();
        BrowserUtils.waitFor(2);
    }

    @Then("The truck driver user should be able to see if all filters and settings applied to the page have been reset and reloaded")
    public void theTruckDriverUserShouldBeAbleToSeeIfAllFiltersAndSettingsAppliedToThePageHaveBeenResetAndReloaded() {

    }

//US-19

    CreateVehicleOdometerPage createVehicleOdometerPage = new CreateVehicleOdometerPage();

    @Given("navigate  Fleet to  Vehicle Odometer")
    public void navigateFleetToVehicleOdometer() {
        navigateToModule("Fleet", "Vehicle Odometer");
        BrowserUtils.waitFor(10);
    }


    @When("truck driver enter the valid information on the vehicle odometer page")
    public void truck_driver_enter_the_valid_information_on_the_vehicle_odometer_page() {

        BrowserUtils.waitFor(5);

        createVehicleOdometerPage.createOdometerVehicle.click();
        BrowserUtils.waitFor(3);
        createVehicleOdometerPage.odometervehicleInput.sendKeys("123");
        createVehicleOdometerPage.choosedate.click();
        Select selectM = new Select(createVehicleOdometerPage.month);

        selectM.selectByIndex(6);

        Select selectY = new Select(createVehicleOdometerPage.year);

        selectY.selectByIndex(20);

        createVehicleOdometerPage.day.click();
        createVehicleOdometerPage.driverInput.sendKeys("aynur");
        createVehicleOdometerPage.unitInput.click();
        createVehicleOdometerPage.km.click();
//        createVehicleOdometerPage.model.click();
//        createVehicleOdometerPage.modelInput.sendKeys("ford");
        BrowserUtils.waitFor(3);

    }

    @When("truck driver click on the Save and Close button on the Vehicle Odometer page")
    public void truck_driver_click_on_the_Save_and_Close_button_on_the_Vehicle_Odometer_page() {
//        try {
//            WebDriverWait wait = new WebDriverWait(Driver.get(), 5);
//            wait.until(ExpectedConditions.invisibilityOf(createVehicleOdometerPage.select2_drop_mask));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        createVehicleOdometerPage.saveAndClose.click();
        BrowserUtils.waitFor(3);


    }

    @Then("truck driver can create Vehicle Odometer")
    public void truck_driver_can_create_Vehicle_Odometer() {

        String actualGeneralInformation = createVehicleOdometerPage.generalInformation.getText();
        Assert.assertEquals("General Information", actualGeneralInformation);
    }

    @When("truck driver enter the invalid information on the vehicle odometer page")
    public void truck_driver_enter_the_invalid_informations_on_the_vehicle_odometer_page() {
        createVehicleOdometerPage.createOdometerVehicle.click();

        BrowserUtils.waitFor(5);

        createVehicleOdometerPage.odometervehicleInput.sendKeys("aynur");

        createVehicleOdometerPage.choosedate.click();
        Select selectM = new Select(createVehicleOdometerPage.month);

        selectM.selectByIndex(9);

        Select selectY = new Select(createVehicleOdometerPage.year);

        selectY.selectByIndex(20);

        createVehicleOdometerPage.day.click();
        createVehicleOdometerPage.driverInput.sendKeys("aynur");
        createVehicleOdometerPage.unitInput.click();
        createVehicleOdometerPage.km.click();
//        createVehicleOdometerPage.model.click();
//        createVehicleOdometerPage.modelInput.sendKeys("gul");

        createVehicleOdometerPage.saveAndClose.click();

        BrowserUtils.waitFor(3);
    }

    @Then("This value is invalid  information should display and truck driver can not create Vehicle Odometer")
    public void information_should_display_and_truck_driver_can_not_create_Vehicle_Odometer() {


        String actualMessage = createVehicleOdometerPage.errorMessage.getText();
        Assert.assertEquals("This value is not valid.", actualMessage);

        BrowserUtils.waitFor(10);
    }


    @When("click on the Create Vehicle Odometer button")
    public void click_on_the_Create_Vehicle_Odometer_button() {

        createVehicleOdometerPage.createOdometerVehicle.click();

        BrowserUtils.waitFor(5);
    }

    @And("click on the Add button on the Create Vehicle Odometer page")
    public void click_on_the_Add_button_on_the_Create_Vehicle_Odometer_page() {
        createVehicleOdometerPage.addBTNt.click();
        BrowserUtils.waitFor(10);
    }

    @Then("can see Licence Plate information window")
    public void can_see_Licence_Plate_information_window() {
        Assert.assertTrue(createVehicleOdometerPage.selectCarreservationWindowMessage.isDisplayed());

        BrowserUtils.waitFor(3);
    }


    @When("truck driver click on the view per page dropdown button on the licence plate information window")
    public void truck_driver_click_on_the_view_per_page_dropdown_button_on_the_licence_plate_information_window() {


        createVehicleOdometerPage.pageDropdownBNT.click();
        BrowserUtils.waitFor(3);


    }


    @When("truck driver select the per page number options")
    public void truck_driver_select_the_per_page_number_options() {
        createVehicleOdometerPage.pageDropdown.click();
        BrowserUtils.waitFor(3);
    }


    @Then("truck driver can select number of options per page on the licence plate information window")
    public void truckDriverCanSelectNumberOfOptionsPerPageOnTheLicencePlateInformationWindow() {


    }


    @When("truck driver click on Refresh button on the licence plate information window")
    public void truck_driver_click_on_Refresh_button_on_the_licence_plate_information_window() {

        BrowserUtils.waitFor(10);

        createVehicleOdometerPage.refreshwindowselectfirstrow.click();

        BrowserUtils.waitFor(3);

        createVehicleOdometerPage.refresh.click();

    }

    @Then("truck driver refresh the licence plate information window")
    public void truck_driver_refresh_the_licence_plate_information_window() {

        BrowserUtils.waitFor(3);

        Assert.assertTrue("verify refresh window is open", createVehicleOdometerPage.refreshconfirmationWindow.isDisplayed());

        BrowserUtils.waitFor(3);
        createVehicleOdometerPage.refreshconfirmationOkBTN.click();

        BrowserUtils.waitFor(3);
    }


    @When("truck driver click on the Reset button")
    public void truck_driver_click_on_the_Reset_button() {
        BrowserUtils.waitFor(3);
        createVehicleOdometerPage.selectTable2.click();
        BrowserUtils.waitFor(3);
        createVehicleOdometerPage.reset.click();
        BrowserUtils.waitFor(3);


    }

    @Then("truck driver can see reset confirmation window")
    public void truck_driver_can_see_reset_confirmation_window() {
        BrowserUtils.waitFor(3);
        Driver.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertTrue("verify refresh window is open", createVehicleOdometerPage.resetconfirmationWindow.isDisplayed());
    }

    @When("truck driver click on the OK button on the reset confirmation window")
    public void truck_driver_click_on_the_OK_button_on_the_reset_confirmation_window() {
        BrowserUtils.waitFor(3);
        createVehicleOdometerPage.resetconfirmationOkBTN.click();
        BrowserUtils.waitFor(3);
    }

    @Then("truck driver can reset the license plate")
    public void truck_driver_can_reset_the_license_plate() {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("click on the Grid Settings button on the licence plate information window")
    public void click_on_the_Grid_Settings_button_on_the_licence_plate_information_window() {
        BrowserUtils.waitFor(2);
        createVehicleOdometerPage.gearSetting.click();
    }

    @Then("can see Grid Settings window")
    public void can_see_Grid_Settings_window() {

        Assert.assertTrue("verify gear setting window is open", createVehicleOdometerPage.gearSettingWindow.isDisplayed());
        BrowserUtils.waitFor(3);
        createVehicleOdometerPage.unselectOne.click();
        BrowserUtils.waitFor(3);

    }

    @When("click on the Select All on the Grid Settings window")
    public void click_on_the_Select_All_on_the_Grid_Settings_window() {
        BrowserUtils.waitFor(3);
        JavascriptExecutor executor = (JavascriptExecutor) Driver.get();
        executor.executeScript("arguments[0].click();", createVehicleOdometerPage.allSelectBNT);


        //  JavascriptExecutor executor = (JavascriptExecutor) Driver.get();
        //  executor.executeScript("arguments[0].scrollIntoView(true).click();",
        // createVehicleOdometerPage.allSelectBNT);


        //   createVehicleOdometerPage.allSelectBNT.click();

        //createVehicleOdometerPage.allSelectBNT.click();


    }

    @Then("can see assinged and license plate on the table")
    public void can_see_assinged_and_license_plate_on_the_table() {
        BrowserUtils.waitFor(3);
        createVehicleOdometerPage.closeBNT.click();
    }


    @When("select license plate from the top the list and click the select button")
    public void select_license_plate_from_the_top_the_list_and_click_the_select_button() {

        BrowserUtils.waitFor(3);
        createVehicleOdometerPage.selectTable.click();
        BrowserUtils.waitFor(2);
        createVehicleOdometerPage.selectBNT.click();
        BrowserUtils.waitFor(3);
    }

    @Then("can see selected license plate on the list")
    public void canSeeSelectedLicensePlateOnTheList() {

        createVehicleOdometerPage.licensePlate.isDisplayed();

        Assert.assertTrue("verify license plate is shown", createVehicleOdometerPage.licensePlate.isDisplayed());


    }


    //US-21
    @When("the user navigates to {string} , {string}")
    public void the_user_navigates_to(String tab, String module) {


        BrowserUtils.waitFor(1);
        navigateToModule(tab, module);


    }

    @When("the user click first odometer information on the table")
    public void the_user_click_first_odometer_information_on_the_table() {


        BrowserUtils.waitFor(12);

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

        String actualTitle = new VehicleOdometerPage().GenaeralText.getText();
        String expectedTitle = "General";
        Assert.assertEquals(expectedTitle, actualTitle);

        BrowserUtils.waitFor(1);

    }

    @When("the user enter the valid values")
    public void the_user_enter_the_valid_values() {


        VehicleOdometerPage vehicleOdometer_page = new VehicleOdometerPage();

        vehicleOdometer_page.odometerValue.click();
        BrowserUtils.waitFor(1);
        vehicleOdometer_page.odometerValue.clear();
        vehicleOdometer_page.odometerValue.sendKeys("215");

        //=======date===========
        vehicleOdometer_page.chooseDate.click();
        BrowserUtils.waitFor(1);
        Select select = new Select(vehicleOdometer_page.monthSelect);

        select.selectByIndex(4);

        Select selectYear = new Select(vehicleOdometer_page.yearSelect);

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
        VehicleOdometerPage vehicleOdometer_page = new VehicleOdometerPage();
        //
        String actualDisplayMessage = vehicleOdometer_page.entityMessage.getText();
//        Alert alert=Driver.get().switchTo().alert();
//        String actualDisplayMessage=alert.getText();
        Assert.assertEquals(expectedMessage, actualDisplayMessage);

    }

    @When("the user enter letter as a Odometer Value")
    public void the_user_enter_letter_as_a_Odometer_Value() {

        VehicleOdometerPage vehicleOdometer_page = new VehicleOdometerPage();

        vehicleOdometer_page.odometerValue.click();
        BrowserUtils.waitFor(1);
        vehicleOdometer_page.odometerValue.clear();
        vehicleOdometer_page.odometerValue.sendKeys("ford");

        BrowserUtils.waitFor(2);

    }

//    @Then("{string} error message should be displayed")
//    public void error_message_should_be_displayed(String expectedErrorMessage) {
//
//        String actualMessage=new VehicleOdometerPage().odometerMessage.getText();
//        Assert.assertEquals(expectedErrorMessage,actualMessage);
//
//
//    }

    @Then("{string} error message should be displayed")
    public void error_message_should_be_displayed(String expectedErrorMessage) {

        String actualMessage = new VehicleOdometerPage().AlertMessage.getText();
        Assert.assertEquals(expectedErrorMessage, actualMessage);


    }

//US-22

    // CreateVehicleOdometerPage createVehicleOdometerPage=new CreateVehicleOdometerPage();

    @Given("navigate Fleet to Vehicle Odometer")
    public void navigate_Fleet_to_Vehicle_Odometer() {
        navigateToModule("Fleet", "Vehicle Odometer");
        BrowserUtils.waitFor(10);
    }

    @And("select any vehicle odometer on the Vehicle Odometer list")
    public void select_any_vehicle_odometer_on_the_Vehicle_Odometer_list() {

        createVehicleOdometerPage.vechileOdometerlist.click();
        BrowserUtils.waitFor(10);
    }

    @And("click on the Delete Button to delete Vehicle Odometer")
    public void click_on_the_Delete_Button_to_delete_Vehicle_Odometer() {
        createVehicleOdometerPage.deleteBNT.click();
        BrowserUtils.waitFor(3);
    }

    @Then("can see the delete confirmation window")
    public void can_see_the_delete_confirmation_window() {
        createVehicleOdometerPage.deleteconfirmationWindow.isDisplayed();
        BrowserUtils.waitFor(3);

    }

    @When("click on the Yes, Delete Button on the delete confirmation window")
    public void click_on_the_Yes_Delete_Button_on_the_delete_confirmation_window() {
        createVehicleOdometerPage.yesDeleteBNT.click();
        BrowserUtils.waitFor(3);
    }

    @Then("vehicle odometer deleted from the list")
    public void vehicle_odometer_deleted_information_display() {

        String actualuRL = Driver.get().getCurrentUrl();
        String expectedUrl = "https://qa.transmuda.com/entity/Extend%5CEntity%5CVehiclesOdometer";

        Assert.assertEquals(expectedUrl, actualuRL);

    }

//US-23

    @When("the user click Add Attachment Button")
    public void the_user_click_Add_Attachment_Button() {

        new VehicleOdometerPage().addAttachmentButton.click();
        BrowserUtils.waitFor(5);

    }

    @Then("user should be able to enter valid input to Add Attachment window")
    public void user_should_be_able_to_enter_valid_input_to_Add_Attachment_window() throws AWTException {

        VehicleOdometerPage vehicleOdometerPage = new VehicleOdometerPage();


        System.out.println(vehicleOdometerPage.fullPath);
        vehicleOdometerPage.chooseFileButton.sendKeys(vehicleOdometerPage.fullPath);
        BrowserUtils.waitFor(1);


        vehicleOdometerPage.commentBox.sendKeys("text");

        vehicleOdometerPage.selectOwnerButton.click();
        BrowserUtils.waitFor(2);
        vehicleOdometerPage.manageFilters.click();
        BrowserUtils.waitFor(3);
        vehicleOdometerPage.firstNameCheckBox.click();

        vehicleOdometerPage.lastName.click();
        BrowserUtils.waitFor(1);
        vehicleOdometerPage.containsOfLastname.click();
        BrowserUtils.waitFor(1);
        vehicleOdometerPage.isEqualTo.click();
        BrowserUtils.waitFor(1);
        vehicleOdometerPage.nameBox.sendKeys("admin");
        vehicleOdometerPage.lastNameUpdateButton.click();
        BrowserUtils.waitFor(3);
        vehicleOdometerPage.firstOwnerRow.click();


    }

    @When("the user click Save Button")
    public void the_user_click_Save_Button() {

        BrowserUtils.waitFor(3);
        new VehicleOdometerPage().saveButton.click();

    }

    //    @Then("{string} message should be displayed")
//    public void message_should_be_displayed(String expectedMessage) {
//
//        BrowserUtils.waitFor(3);
//        String actualMessage = new VehicleOdometerPage().fileErrorMessage.getText();
//        Assert.assertEquals(expectedMessage, actualMessage);
//    }
    @Then("{string} message should be displayed")
    public void message_should_be_displayed(String expectedMessage) {

        BrowserUtils.waitFor(3);
        String actualMessage = new VehicleOdometerPage().AlertMessage.getText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @When("the user click Save Button without any choose file")
    public void the_user_click_Save_Button_without_any_choose_file() {


        new VehicleOdometerPage().saveButton.click();
        BrowserUtils.waitFor(1);


    }

// To do Berky
//    @Then("{string} error message should be displayed.")
//    public void error_message_should_be_displayed(String expectedMessage) {
//
//
//        String actualMessage = new VehicleOdometerPage().fileChoosingErrorMessage.getText();
//        Assert.assertEquals(expectedMessage, actualMessage);
//
//
//    }

    //US-24
    @Then("expected title should be {string}")
    public void expected_title_should_be(String expectedTitle) {

        BrowserUtils.waitFor(5);
        String title = Driver.get().getTitle();
        Assert.assertEquals(expectedTitle, title);

    }

//    @Then("{string} message should be displayed.")
//    public void message_should_be_displayed(String expectedPermissionMessage) {
//
//        BrowserUtils.waitFor(5);
//        String actualPermissionMessage= new VehicleOdometerPage().permissionMessage.getText();
//        Assert.assertEquals(expectedPermissionMessage,actualPermissionMessage);
//
//
//    }


    //US-25


}









