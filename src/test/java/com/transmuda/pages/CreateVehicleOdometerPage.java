package com.transmuda.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateVehicleOdometerPage extends BasePage {

    @FindBy(xpath = "//div[@class='pull-right title-buttons-container']/a[contains(.,'Create')]")
    public WebElement createOdometerVehicle;


    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement odometervehicleInput;


    @FindBy(xpath = "//input[@placeholder='Choose a date']")
    public WebElement dateInput;

    @FindBy(xpath = "//input[@placeholder='Choose a date']")
    public WebElement choosedate;

    @FindBy(xpath = "//body/div[@id='ui-datepicker-div']/div[1]/div[1]/select[1]")
    public WebElement month;

    @FindBy(xpath = "//body/div[@id='ui-datepicker-div']/div[1]/div[1]/select[2]")
    public WebElement year;


    @FindBy(xpath = "//tbody/tr[2]/td[4]/a[1]")
    public WebElement day;


    @FindBy(xpath = "//input[@name='custom_entity_type[Driver]']")
    public WebElement driverInput;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[2]/div[3]/form[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/fieldset[1]/div[1]/div[4]/div[2]/div[1]/a[1]/span[1]")
    public WebElement unitInput;


    @FindBy(xpath = "//div[contains(text(),'miles')]")
    public WebElement miles;


    @FindBy(xpath = "//div[contains(text(),'km')]")
    public WebElement km;

    @FindBy(xpath = "//span[contains(text(),'Choose a value...')]")
    public WebElement model;


    @FindBy(xpath = "//body/div[@id='select2-drop']/div[1]/input[1]")
    public WebElement modelInput;

    @FindBy(xpath="//button[@class='btn btn-success action-button']")
    public WebElement saveAndClose;

    @FindBy(xpath = " //span[contains(text(),'General Information')]")

    public WebElement generalInformation;

    @FindBy(xpath = " //span[contains(text(),'This value is not valid.')]")

    public WebElement errorMessage;


    @FindBy(xpath="//button[@class='btn btn-medium add-btn']")
    public WebElement addBTNt;

    // @FindBy(xpath = "//h4[contains(text(),'Carreservation')]")
    //  public WebElement Carreservation;

    @FindBy(css=".ui-dialog")
    public WebElement selectCarreservationWindowMessage;

    @FindBy(xpath = " //a[contains(text(),'victory13-5')]")
    public WebElement licensePlate;

    //a[contains(text(),'victory13-5')]

    @FindBy(xpath="//div[@class='grid-container']/table/tbody/tr[6]")
    public WebElement selectTable;

    @FindBy(xpath="//button[@data-action-name='select']")
    public WebElement selectBNT;

    @FindBy(xpath = "//body/div[7]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/i[1]")
    public WebElement gearSetting;

    @FindBy(xpath = "//a[contains(text(),'Select All')]")
    public WebElement allSelectBNT;

    @FindBy(xpath = "//span[contains(text(),'×')]")
    public WebElement closeBNT;

    @FindBy(xpath = "//body/div[8]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/a[2]/i[1]")
    public WebElement reset;

    @FindBy(xpath = "//body/div[8]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]/i[1]")
    public WebElement refresh;


    @FindBy(xpath = "//body/div[7]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/button[1]/span[1]")
    public WebElement pageDropdownBNT;

    @FindBy(xpath = "//a[contains(text(),'25')]")
    public WebElement pageDropdown;

    @FindBy(xpath = "//h3[contains(text(),'Refresh Confirmation')]")
    public WebElement refreshconfirmationWindow;

    @FindBy(xpath = "//a[contains(text(),'OK, got it.')]")
    public WebElement refreshconfirmationOkBTN;

    @FindBy(xpath = "//h3[contains(text(),'Reset Confirmation')]")
    public WebElement resetconfirmationWindow;


    @FindBy(xpath = "//a[contains(text(),'OK, got it.')]")
    public WebElement resetconfirmationOkBTN;

    @FindBy(xpath = "//div[contains(text(),'Grid Settings')]")
    public WebElement gearSettingWindow;


    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]")
    public WebElement deleteBNT;


    @FindBy(xpath = " //h3[contains(text(),'Delete Confirmation')]")
    public WebElement deleteconfirmationWindow;

    @FindBy(xpath = "  //a[contains(text(),'Yes, Delete')]")
    public WebElement yesDeleteBNT;

    @FindBy(xpath = "  //tbody/tr[1]")
    public WebElement vechileOdometerlist;


}
