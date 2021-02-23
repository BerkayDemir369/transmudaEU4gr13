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

import java.util.concurrent.Callable;

public class US_19StepDefs {

     CreateVehicleOdometerPage createVehicleOdometerPage= new CreateVehicleOdometerPage();
    @Given("navigate  Fleet to  Vehicle Odometer")
    public void navigateFleetToVehicleOdometer() {


       DashboardPage dashboardPage=new DashboardPage();

      //  new DashboardPage().navigateToModule(tab,module);
        dashboardPage.navigateToModule("Fleet", "Vehicle Odometer");
        BrowserUtils.waitFor(5);
    }

    @When("click on the Create Vehicle Odometer button")
    public void click_on_the_Create_Vehicle_Odometer_button() {

        createVehicleOdometerPage.createOdometerVehicle.click();

        BrowserUtils.waitFor(3);


    }

    @When("truck driver enter the valid information on the vehicle odometer page")
    public void truck_driver_enter_the_valid_information_on_the_vehicle_odometer_page() {


      createVehicleOdometerPage.createOdometerVehicle.click();
      BrowserUtils.waitFor(3);
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
        //createVehicleOdometerPage.model.click();
        //createVehicleOdometerPage.modelInput.sendKeys("ford");

        BrowserUtils.waitFor(3);

    }
    @When("truck driver click on the Save and Close button on the Vehicle Odometer page")
    public void truck_driver_click_on_the_Save_and_Close_button_on_the_Vehicle_Odometer_page() {


        createVehicleOdometerPage.saveAndClose.click();

        BrowserUtils.waitFor(3);


    }
    @Then("truck driver can create Vehicle Odometer")
    public void truck_driver_can_create_Vehicle_Odometer() {

        String actualGeneralInformation=createVehicleOdometerPage.generalInformation.getText();
        Assert.assertEquals("General Information",actualGeneralInformation);
    }

    @When("truck driver enter the invalid information on the vehicle odometer page")
    public void truck_driver_enter_the_invalid_informations_on_the_vehicle_odometer_page() {


        BrowserUtils.waitFor(7);

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

    @Then("This value is invalid  information should display and truck driver can not create Vehicle Odometer")
    public void information_should_display_and_truck_driver_can_not_create_Vehicle_Odometer(String expectedError) {


      String actualMessage= createVehicleOdometerPage.errorMessage.getText();
      Assert.assertEquals(expectedError,actualMessage);

        BrowserUtils.waitFor(3);
    }



    @When("click on the Add button on the Create Vehicle Odometer page")
    public void click_on_the_Add_button_on_the_Create_Vehicle_Odometer_page() {
        createVehicleOdometerPage.addBTNt.click();

        BrowserUtils.waitFor(3);
    }

    @Then("can see Licence Plate information window")
    public void can_see_Licence_Plate_information_window() {
        Assert.assertTrue(  createVehicleOdometerPage.selectCarreservationWindowMessage.isDisplayed());

        BrowserUtils.waitFor(3);
    }



   // @Then("can see selected license plate on the list")
   // public void can_see_selected_license_plate_on_the_list() {
        // Write code here that turns the phrase above into concrete actions
      //  throw new io.cucumber.java.PendingException();
   // }




    @When("truck driver click on the view per page dropdown button on the licence plate information window")
    public void truck_driver_click_on_the_view_per_page_dropdown_button_on_the_licence_plate_information_window() {



        new CreateVehicleOdometerPage().pageDropdownBNT.click();
        BrowserUtils.waitFor(3);


    }




    @When("truck driver select the per page number options")
    public void truck_driver_select_the_per_page_number_options() {
        // Write code here that turns the phrase above into concrete actions


        new CreateVehicleOdometerPage().pageDropdown.click();

        BrowserUtils.waitFor(3);
    }



     @Then("truck driver can select number of options per page on the licence plate information window")
     public void truckDriverCanSelectNumberOfOptionsPerPageOnTheLicencePlateInformationWindow() {


    }


    @When("truck driver click on Refresh button on the licence plate information window")
    public void truck_driver_click_on_Refresh_button_on_the_licence_plate_information_window() {

     new CreateVehicleOdometerPage().refresh.click();
        BrowserUtils.waitFor(3);
    }

     @Then("truck driver refresh the licence plate information window")
    public void truck_driver_refresh_the_licence_plate_information_window() {
        CreateVehicleOdometerPage createVehicleOdometerPage=new CreateVehicleOdometerPage() ;
        Assert.assertTrue("verify refresh window is open", createVehicleOdometerPage.refreshconfirmationWindow.isDisplayed());

        createVehicleOdometerPage.refreshconfirmationOkBTN.click();

         BrowserUtils.waitFor(3);
        }

//    @When("truck driver select any license plate on the license plate information window")
 //   public void truck_driver_select_any_license_plate_on_the_license_plate_information_window() {
        // Write code here that turns the phrase above into concrete actions
   //     throw new io.cucumber.java.PendingException();
//    }

    @When("truck driver click on the Reset button")
    public void truck_driver_click_on_the_Reset_button() {
        // Write code here that turns the phrase above into concrete actions

        new CreateVehicleOdometerPage().reset.click();
        BrowserUtils.waitFor(3);




    }

    @Then("truck driver can see reset confirmation window")
    public void truck_driver_can_see_reset_confirmation_window() {
        // Write code here that turns the phrase above into concrete a throw new io.cucumber.java.PendingException();

       CreateVehicleOdometerPage createVehicleOdometerPage=new CreateVehicleOdometerPage();
        Assert.assertTrue("verify refresh window is open", createVehicleOdometerPage.resetconfirmationWindow.isDisplayed());

        createVehicleOdometerPage.refreshconfirmationOkBTN.click();

        BrowserUtils.waitFor(3);

    }

    @When("truck driver click on the OK button on the reset confirmation window")
    public void truck_driver_click_on_the_OK_button_on_the_reset_confirmation_window() {
      new CreateVehicleOdometerPage().resetconfirmationOkBTN.click();
        BrowserUtils.waitFor(3);
    }

    @Then("truck driver can reset the license plate")
    public void truck_driver_can_reset_the_license_plate() {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("click on the Grid Settings button on the licence plate information window")
    public void click_on_the_Grid_Settings_button_on_the_licence_plate_information_window() {
       new CreateVehicleOdometerPage().gearSetting.click();
        BrowserUtils.waitFor(3);


    }

    @Then("can see Grid Settings window")
    public void can_see_Grid_Settings_window() {

        CreateVehicleOdometerPage createVehicleOdometerPage=new CreateVehicleOdometerPage();
        Assert.assertTrue("verify gear setting window is open", createVehicleOdometerPage.gearSettingWindow.isDisplayed());
        BrowserUtils.waitFor(3);

    }

    @When("click on the Select All on the Grid Settings window")
    public void click_on_the_Select_All_on_the_Grid_Settings_window() {
       new CreateVehicleOdometerPage().allSelectBNT.click();

    }

    @Then("can see assinged and license plate on the table")
    public void can_see_assinged_and_license_plate_on_the_table() {
        // Write code here that turns the phrase above into concrete actions
        new CreateVehicleOdometerPage().closeBNT.click();
        BrowserUtils.waitFor(3);
    }




    @When("select license plate from the top the list and click the select button")
    public void select_license_plate_from_the_top_the_list_and_click_the_select_button() {

        CreateVehicleOdometerPage createVehicleOdometerPage =new CreateVehicleOdometerPage();
        BrowserUtils.waitFor(3);

        createVehicleOdometerPage.selectTable.click();

        BrowserUtils.waitFor(2);
       createVehicleOdometerPage.selectBNT.click();

        BrowserUtils.waitFor(3);
    }

    @Then("can see selected license plate on the list")
    public void canSeeSelectedLicensePlateOnTheList() {

        CreateVehicleOdometerPage createVehicleOdometerPage =new CreateVehicleOdometerPage();
        createVehicleOdometerPage.licensePlate.isDisplayed();

        Assert.assertTrue("verify license plate is shown", createVehicleOdometerPage.licensePlate.isDisplayed());


}




    }







