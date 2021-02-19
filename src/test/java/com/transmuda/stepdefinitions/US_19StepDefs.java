package com.transmuda.stepdefinitions;

import com.transmuda.pages.CreateVehicleOdometerPage;
import com.transmuda.pages.DashboardPage;
import com.transmuda.pages.LoginPage;
import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.ConfigurationReader;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class US_19StepDefs {
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {

        String url= ConfigurationReader.get("url");
        Driver.get().get(url);

    }

    @When("the user logs in using {string} and {string}")
    public void the_user_logs_in_using_and(String username, String password) {

        LoginPage loginPage= new LoginPage();
        loginPage.login(username,password);
        BrowserUtils.waitFor(3);


        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("Dashboard",actualTitle);

    }

    @Given("navigate to {string} {string}")
    public void navigate_to(String tab, String module) {

      //  DashboardPage dashboardPage=new DashboardPage();

        new DashboardPage().navigateToModule(tab,module);

    }

    @When("click on the Create Vehicle Odometer button")
    public void click_on_the_Create_Vehicle_Odometer_button() {

       CreateVehicleOdometerPage createVehicleOdometerPage=new CreateVehicleOdometerPage();
        createVehicleOdometerPage.createOdometerVehicle.click();

        BrowserUtils.waitFor(3);


    }

    @When("truck driver enter the valid informations on the vehicle odometer page")
    public void truck_driver_enter_the_valid_informations_on_the_vehicle_odometer_page() {

     CreateVehicleOdometerPage createVehicleOdometerPage=new CreateVehicleOdometerPage();
      createVehicleOdometerPage.odometervehicleInput.sendKeys("123");
       createVehicleOdometerPage.choosedate.click();
        Select selectM=new Select(createVehicleOdometerPage.month);

        selectM.selectByIndex(6);

        Select selectY=new Select(createVehicleOdometerPage.year);

        selectY.selectByIndex(20);

        createVehicleOdometerPage.day.click();
        createVehicleOdometerPage.driverInput.sendKeys("aynur");
        createVehicleOdometerPage.unitInput.click();
        createVehicleOdometerPage.km.click();
        createVehicleOdometerPage.model.click();
        createVehicleOdometerPage.modelInput.sendKeys("gul");

        BrowserUtils.waitFor(3);

    }
    @When("truck driver click on the Save and Close button on the Vehicle Odometer page")
    public void truck_driver_click_on_the_Save_and_Close_button_on_the_Vehicle_Odometer_page() {

        new CreateVehicleOdometerPage().saveAndClose.click();

        BrowserUtils.waitFor(3);


    }
    @Then("truck driver can create Vehicle Odometer")
    public void truck_driver_can_create_Vehicle_Odometer() {

        CreateVehicleOdometerPage createVehicleOdometerPage =new CreateVehicleOdometerPage();
        String actualGeneralInformation=createVehicleOdometerPage.generalInformation.getText();
        Assert.assertEquals("General Information",actualGeneralInformation);
    }

    @When("truck driver enter the invalid informations on the vehicle odometer page")
    public void truck_driver_enter_the_invalid_informations_on_the_vehicle_odometer_page() {


        CreateVehicleOdometerPage createVehicleOdometerPage=new CreateVehicleOdometerPage();
        createVehicleOdometerPage.odometervehicleInput.sendKeys("aynur");
        createVehicleOdometerPage.choosedate.click();
        Select selectM=new Select(createVehicleOdometerPage.month);

        selectM.selectByIndex(9);

        Select selectY=new Select(createVehicleOdometerPage.year);

        selectY.selectByIndex(20);

        createVehicleOdometerPage.day.click();
        createVehicleOdometerPage.driverInput.sendKeys("aynur");
        createVehicleOdometerPage.unitInput.click();
        createVehicleOdometerPage.km.click();
        createVehicleOdometerPage.model.click();
        createVehicleOdometerPage.modelInput.sendKeys("gul");

        new CreateVehicleOdometerPage().saveAndClose.click();

        BrowserUtils.waitFor(3);
    }

    @Then("{string} information should display and truck driver can not create Vehicle Odometer")
    public void information_should_display_and_truck_driver_can_not_create_Vehicle_Odometer(String expectedError) {

        CreateVehicleOdometerPage createVehicleOdometerPage =new CreateVehicleOdometerPage();

      String actualMessage= createVehicleOdometerPage.errorMessage.getText();
      Assert.assertEquals(expectedError,actualMessage);

        BrowserUtils.waitFor(3);
    }

    @When("click on the Carreservation button the Create Vehicle Odometer page")
    public void click_on_the_Carreservation_button_the_Create_Vehicle_Odometer_page() {

        CreateVehicleOdometerPage createVehicleOdometerPage =new CreateVehicleOdometerPage();
        createVehicleOdometerPage.Carreservation.click();

        BrowserUtils.waitFor(3);

    }

    @When("click on the Add button on the Create Vehicle Odometer page")
    public void click_on_the_Add_button_on_the_Create_Vehicle_Odometer_page() {
        CreateVehicleOdometerPage createVehicleOdometerPage =new CreateVehicleOdometerPage();
        createVehicleOdometerPage.addBTNt.click();

        BrowserUtils.waitFor(3);
    }

    @Then("can see Licence Plate information window")
    public void can_see_Licence_Plate_information_window(String expectedselectcarreservationWindowMassage) {
        CreateVehicleOdometerPage createVehicleOdometerPage =new CreateVehicleOdometerPage();

        String actualSelectCarreservationMessage= createVehicleOdometerPage.selectCarreservationWindow.getText();
        Assert.assertEquals(expectedselectcarreservationWindowMassage,actualSelectCarreservationMessage);

        BrowserUtils.waitFor(3);
    }

    @When("select license plate from the top the list and click the select button")
    public void select_license_plate_from_the_top_the_list_and_click_the_select_button() {

        CreateVehicleOdometerPage createVehicleOdometerPage =new CreateVehicleOdometerPage();
        createVehicleOdometerPage.selectTable.click();
        createVehicleOdometerPage.selectBNT.click();

        BrowserUtils.waitFor(3);
    }

   // @Then("can see selected license plate on the list")
   // public void can_see_selected_license_plate_on_the_list() {
        // Write code here that turns the phrase above into concrete actions
      //  throw new io.cucumber.java.PendingException();
   // }



    @When("truck driver click on the assigned button on the licence plate information window")
    public void truck_driver_click_on_the_assigned_button_on_the_licence_plate_information_window() {

        CreateVehicleOdometerPage createVehicleOdometerPage =new CreateVehicleOdometerPage();
        createVehicleOdometerPage.assigned.click();
    }

   // @Then("truck driver can assign license plate on the licence plate information window")
  //  public void truck_driver_can_assign_license_plate_on_the_licence_plate_information_window() {
    //    // Write code here that turns the phrase above into concrete actions
      //  throw new io.cucumber.java.PendingException();
   // }

    @When("truck driver click on the view per page dropdown button on the licence plate information window")
    public void truck_driver_click_on_the_view_per_page_dropdown_button_on_the_licence_plate_information_window() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("truck driver can see the view per page options by clicking on the view per page dropdown button on the licence plate information window")
    public void truck_driver_can_see_the_view_per_page_options_by_clicking_on_the_view_per_page_dropdown_button_on_the_licence_plate_information_window() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("truck driver select the per page number options")
    public void truck_driver_select_the_per_page_number_options() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("truck driver can select number of options per page on the licence plate information window")
    public void truck_driver_can_select_number_of_options_per_page_on_the_licence_plate_information_window() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("truck driver click on Refresh button on the licence plate information window")
    public void truck_driver_click_on_Refresh_button_on_the_licence_plate_information_window() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("truck driver refresh the licence plate information window")
    public void truck_driver_refresh_the_licence_plate_information_window() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("truck driver select any license plate on the license plate information window")
    public void truck_driver_select_any_license_plate_on_the_license_plate_information_window() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("truck driver click on the Reset button")
    public void truck_driver_click_on_the_Reset_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("truck driver can see reset confirmation window")
    public void truck_driver_can_see_reset_confirmation_window() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("truck driver click on the OK button on the reset confirmation window")
    public void truck_driver_click_on_the_OK_button_on_the_reset_confirmation_window() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("truck driver can reset the license plate")
    public void truck_driver_can_reset_the_license_plate() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("click on the Grid Settings button on the licence plate information window")
    public void click_on_the_Grid_Settings_button_on_the_licence_plate_information_window() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("can see Grid Settings window")
    public void can_see_Grid_Settings_window() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("click on the Select All on the Grid Settings window")
    public void click_on_the_Select_All_on_the_Grid_Settings_window() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("can see assinged and license plate on the table")
    public void can_see_assinged_and_license_plate_on_the_table() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("unclick on the Select All on the Grid Settings window")
    public void unclick_on_the_Select_All_on_the_Grid_Settings_window() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("can see only license plate on the table")
    public void can_see_only_license_plate_on_the_table() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }









}
