package com.transmuda.stepdefinitions;

import com.transmuda.pages.DashboardPage;
import com.transmuda.pages.VehicleCostsPage;
import com.transmuda.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US_27_StepDefs {
       VehicleCostsPage vehicleCostsPage=new VehicleCostsPage();
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









}
