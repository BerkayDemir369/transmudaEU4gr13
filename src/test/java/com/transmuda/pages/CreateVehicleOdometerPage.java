package com.transmuda.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateVehicleOdometerPage extends BasePage {

    @FindBy(xpath = "(//body/div[@id='page']/div[2]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[2]/a[1]")
    public WebElement createOdometerVehicle;


    @FindBy(xpath = "//input[@id='custom_entity_type_OdometerValue-uid-602eab9438680']")
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


    @FindBy(xpath = "(//input[@id='custom_entity_type_Driver-uid-602eaccc2a927']")
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

    @FindBy(xpath = " //button[contains(text(),'Save and Close')]")

    public WebElement saveAndClose;

    @FindBy(xpath = " //span[contains(text(),'General Information')]")

    public WebElement generalInformation;

    @FindBy(xpath = " //span[contains(text(),'This value is not valid.')]")

    public WebElement errorMessage;


    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[2]/div[3]/form[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/fieldset[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/button[1]")
    public WebElement addBTNt;

    @FindBy(xpath = "//h4[contains(text(),'Carreservation')]")
    public WebElement Carreservation;

    @FindBy(xpath = " //span[@id='ui-id-2']")
    public WebElement selectCarreservationWindow;



    @FindBy(xpath = "//tbody[@class='grid-body']/tr[2]")
    public WebElement selectTable;

    @FindBy(xpath = "//button[contains(text(),'Select')]")
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
    @FindBy(xpath = "//body/div[8]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/button[1]")
    public WebElement pageBNT;

    @FindBy(xpath = "//thead/tr[1]/th[1]/a[1]/span[1]")
    public WebElement assigned;



}