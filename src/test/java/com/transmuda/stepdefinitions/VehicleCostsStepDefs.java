package com.transmuda.stepdefinitions;

import com.transmuda.pages.GridBasePage;
import com.transmuda.pages.VehicleCostsPage;
import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class VehicleCostsStepDefs extends GridBasePage {

//US-25

    VehicleCostsPage vehicleCostsPage = new VehicleCostsPage();

    @Given("navigate to Fleet Vehicle Costs")
    public void navigate_to_Fleet_Vehicle_Costs() {
        navigateToModule("Fleet", "Vehicle Costs");
        BrowserUtils.waitFor(10);
    }


    @When("click on the Page button on the Vehicle Costs page")
    public void click_on_the_Page_button_on_the_Vehicle_Costs_page() {
        vehicleCostsPage.pageChangeButton.click();
        BrowserUtils.waitFor(3);
    }

    @Then("truck driver can change page number")
    public void truck_driver_can_change_page_number() {
        // truck driver can change page number

    }

    @When("click on the View Per Page button on the Vehicle Costs page")
    public void click_on_the_View_Per_Page_button_on_the_Vehicle_Costs_page() {
        vehicleCostsPage.viewPerPageChooseButton.click();
        BrowserUtils.waitFor(2);
    }

    @Then("truck driver can change the entity number")
    public void truck_driver_can_change_the_entity_number() {

        vehicleCostsPage.perPage10Button.click();
        BrowserUtils.waitFor(3);
        vehicleCostsPage.viewPerPageChooseButton.click();
        vehicleCostsPage.perPage25Button.click();
        BrowserUtils.waitFor(3);
        vehicleCostsPage.viewPerPageChooseButton.click();
        vehicleCostsPage.perPage50Button.click();
        BrowserUtils.waitFor(3);
        vehicleCostsPage.viewPerPageChooseButton.click();
        vehicleCostsPage.perPage100Button.click();
        BrowserUtils.waitFor(3);
    }

    @When("click on the Export Grid CSV button on the Vehicle Costs page")
    public void click_on_the_Export_Grid_CSV_button_on_the_Vehicle_Costs_page() {
        vehicleCostsPage.exportGridButton.click();
        BrowserUtils.waitFor(3);
        vehicleCostsPage.csvButton.click();
    }

    @When("click on the Export Grid XLSX button on the Vehicle Costs page")
    public void click_on_the_Export_Grid_XLSX_button_on_the_Vehicle_Costs_page() {
        vehicleCostsPage.exportGridButton.click();
        BrowserUtils.waitFor(2);
        vehicleCostsPage.xlsxButton.click();
    }

    @Then("truck driver can get all informations to own email adress")
    public void truck_driver_can_get_all_informations_to_own_email_adress() {
        String expectMessage = "Export started successfully. You will receive email notification upon completion.";
        BrowserUtils.waitFor(3);
        Assert.assertTrue(vehicleCostsPage.AlertMessage.getText().contains(expectMessage));

    }

//US-27

    @Given("truck driver navigate Fleet to Vehicle Costs")
    public void truck_driver_navigate_Fleet_to_Vechicle_Costs() {
        navigateToModule("Fleet", "Vehicle Costs");
        BrowserUtils.waitFor(5);
    }

    @When("click on the Add sign on the Vehicle Costs page")
    public void click_on_the_Add_sign_on_the_Vehicle_Costs_page() {
        vehicleCostsPage.AddSign.click();
        BrowserUtils.waitFor(7);
    }

    @And("click on the Recent emails Add Button on the  Sidebar Widgets")
    public void click_on_the_Recent_emails_Add_Button_on_the_Sidebar_Widgets() {
        vehicleCostsPage.recentAddBNT.click();
        BrowserUtils.waitFor(3);

    }

    @And("click on the Sticky Note Add Button on the Sidebar Widgets")
    public void click_on_the_Sticky_Note_Add_Button_on_the_Sidebar_Widgets() {
        vehicleCostsPage.stickyAddBNT.click();
        BrowserUtils.waitFor(3);


    }

    @And("click on the Task list Add Button on the Sidebar Widgets")
    public void click_on_the_Task_list_Add_Button_on_the_Sidebar_Widgets() {
        vehicleCostsPage.tasklistAddBNT.click();
        BrowserUtils.waitFor(3);
    }

    @And("clikc on the close button on the Sidebar Widgets")
    public void clikc_on_the_close_button_on_the_Sidebar_Widgets() {

        vehicleCostsPage.closeAddBNT.click();
        BrowserUtils.waitFor(3);

    }

    @Then("truck driver can add Recent Email, Sticky Note and Task list")
    public void truck_driver_can_add_Recent_Email_Sticky_Note_and_Task_list() {


        Assert.assertTrue("verify email is added", vehicleCostsPage.amilIcon.isDisplayed());
        BrowserUtils.waitFor(3);
        Assert.assertTrue("verify sticky note is added", vehicleCostsPage.stickyIcon.isDisplayed());
        BrowserUtils.waitFor(3);

        Assert.assertTrue("verify sticky note is added", vehicleCostsPage.tasklistIcon.isDisplayed());
        BrowserUtils.waitFor(3);


    }


    @When("click on the pin sign on the Vehicle Costs page")
    public void click_on_the_pin_sign_on_the_Vehile_Costs_page() {


        vehicleCostsPage.pinIcon.click();
        BrowserUtils.waitFor(3);


    }

    @And("click on the Favorite sign on the Vehicle Costs page")
    public void click_on_the_Favorite_sign_on_the_Vehcile_Costs_page() {

        vehicleCostsPage.favoriteIcon.click();
        BrowserUtils.waitFor(3);

    }

    @Then("truck driver can pin, favorite the page")
    public void truck_driver_can_pin_favorite_the_page() {

        Assert.assertTrue("verify the page can pin and ", vehicleCostsPage.addpinInformation.isDisplayed());
        BrowserUtils.waitFor(3);

    }


    // US-30 -- Sukru

    @And("click on the table row {string}")
    public void clickOnTheTableFirstRow(String Text) {
        BrowserUtils.waitFor(8);
        findRowWebElement("Type", Text).click();
    }

    @Then("Truck Driver can see all information about specific record {string}")
    public void truckDriverCanSeeAllInformationAboutSpecificRecord(String text) {
        BrowserUtils.waitFor(3);
        Assert.assertTrue(VehicleCostsPage.elementNamedElement(text).isDisplayed());
    }

    //======US-28   Hamdulla====
//    @When("Navigate to Fleet Vehicle Costs.")
//    public void navigate_to_Fleet_Vehicle_Costs() {
//        navigateToModule("Fleet", "Vehicle Costs");
//        BrowserUtils.waitFor(8);
//
//    }

    @Then("Truck driver should be able to see costs information")
    public void truck_driver_should_be_able_to_see_costs_information() {
        Assert.assertTrue(vehicleCostsPage.allVehicleCosts.isDisplayed());
        BrowserUtils.waitFor(2);


    }

    @When("Move to ... sign and click on Eye Button of any Vehicle Costs.")
    public void move_to_sign_and_click_on_Eye_Button_of_any_Vehicle_Costs() {
        // Actions actions = new Actions(driver);
        // actions.moveToElement(vehicleCostsPage.PoinsSignOfTaxRoll1).perform();
        vehicleCostsPage.PoinsSignOfTaxRoll1.click();
        BrowserUtils.waitFor(5);
        vehicleCostsPage.PoinsSignOfTaxRoll1.click();
        vehicleCostsPage.EyeButton.click();
        BrowserUtils.waitFor(3);


    }

    @Then("Truck driver can view specific Vehicle Cost.")
    public void truck_driver_can_view_specific_Vehicle_Cost() {
        String actualItemTitle = vehicleCostsPage.TaxRoll1Title.getText();
        String expectedItemTitle = vehicleCostsPage.TaxRoll1Type.getText();
        Assert.assertEquals(expectedItemTitle, actualItemTitle);
        BrowserUtils.waitFor(5);

    }

    @When("Move to ... sign and click on Delete Button of any Vehicle Costs.")
    public void move_to_sign_and_click_on_Delete_Button_of_any_Vehicle_Costs() {
        // Actions actions = new Actions(driver);
        // actions.moveToElement(vehicleCostsPage.PoinsSignOfTaxRoll1).perform();
        vehicleCostsPage.PoinsSignOfTaxRoll1.click();
        BrowserUtils.waitFor(5);
        vehicleCostsPage.PoinsSignOfTaxRoll1.click();
        vehicleCostsPage.DeleteButton.click();
        vehicleCostsPage.DeleteYesButton.click();
        BrowserUtils.waitFor(3);

    }

    @Then("Truck driver can not delete Vehicle Cost.")
    public void truck_driver_can_not_delete_Vehicle_Cost() {
        Assert.assertTrue(vehicleCostsPage.DeleteErrorMessage.isDisplayed());
        BrowserUtils.waitFor(3);


    }

    @When("Move to ... sign and click on Edit Button of any Vehicle Costs.")
    public void move_to_sign_and_click_on_Edit_Button_of_any_Vehicle_Costs() {
        // Actions actions = new Actions(driver);
        // actions.moveToElement(vehicleCostsPage.PoinsSignOfTaxRoll1).perform();
        vehicleCostsPage.PoinsSignOfTaxRoll1.click();
        BrowserUtils.waitFor(5);
        vehicleCostsPage.PoinsSignOfTaxRoll1.click();
        vehicleCostsPage.EditButton.click();
        BrowserUtils.waitFor(3);

    }

    @Then("Truck driver can not edit Vehicle Cost.")
    public void truck_driver_can_not_edit_Vehicle_Cost() {
        String EditResultTitle = vehicleCostsPage.EditResultQuickLaunchpad.getText();
        Assert.assertEquals("Quick Launchpad", EditResultTitle);
        BrowserUtils.waitFor(3);


    }


    // US-31    Hamdulla  ====
    @When("Click on any Vehicle Cost.")
    public void click_on_any_Vehicle_Cost() {
        vehicleCostsPage.TaxRoll1.click();
        BrowserUtils.waitFor(5);

    }

    @When("Click on Add Event Button on the specific Vehicle Cost Page.")
    public void click_on_Add_Event_Button_on_the_specific_Vehicle_Cost_Page() {
        vehicleCostsPage.AddEventButton.click();
        BrowserUtils.waitFor(4);

    }

    @Then("Truck driver can see Add Event Window.")
    public void truck_driver_can_see_Add_Event_Window() {
        String AddEveWindowTitle = vehicleCostsPage.AddEventWindow.getText();
        Assert.assertEquals("Add Event", AddEveWindowTitle);
        BrowserUtils.waitFor(3);


    }

    @Then("Fill all information on the Add Event Window and click on Save Button.")
    public void fill_all_information_on_the_Add_Event_Window_and_click_on_Save_Button() {
        String EventName = "Victory";
        vehicleCostsPage.TitleInputBox.sendKeys(EventName);
        BrowserUtils.waitFor(1);
        vehicleCostsPage.OrganizerNameBox.sendKeys("Hamdulla");
        BrowserUtils.waitFor(1);
        vehicleCostsPage.OrganizerEmailBox.sendKeys("hamdulla@yahoo.com");
        BrowserUtils.waitFor(1);
        vehicleCostsPage.StartDate.click();
        BrowserUtils.waitFor(4);
        vehicleCostsPage.Date10.click();
        BrowserUtils.waitFor(4);
        vehicleCostsPage.StartHour.click();
        BrowserUtils.waitFor(4);
        vehicleCostsPage.Hour8AM.click();
        BrowserUtils.waitFor(4);
        vehicleCostsPage.EndDate.click();
        BrowserUtils.waitFor(3);
        vehicleCostsPage.Date12.click();
        BrowserUtils.waitFor(3);
        vehicleCostsPage.EndHour.click();
        BrowserUtils.waitFor(3);
        vehicleCostsPage.Hour607PM.click();
        BrowserUtils.waitFor(3);
        vehicleCostsPage.SaveButton.click();
        BrowserUtils.waitFor(3);


    }

    @Then("Truck driver can see new calendar event on that specific vehicle cost page.")
    public void truck_driver_can_see_new_calendar_event_on_that_specific_vehicle_cost_page() {
        Assert.assertEquals("Victory", vehicleCostsPage.EventName.getText());
        BrowserUtils.waitFor(3);


    }

    @Then("Click on Save Button without filling any information.")
    public void click_on_Save_Button_without_filling_any_information() {
        vehicleCostsPage.SaveButton.click();
        BrowserUtils.waitFor(3);

    }

    @Then("{string} error message should be displayed.")
    public void error_message_should_be_displayed(String string) {
        Assert.assertEquals(string, vehicleCostsPage.ErrorMessage.getText());
        BrowserUtils.waitFor(2);
        vehicleCostsPage.CancelButton.click();
        BrowserUtils.waitFor(2);


    }

    @When("Click on that specific Vehicle Cost.")
    public void click_on_that_specific_Vehicle_Cost() {
        vehicleCostsPage.TaxRoll1.click();
        BrowserUtils.waitFor(3);

    }

    @Then("Truck driver can see the Event under the General.")
    public void truck_driver_can_see_the_Event_under_the_General() {
        Assert.assertEquals("Victory", vehicleCostsPage.EventName.getText());
        BrowserUtils.waitFor(3);

    }

    @When("Click on the Activity Button on that specific VehiclVehicle Cost page.")
    public void click_on_the_Activity_Button_on_that_specific_VehiclVehicle_Cost_page() {
        vehicleCostsPage.ActivityTab.click();
        BrowserUtils.waitFor(3);

    }

    @Then("Truck driver can see the Event under the Activity.")
    public void truck_driver_can_see_the_Event_under_the_Activity() {
        Assert.assertEquals("Victory", vehicleCostsPage.EventName.getText());
        BrowserUtils.waitFor(3);

    }


//US-33

    String actualPageNumber;

    @Then("the user should be able to see costs information")
    public void the_user_should_be_able_to_see_costs_information() {

        Assert.assertTrue(vehicleCostsPage.allVehicleCosts.isDisplayed());


    }

    @When("the user click Page button to next page or previous page")
    public void the_user_click_Page_button_to_next_page_or_previous_page() {

        BrowserUtils.waitFor(10);

        vehicleCostsPage.viewPerPageChooseButton.click();
        BrowserUtils.waitFor(3);
        vehicleCostsPage.perPage10Button.click();

        BrowserUtils.waitFor(5);
        actualPageNumber = vehicleCostsPage.pageNumber.getAttribute("value");
        System.out.println("actualPageNumber = " + actualPageNumber);
        vehicleCostsPage.pageChangeButton.click();


    }

    @Then("the user should be able to see next or previous page")
    public void the_user_should_be_able_to_see_next_or_previous_page() {
        BrowserUtils.waitFor(5);

        Boolean page = false;

        String nextPage = vehicleCostsPage.pageNumber.getAttribute("value");

        System.out.println("nextPage = " + nextPage);

        if (!actualPageNumber.equals(nextPage)) {
            page = true;
        } else {
            page = false;
        }

        vehicleCostsPage.previousPage.click();
        BrowserUtils.waitFor(5);
        String verifyPreviousPage = vehicleCostsPage.pageNumber.getAttribute("value");

        System.out.println("verifyPreviousPage = " + verifyPreviousPage);
        Assert.assertEquals(actualPageNumber, verifyPreviousPage);
        BrowserUtils.waitFor(5);
        System.out.println("pass");


    }

    @Then("the user click View Per Page button")
    public void the_user_click_View_Per_Page_button() {

        vehicleCostsPage.viewPerPageChooseButton.click();
        BrowserUtils.waitFor(5);

    }

    @Then("the user should be able to see entity number of View Per page")
    public void the_user_should_be_able_to_see_entity_number_of_View_Per_page() {

        Assert.assertTrue(vehicleCostsPage.perPage10Button.isDisplayed());
        Assert.assertTrue(vehicleCostsPage.perPage25Button.isDisplayed());
        Assert.assertTrue(vehicleCostsPage.perPage50Button.isDisplayed());
        Assert.assertTrue(vehicleCostsPage.perPage100Button.isDisplayed());
        BrowserUtils.waitFor(5);

    }

    @When("the user click any entity number in the View Per Page drop List")
    public void the_user_click_any_entity_number_in_the_View_Per_Page_drop_List() {


        vehicleCostsPage.perPage10Button.click();
    }

    @Then("System should be change the entity number of View Per Page")
    public void system_should_be_change_the_entity_number_of_View_Per_Page() {

        String verifyEntity = vehicleCostsPage.viewPerPageChooseButton.getText();
        System.out.println("verifyEntity = " + verifyEntity);

        Assert.assertEquals("10", verifyEntity);

    }

    @Then("the user click Export Grid button")
    public void the_user_click_Export_Grid_button() {

        vehicleCostsPage.exportGridButton.click();

    }

    @When("the user select any options of Export Grid Button")
    public void the_user_select_any_options_of_Export_Grid_Button() {

        BrowserUtils.waitFor(2);
        vehicleCostsPage.csvButton.click();

    }

    @Then("{string} Email message should be displayed")
    public void email_message_should_be_displayed(String expectedMessage) {

        BrowserUtils.waitFor(2);
        String actualMessage = vehicleCostsPage.AlertMessage.getText();
        String arrangeMessage = actualMessage.substring(1).trim();
        System.out.println("arrangeMessage = " + arrangeMessage);
        System.out.println("actualMessage = " + actualMessage);

        Assert.assertEquals(expectedMessage, arrangeMessage);

        //lazy way
        Assert.assertTrue(vehicleCostsPage.AlertMessage.isDisplayed());


    }

//us-34

    @Then("click Grid Settings Button")
    public void click_Grid_Settings_Button() {

        BrowserUtils.waitFor(1);
        vehicleCostsPage.gridSettingsButton.click();

        BrowserUtils.waitFor(1);

    }

    @When("the user select any check box related columns")
    public void the_user_select_any_check_box_related_columns() {


        if (vehicleCostsPage.idCheckBox.isSelected()) {

        } else {
            vehicleCostsPage.idCheckBox.click();
        }
        BrowserUtils.waitFor(1);

        if (vehicleCostsPage.typeCheckBox.isSelected()) {

        } else {
            vehicleCostsPage.typeCheckBox.click();
        }

        BrowserUtils.waitFor(1);

        if (vehicleCostsPage.totalPriceCheckBox.isSelected()) {

        } else {
            vehicleCostsPage.totalPriceCheckBox.click();
        }

        BrowserUtils.waitFor(1);

        if (vehicleCostsPage.dateCheckBox.isSelected()) {

        } else {
            vehicleCostsPage.dateCheckBox.click();
        }


    }

    @Then("selected columns should be attached on the current page")
    public void selected_columns_should_be_attached_on_the_current_page() {

        BrowserUtils.waitFor(1);

        String actualIdColumn = vehicleCostsPage.idColumn.getText();
        System.out.println("actualIdColumn = " + actualIdColumn);


        String actualTypeColumn = vehicleCostsPage.typeColumn.getText();
        System.out.println("actualTypeColumn = " + actualTypeColumn);


        String actualTotalPrice = vehicleCostsPage.totalPriceColumn.getText();
        System.out.println("actualTotalPrice = " + actualTotalPrice);


        String actualDate = vehicleCostsPage.dateColumn.getText();
        System.out.println("actualDate = " + actualDate);


        Assert.assertEquals("ID", actualIdColumn);
        Assert.assertEquals("TYPE", actualTypeColumn);
        Assert.assertEquals("TOTAL PRICE", actualTotalPrice);
        Assert.assertEquals("DATE", actualDate);


    }

    @Then("click Filters Button")
    public void click_Filters_Button() {

        vehicleCostsPage.filterButton.click();


    }

    @When("the user click Manage Filters Button")
    public void the_user_click_Manage_Filters_Button() {

        BrowserUtils.waitFor(1);
        vehicleCostsPage.manageFiltersButton.click();

    }

    @Then("the user should be able to filter informations")
    public void the_user_should_be_able_to_filter_informations() {

        vehicleCostsPage.typeFilterBox.click();
        BrowserUtils.waitFor(2);
        vehicleCostsPage.totalPriceFilterBox.click();
        BrowserUtils.waitFor(5);
        vehicleCostsPage.dateFilterBox.click();
        BrowserUtils.waitFor(2);

        Assert.assertTrue(vehicleCostsPage.typeAll.isDisplayed());
        Assert.assertTrue(vehicleCostsPage.totalPriceAll.isDisplayed());
        Assert.assertTrue(vehicleCostsPage.dateAll.isDisplayed());


    }

    String previousRecordNumber = null;
    String currentRecordNumber = null;

    @When("the user click Refresh Button")
    public void the_user_click_Refresh_Button() {

        // take open new tab

        BrowserUtils.waitFor(10);
        previousRecordNumber = String.valueOf(getTotalRecords());

        System.out.println("previousRecordNumber = " + previousRecordNumber);
        openNewTab();
        BrowserUtils.waitFor(2);

        changeToNewWindow();
        BrowserUtils.waitFor(2);


        Driver.get().get("https://qa.transmuda.com/entity/update/Extend_Entity_VehicleCosts/item");

        BrowserUtils.waitFor(3);
        vehicleCostsPage.saveAndClose.click();
        BrowserUtils.waitFor(3);
        changeToNewWindow();
        BrowserUtils.waitFor(2);
        vehicleCostsPage.refreshButton.click();
        BrowserUtils.waitFor(2);
        currentRecordNumber = String.valueOf(getTotalRecords());
        System.out.println("actualPageNumber = " + actualPageNumber);


    }

    @Then("system should be able to refresh the page")
    public void system_should_be_able_to_refresh_the_page() {

        BrowserUtils.waitFor(3);


        Assert.assertNotEquals(previousRecordNumber, currentRecordNumber);

    }

    @When("the user click Reset Button")
    public void the_user_click_Reset_Button() {
        vehicleCostsPage.filterButton.click();
        BrowserUtils.waitFor(1);

        vehicleCostsPage.manageFiltersButton.click();
        BrowserUtils.waitFor(1);
        vehicleCostsPage.typeFilterBox.click();
        BrowserUtils.waitFor(1);
        vehicleCostsPage.totalPriceFilterBox.click();
        BrowserUtils.waitFor(1);
        vehicleCostsPage.dateFilterBox.click();
        BrowserUtils.waitFor(1);

        Assert.assertTrue(vehicleCostsPage.typeAll.isDisplayed());
        Assert.assertTrue(vehicleCostsPage.totalPriceAll.isDisplayed());
        Assert.assertTrue(vehicleCostsPage.dateAll.isDisplayed());

        vehicleCostsPage.resetButton.click();
        BrowserUtils.waitFor(5);

    }

    @Then("system should be able to reset the filtering settings")
    public void system_should_be_able_to_reset_the_filtering_settings() {


        vehicleCostsPage.manageFiltersButton.click();
        BrowserUtils.waitFor(1);

        Assert.assertFalse(vehicleCostsPage.typeFilterBox.isSelected());

        Assert.assertFalse(vehicleCostsPage.totalPriceFilterBox.isSelected());

        Assert.assertFalse(vehicleCostsPage.dateFilterBox.isSelected());


    }

    //US-35

    @Given("sales manager navigate Fleet to Vehicle Costs")
    public void salesManagerNavigateFleetToVehicleCosts() {

        navigateToModule("Fleet", "Vehicle Costs");
        BrowserUtils.waitFor(3);

    }

    @When("click on Add sign on the sidebar widgets")
    public void clickOnAddSignOnTheSidebarWidgets() {
        vehicleCostsPage.AddSign.click();
        BrowserUtils.waitFor(3);

    }


    @And("click on Recent Emial Add Button on the sidebar widgets window")
    public void clickOnRecentEmialAddButtonOnTheSidebarWidgetsWindow() {
        vehicleCostsPage.recentAddBNT.click();
        BrowserUtils.waitFor(3);
    }


    @And("click on Sticky Note Add Button on the sidebar widgets window")
    public void clickOnStickyNoteAddButtonOnTheSidebarWidgetsWindow() {
        vehicleCostsPage.stickyIcon.click();
        BrowserUtils.waitFor(3);
    }


    @And("click on Task list Add Button on the sidebar widgets window")
    public void clickOnTaskListAddButtonOnTheSidebarWidgetsWindow() {
        vehicleCostsPage.tasklistIcon.click();
        BrowserUtils.waitFor(3);
    }

    @And("click on Close Button on the sidebar widgets window")
    public void clickOnCloseButtonOnTheSidebarWidgetsWindow() {
        vehicleCostsPage.closeAddBNT.click();
        BrowserUtils.waitFor(3);
    }

    @Then("sales manager can use sidebar widgets on the vehicle cost page")
    public void salesManagerCanUseSidebarWidgetsOnTheVehicleCostPage() {

        Assert.assertTrue("verify email is added", vehicleCostsPage.amilIcon.isDisplayed());
        BrowserUtils.waitFor(3);
        Assert.assertTrue("verify sticky note is added", vehicleCostsPage.stickyIcon.isDisplayed());
        BrowserUtils.waitFor(3);

        Assert.assertTrue("verify sticky note is added", vehicleCostsPage.tasklistIcon.isDisplayed());
        BrowserUtils.waitFor(3);

    }

    @Given("sales manager navigate Fleet to Vehicle Costs page")
    public void salesManagerNavigateFleetToVehicleCostsPage() {
        navigateToModule("Fleet", "Vehicle Cost");
        BrowserUtils.waitFor(3);

    }

    @When("click on the Pin Icon on the Vehicle Costs page")
    public void clickOnThePinIconOnTheVehicleCostsPage() {
        vehicleCostsPage.pinIcon.click();
        BrowserUtils.waitFor(3);
    }

    @And("click on the Favourite on the Vehicle Costs page")
    public void clickOnTheFavouriteOnTheVehicleCostsPage() {
        vehicleCostsPage.favoriteIcon.click();
        BrowserUtils.waitFor(3);
    }

    @Then("sales manager can pin, favourite the Vehicle Costs page")
    public void salesManagerCanPinFavouriteTheVehicleCostsPage() {
        Assert.assertTrue(vehicleCostsPage.addpinInformation.isDisplayed());
        BrowserUtils.waitFor(3);

    }

    @When("click on the Username Dropdown Icon on Vehicle Costs page")
    public void clickOnTheUsernameDropdownIconOnVehicleCostsPage() {
        vehicleCostsPage.facaretDown.click();
        BrowserUtils.waitFor(3);
    }

    @And("select the Logout on the Dropdown list")
    public void selectTheLogoutOnTheDropdownList() {
        vehicleCostsPage.logOutLink.click();
        BrowserUtils.waitFor(3);
    }

    @Then("user able to log out")
    public void userAbleToLogOut() {

    }

    @Given("the user login as a “sales manager")
    public void theUserLoginAsASalesManager() {
        //Yasin please correct this method
        String actualUrl = Driver.get().getCurrentUrl();
        String expectedUrl = "https://qa.transmuda.com/user/login";
        Assert.assertEquals(expectedUrl, actualUrl);
        BrowserUtils.waitFor(3);


    }


    @When("click on  favourites dropdown")
    public void clickOnFavouritesDropdown() {

        vehicleCostsPage.facbars.click();
        BrowserUtils.waitFor(3);
    }

    @And("click  on  favourites button")
    public void clickOnFavouritesButton() {

        vehicleCostsPage.favoritesContent.click();
        BrowserUtils.waitFor(3);


    }


    @Then("user should be able to see favourites top page and page pin")
    public void userShouldBeAbleToSeeFavouritesTopPageAndPagePin() {

        Assert.assertTrue(vehicleCostsPage.VehicleCostsEntitiesSystem.isDisplayed());
        Assert.assertTrue(vehicleCostsPage.addpinInformation.isDisplayed());
        BrowserUtils.waitFor(3);
    }

    //US-29


    @When("the user click Create Vehicle Costs")
    public void the_user_click() {
        BrowserUtils.waitFor(15);
        vehicleCostsPage.createVehicleCostsButton.click();
    }

    @When("the user click {string}")
    public void the_user_click(String string) {

    }

    @When("the user select Type as {string}")
    public void the_user_select_Type_as(String string) {
        // BrowserUtils.waitForClickablility(vehicleCostsPage.typeDropDown,20);
        BrowserUtils.waitFor(5);
        vehicleCostsPage.typeDropDown.click();
        BrowserUtils.waitFor(2);
        vehicleCostsPage.taxRollDropDownItem.click();
    }

    @When("the user enter value to Total Price as {string}")
    public void the_user_enter_value_to_Total_Price_as(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("verify {string} validation message appeared")
    public void verify_validation_message_appeared(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user enter value to Total Price as {int}")
    public void the_user_enter_value_to_Total_Price_as(Integer int1) {
        BrowserUtils.waitFor(2);
        vehicleCostsPage.totalPriceInputBox.sendKeys(int1.toString());
    }

    @When("the user choose date as {string}")
    public void the_user_choose_date_as(String string) {
        //vehicleCostsPage.dateInputBox.sendKeys(string);
        vehicleCostsPage.dateInputBox.click();
        //System.out.println(vehicleCostsPage.getCurrentDate());
        BrowserUtils.waitFor(1);
        vehicleCostsPage.daySelectorToday.click();

    }

    @When("the user write Cost Description {string}")
    public void the_user_write_Cost_Description(String text) {
        vehicleCostsPage.costDescriptionInputBox.click();
        vehicleCostsPage.costDescriptionInputBox.sendKeys(text);
    }

    @When("the user click Save And Close")
    public void the_user_click_Save_And_Close() {
        BrowserUtils.waitFor(1);
        vehicleCostsPage.saveAndCloseSubmitButton.click();
    }

    @When("the user select first chassis number")
    public void the_user_select_first_chassis_number() {
        BrowserUtils.waitFor(10);
        try {
            vehicleCostsPage.chassisNumberFirstRow.click();
        } catch (Exception e) {
            JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
            jse.executeScript("arguments[0].click();", vehicleCostsPage.chassisNumberFirstRow);
        }
    }

    @When("the user click license plate add button")
    public void the_user_click_license_plate_add_button() {
        vehicleCostsPage.licensePlateAddButton.click();
    }

    @When("the user select first license plate")
    public void the_user_select_first_license_plate() {
        BrowserUtils.waitFor(5);
        try {
            vehicleCostsPage.licensePlateFirstRow.click();
        } catch (Exception e) {
            JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
            jse.executeScript("arguments[0].click();", vehicleCostsPage.licensePlateFirstRow);
        }
    }

    @Then("verify {string} message apper on the top of the page")
    public void verify_message_apper_on_the_top_of_the_page(String expectedMessage) {

        BrowserUtils.waitForVisibility(vehicleCostsPage.entitySavedMessage, 10);
        Assert.assertEquals("message verification", vehicleCostsPage.entitySavedMessage.getText(), expectedMessage);


    }

    @Then("verify Chasis Number and License Plate added successfully")
    public void verify_Chasis_Number_and_License_Plate_added_successfully() {
        try {
            BrowserUtils.waitForVisibility(vehicleCostsPage.addedChassisNumberList, 10);
        } catch (Exception e) {
            BrowserUtils.waitFor(5);
            System.out.println("waited 5 sec");
        }
        Assert.assertNotEquals("verify chassis number", vehicleCostsPage.addedChassisNumberList.getText(), "N/A");
        Assert.assertNotEquals("verify license plate", vehicleCostsPage.addedLicensePlateList.getText(), "N/A");
    }

    //US_32
    @When("the user click spesific vehicle which added attachment")
    public void the_user_click_spesific_vehicle_which_added_attachment() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("verify Attachment File Name is {string}")
    public void verify_Attachment_File_Name_is(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("verify comment is {string}")
    public void verify_comment_is(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user click spesific vehicle")
    public void the_user_click_spesific_vehicle() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user select {string}")
    public void the_user_select(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user write Comment {string}")
    public void the_user_write_Comment(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("verify {string} message appeared on the top")
    public void verify_message_appeared_on_the_top(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user click chassis number add button")
    public void the_user_click_chassis_number_add_button() {
        BrowserUtils.waitFor(3);
        vehicleCostsPage.chassisNumberAddButton.click();
    }


    @When("the user click Select button")
    public void the_user_click_Select_button() {
        vehicleCostsPage.chassisNumberSelectButton.click();
    }


    // us-30 sukru
    @When("Click on Activity Tab")
    public void clickOnActivityTab() {
        vehicleCostsPage.ActivityTab.click();
    }

    @Then("The user should be able to see Activity tab")
    public void theUserShouldBeAbleToSeeActivityTab() {
        Assert.assertTrue(vehicleCostsPage.ActivityContent.isDisplayed());
    }

    @When("The user click on {string} filter button")
    public void theUserClickOnFilterButton(String filterName) {
        vehicleCostsPage.ActivityFilter(filterName).click();
    }

    @Then("The user should be able to see {string} filter popup")
    public void theUserShouldBeAbleToSeeFilterPopup(String arguman) {
        Assert.assertTrue(vehicleCostsPage.ActivityTypeFilterPopup.isDisplayed());

    }

    @When("The user select {string} on the opened filter popup")
    public void theUserSelectOnTheOpenedFilterPopup(String filterOption) {
        vehicleCostsPage.ActivityFilterOption(filterOption).click();
    }

    @Then("The user should be able to see {string} records on the table")
    public void theUserShouldBeAbleToSeeRecordsOnTheTable(String filterValue) {
        for (WebElement activityData : vehicleCostsPage.activityTable) {
            Assert.assertTrue(activityData.getText().contains(filterValue));
        }
    }

    @When("The user open the new browser tab")
    public void theUserOpenTheNewBrowserTab() {

        BrowserUtils.waitFor(10);
        previousRecordNumber = String.valueOf(getTotalRecords());

        System.out.println("previousRecordNumber = " + previousRecordNumber);
        openNewTab();
        BrowserUtils.waitFor(2);
        String getCurrentUrl = Driver.get().getCurrentUrl();
        changeToNewWindow();
        BrowserUtils.waitFor(2);

        Driver.get().get(getCurrentUrl);
        BrowserUtils.waitFor(5);

        vehicleCostsPage.addEventButton.click();
        BrowserUtils.waitFor(3);
        String EventName = "Victory";
        vehicleCostsPage.TitleInputBox.sendKeys(EventName);
        BrowserUtils.waitFor(1);
        vehicleCostsPage.OrganizerNameBox.sendKeys("Sukru");
        BrowserUtils.waitFor(1);
        vehicleCostsPage.OrganizerEmailBox.sendKeys("testmail@gmail.com");
        BrowserUtils.waitFor(1);
        vehicleCostsPage.StartDate.click();
        BrowserUtils.waitFor(1);
        vehicleCostsPage.Date10.click();
        BrowserUtils.waitFor(1);
        vehicleCostsPage.StartHour.click();
        BrowserUtils.waitFor(1);
        vehicleCostsPage.Hour8AM.click();
        BrowserUtils.waitFor(1);
        vehicleCostsPage.EndDate.click();
        BrowserUtils.waitFor(1);
        vehicleCostsPage.Date12.click();
        BrowserUtils.waitFor(1);
        vehicleCostsPage.EndHour.click();
        BrowserUtils.waitFor(1);
        vehicleCostsPage.Hour607PM.click();
        BrowserUtils.waitFor(1);
        vehicleCostsPage.SaveButton.click();
        BrowserUtils.waitFor(1);
        changeToNewWindow();
    }

    @And("The user click on refresh button")
    public void theUserClickOnRefreshButton() {
        int prev = vehicleCostsPage.activityTable1.size();
        vehicleCostsPage.refreshButton.click();
        int next = vehicleCostsPage.activityTable1.size();
        Assert.assertTrue(prev != next);
    }

    @Then("The user should be able to see page reloaded")
    public void theUserShouldBeAbleToSeePageReloaded() {
    }
}




