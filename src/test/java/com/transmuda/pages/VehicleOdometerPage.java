package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleOdometerPage extends BasePage {
    public VehicleOdometerPage() {
        PageFactory.initElements(Driver.get(), this);
    }
    //========US-21=========

    @FindBy(xpath = "(//td[@class='number-cell grid-cell grid-body-cell grid-body-cell-OdometerValue'])[1]")
    public WebElement firstOdometer;


    @FindBy(xpath = "//i[@class='fa-pencil-square-o hide-text']")
    public WebElement editButton;


    @FindBy(xpath = "//a[contains(text(),'General')]")
    public WebElement GenaeralText;

    //===============Entities Vehicle Odometer================
    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement odometerValue;


    //=======General Vehicle Odometer date===============

    @FindBy(xpath = "//input[@placeholder='Choose a date']")
    public WebElement chooseDate;

    @FindBy(xpath = "//body/div[@id='ui-datepicker-div']/div[1]/div[1]/select[1]")
    public WebElement monthSelect;

    @FindBy(xpath = "//body/div[@id='ui-datepicker-div']/div[1]/div[1]/select[2]")
    public WebElement yearSelect;


    @FindBy(xpath = "//tbody/tr[2]/td[4]/a[1]")
    public WebElement daySelect;

    //==========Driver=======

    @FindBy(xpath = "(//input[@type='text'])[5]")
    public WebElement driver;

    //========Unit===============

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[2]/div[3]/form[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/fieldset[1]/div[1]/div[4]/div[2]/div[1]/a[1]/abbr[1]")
    public WebElement xButton;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[2]/div[3]/form[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/fieldset[1]/div[1]/div[4]/div[2]/div[1]/a[1]/span[1]")
    public WebElement unitDropDown;

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
    public WebElement saveAndCloseButton;

    @FindBy(xpath = "//div[@class='message']")
    public WebElement entityMessage;

    //=========Negative========
    @FindBy(xpath = "//span[contains(text(),'This value is not valid.')]")
    public WebElement odometerMessage;


    //====US-23===========


    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/a[1]")
    public WebElement addAttachmentButton;


    @FindBy(xpath = "//span[@id='ui-id-4']")
    public WebElement addAttachmentTitle;

    @FindBy(xpath = "//div[@class='control-group']/div/input")
    public WebElement upload;

    @FindBy(xpath = "//div[@class='control-group']")
    public WebElement Test;

    @FindBy(tagName = "textarea")
    public WebElement commentBox;

    @FindBy(xpath = "//span[.='Save']")
    public WebElement attachmentSave;


    @FindBy(xpath = "//button[@class='add-on btn entity-select-btn']/i[@class='fa-bars']")
    public WebElement selectOwnerButton;

    @FindBy(css=".grid-body-cell-lastName")
    public WebElement firstOwnerRow;

    @FindBy(xpath = "//div[@class='oro-datagrid']//i[@class='fa-cog hide-text']")
    public WebElement manageFilters;

    @FindBy(xpath = "//tbody[@class='ui-sortable']/tr[1]//input[1]")
    public WebElement firstNameCheckBox;

    @FindBy(xpath = " //span[.='Last name']")
    public WebElement lastName;

    @FindBy(xpath = "//span[@class='filter-items']/div[2]//b[@class='filter-criteria-hint']")
    public WebElement containsOfLastname;

    @FindBy(xpath = "//button[@class='btn dropdown-toggle']")
    public WebElement isEqualTo;

    @FindBy(xpath = "//input[@name='value']")
    public WebElement nameBox;

    @FindBy(xpath = "//button[@class='btn btn-primary filter-update']")
    public WebElement lastNameUpdateButton;

    @FindBy(xpath = "//button[contains(text(),'Save')]")
    public WebElement saveButton;


    @FindBy(xpath = "//span[contains(text(),'This value should not be blank.')]")
    public WebElement fileChoosingErrorMessage;


    //==========Us-24========

    @FindBy(xpath = "//div[contains(text(),'You do not have permission to perform this action.')]")
    public WebElement permissionMessage;


}
