package com.transmuda.stepdefinitions;

import com.transmuda.pages.DashboardPage;
import com.transmuda.pages.VehicleCostsPage;
import com.transmuda.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class VehicleCostsStepDefs {

//US-25

    VehicleCostsPage vehicleCostsPage=new VehicleCostsPage();
    @Given("navigate to Fleet Vehicle Costs")
    public void navigate_to_Fleet_Vehicle_Costs() {
        DashboardPage dashboardPage=new DashboardPage();
        dashboardPage.navigateToModule("Fleet","Vehicle Costs");
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
        String expectMessage="Export started successfully. You will receive email notification upon completion.";
        BrowserUtils.waitFor(3);
        Assert.assertTrue(vehicleCostsPage.AlertMessage.getText().contains(expectMessage));

    }

//US-27

    @Given("truck driver navigate Fleet to Vehicle Costs")
    public void truck_driver_navigate_Fleet_to_Vechicle_Costs() {

        DashboardPage dashboardPage=new DashboardPage();
        dashboardPage.navigateToModule("Fleet","Vehicle Costs");
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
    public void click_on_the_Sticky_Note_Add_Button_on_the_Sidebar_Widgets() {;

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
// US-30


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
        String actualMessage= vehicleCostsPage.AlertMessage.getText();
        String arrangeMessage=actualMessage.substring(1).trim();
        System.out.println("arrangeMessage = " + arrangeMessage);
        System.out.println("actualMessage = " + actualMessage);

        Assert.assertEquals(expectedMessage,arrangeMessage);

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

    @When("the user click Refresh Button")
    public void the_user_click_Refresh_Button() {

        vehicleCostsPage.refreshButton.click();





    }

    @Then("system should be able to refresh the page")
    public void system_should_be_able_to_refresh_the_page() {

        BrowserUtils.waitFor(2);
        vehicleCostsPage.refreshButton.isDisplayed();

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
    }

    @When("click on Add sign on the sidebar widgets")
    public void clickOnAddSignOnTheSidebarWidgets() {
    }

    @And("click on Recent Emial Add Button on the sidebar widgets window")
    public void clickOnRecentEmialAddButtonOnTheSidebarWidgetsWindow() {
    }

    @And("click on Sticky Note Add Button on the sidebar widgets window")
    public void clickOnStickyNoteAddButtonOnTheSidebarWidgetsWindow() {
    }

    @And("click on Task list Add Button on the sidebar widgets window")
    public void clickOnTaskListAddButtonOnTheSidebarWidgetsWindow() {
    }

    @And("click on Close Button on the sidebar widgets window")
    public void clickOnCloseButtonOnTheSidebarWidgetsWindow() {
    }

    @Then("sales manager can use sidebar widgets on the vehicle cost page")
    public void salesManagerCanUseSidebarWidgetsOnTheVehicleCostPage() {
    }

    @Given("sales manager navigate Fleet to Vehicle Costs page")
    public void salesManagerNavigateFleetToVehicleCostsPage() {
    }

    @When("click on the Pin Icon on the Vehicle Costs page")
    public void clickOnThePinIconOnTheVehicleCostsPage() {
    }

    @And("click on the Favourite on the Vehicle Costs page")
    public void clickOnTheFavouriteOnTheVehicleCostsPage() {
    }

    @Then("sales manager can pin, favourite the Vehicle Costs page")
    public void salesManagerCanPinFavouriteTheVehicleCostsPage() {
    }

    @When("click on the Username Dropdown Icon on Vehicle Costs page")
    public void clickOnTheUsernameDropdownIconOnVehicleCostsPage() {
    }

    @And("select the Logout on the Dropdown list")
    public void selectTheLogoutOnTheDropdownList() {
    }

    @Then("user able to log out")
    public void userAbleToLogOut() {
    }
    @Given("the user login as a “sales manager")
    public void theUserLoginAsASalesManager() {
    }

    @Then("user should be able to log in")
    public void userShouldBeAbleToLogIn() {
    }

    @When("click on  favourites dropdown")
    public void clickOnFavouritesDropdown() {
    }

    @And("click  on  favourites button")
    public void clickOnFavouritesButton() {
    }


    @Then("user should be able to see favourites top page and page pin")
    public void userShouldBeAbleToSeeFavouritesTopPageAndPagePin() {

    }



}




