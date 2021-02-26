package com.transmuda.stepdefinitions;

import com.transmuda.pages.BasePage;
import com.transmuda.pages.VehicleOdometerPage;
import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class Us_16_StepDefs  {

    @When("the user click export grid")
    public void the_user_click_export_grid() {
        BrowserUtils.waitFor(10);
        new VehicleOdometerPage().exportGrid.click();
    }

    @Then("verify options are CSV, XLSX")
    public void verify_options_are_CSV_XLSX() {
        VehicleOdometerPage vehicleOdometerPage=new VehicleOdometerPage();
        Assert.assertTrue(vehicleOdometerPage.csv.getText().equals("CSV"));
        Assert.assertTrue(vehicleOdometerPage.xlsx.getText().equals("XLSX"));
    }

    @When("the user click CSV")
    public void the_user_click_CSV() {
        new VehicleOdometerPage().csv.click();
    }

    @Then("verify {string} message appear on the top")
    public void verify_message_appear_on_the_top(String message) {
        message="Export started successfully. You will receive email notification upon completion.";
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
        List<String> dropdownElement=BrowserUtils.getElementsText(new VehicleOdometerPage().dropdownItemList);
        Assert.assertEquals("10",dropdownElement.get(0));
        Assert.assertEquals("25",dropdownElement.get(1));
        Assert.assertEquals("50",dropdownElement.get(2));
        Assert.assertEquals("100",dropdownElement.get(3));
    }

    @When("the user select {int}")
    public void the_user_select(Integer int1) {
        if(int1==10) {
            new VehicleOdometerPage().dropdownItemList.get(0).click();
        }else if(int1==25) {
            new VehicleOdometerPage().dropdownItemList.get(1).click();
        } else if(int1==50) {
            new VehicleOdometerPage().dropdownItemList.get(2).click();
        }else if(int1==100) {
            new VehicleOdometerPage().dropdownItemList.get(3).click();
        }
        BrowserUtils.waitFor(2);

    }

    @Then("verify record table content decrease {int}")
    public void verify_record_table_content_decrease(Integer int1) {
        int number = new  VehicleOdometerPage().tableRow.size();
        Integer number1=Integer.valueOf(number);
        Assert.assertEquals(int1,number1);

    }

    @When("the user click next page arrow")
    public void the_user_click_next_page_arrow() {
        BrowserUtils.waitFor(10);
        new VehicleOdometerPage().nextPageButton.click();
        BrowserUtils.waitFor(2);
    }

    @Then("verify page changed to second page")
    public void verify_page_changed_to_second_page() {
    String num=new VehicleOdometerPage().pageNumber.getAttribute("value");
    Assert.assertEquals("2",num);
    }

    @Then("the user can see vehicle odometre page")
    public void the_user_can_see_vehicle_odometre_page() {
        BrowserUtils.waitFor(10);
        String actualUrl= Driver.get().getCurrentUrl();
        System.out.println("actualUrl = " + actualUrl);
        String expectedUrl="https://qa.transmuda.com/entity/Extend_Entity_VehiclesOdometer";
        Assert.assertEquals(actualUrl,expectedUrl);
    }
}
