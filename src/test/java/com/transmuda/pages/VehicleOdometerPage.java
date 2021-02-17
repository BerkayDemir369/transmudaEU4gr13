package com.transmuda.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VehicleOdometerPage extends BasePage{



    @FindBy(xpath = "(//td[@class='number-cell grid-cell grid-body-cell grid-body-cell-OdometerValue'])[1]")
    public WebElement firstOdometer;



    @FindBy(xpath = "//i[@class='fa-pencil-square-o hide-text']")
    public  WebElement editButton;


    @FindBy(xpath ="//a[contains(text(),'General')]")
    public WebElement GenaeralText;

    //===============Entities Vehicle Odometer================
    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement odometerValue;


    //=======date===============

    @FindBy(xpath = "//input[@placeholder='Choose a date']")
    public WebElement chooseDate;

    @FindBy(xpath = "//body/div[@id='ui-datepicker-div']/div[1]/div[1]/select[1]")
    public WebElement monthSelect;

    @FindBy(xpath = "//body/div[@id='ui-datepicker-div']/div[1]/div[1]/select[2]")
    public  WebElement yearSelect;


    @FindBy(xpath = "//tbody/tr[2]/td[4]/a[1]")
    public  WebElement daySelect;

    //==========Driver=======

    @FindBy(xpath = "(//input[@type='text'])[5]")
    public WebElement driver;

    //========Unit===============

    @FindBy(xpath ="//body/div[@id='page']/div[2]/div[1]/div[2]/div[3]/form[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/fieldset[1]/div[1]/div[4]/div[2]/div[1]/a[1]/abbr[1]")
    public  WebElement xButton;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[2]/div[3]/form[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/fieldset[1]/div[1]/div[4]/div[2]/div[1]/a[1]/span[1]")
    public  WebElement unitDropDown;

    @FindBy(xpath = "//div[contains(text(),'km')]")
    public WebElement km;

    //============================addButton=====
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[2]/div[3]/form[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/fieldset[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/button[1]")
    public WebElement addButton;

    @FindBy(xpath = "//tbody/tr[3]/td[1]/input[1]")
    public WebElement sdet;

    @FindBy(xpath = "//button[contains(text(),'Select')]")
    public WebElement selectButton;


    @FindBy(xpath = "//button[@type='submit']")
    public  WebElement saveAndCloseButton;

    @FindBy(xpath = "//div[@class='message']")
    public WebElement entityMessage;

    //=========Negative========
    @FindBy(xpath = "//span[contains(text(),'This value is not valid.')]")
    public  WebElement odometerMessage;




}
