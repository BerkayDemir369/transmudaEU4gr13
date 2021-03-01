package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VehicleOdometerPage extends BasePage {
    public VehicleOdometerPage() {
        PageFactory.initElements(Driver.get(), this);
    }
    //========US-21=========

    @FindBy(xpath = "//td[@class='number-cell grid-cell grid-body-cell grid-body-cell-OdometerValue']")
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


    @FindBy(xpath = "(//a[@href='javascript: void(0);'])[2]")
    public WebElement addAttachmentButton;


    @FindBy(xpath = "//span[@id='ui-id-4']")
    public WebElement addAttachmentTitle;
    //==========================file uploading=================
    @FindBy(xpath = "//input[@data-ftid='oro_attachment_file_file']")
    public WebElement chooseFileButton;

    String projectPath = System.getProperty("user.dir");
    String filePath = "src/test/resources/Collection_Type_Selection.001.jpeg";
    public String fullPath = projectPath + "/" + filePath;
    //================================


    //input[@id='oro_attachment_file_file-uid-6036d88f00c9f']
    @FindBy(name = "oro_attachment[file][file]")
    public WebElement Test;

    @FindBy(xpath = "//textarea[@name='oro_attachment[comment]']")
    public WebElement commentBox;


    @FindBy(xpath = "//body/div[5]/div[2]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/div[3]/div[2]/div[1]/div[1]/button[1]/i[1]")
    public WebElement selectOwnerButton;

    @FindBy(xpath = "//tbody/tr[1]/td[1]")
    public WebElement firstOwnerRow;

    @FindBy(xpath = "//a[@class='add-filter-button']")
    public WebElement manageFilters;

    @FindBy(xpath = "//label[@title='First name']")
    public WebElement firstNameCheckBox;

    @FindBy(xpath = "(//div[@class='btn filter-criteria-selector oro-drop-opener oro-dropdown-toggle filter-default-value'])[2]")
    public WebElement lastName;

    @FindBy(xpath = "//button[@class='btn dropdown-toggle']")
    public WebElement containsOfLastname;

    @FindBy(xpath = "//a[contains(text(),'is equal to')]")
    public WebElement isEqualTo;

    @FindBy(xpath = "(//input[@type='text'])[4]")
    public WebElement nameBox;

    @FindBy(xpath = "//button[contains(text(),'Update')]")
    public WebElement lastNameUpdateButton;

    @FindBy(xpath = "//button[contains(text(),'Save')]")
    public WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'Widget content loading failed')]")
    public WebElement fileErrorMessage;

    @FindBy(xpath = "//span[contains(text(),'This value should not be blank.')]")
    public WebElement fileChoosingErrorMessage;



    //==========Us-24========

    @FindBy(xpath = "//div[contains(text(),'You do not have permission to perform this action.')]")
    public WebElement permissionMessage;

    //=========Us-16=========
    @FindBy(xpath = "//a[@title='With this button you will export the content of the grid as it appears to you, with filters and sorting applied. All pages will be exported.']")
    public  WebElement exportGrid;

    @FindBy(xpath = "//a[@title='CSV']")
    public  WebElement csv;

    @FindBy(xpath = "//a[@title='XLSX']")
    public  WebElement xlsx;

    @FindBy(css = ".message")
    public  WebElement successfullyMessage;

    @FindBy(css="[class='btn dropdown-toggle ']")
    public WebElement perpageDropdown;

    @FindBy(css="[class='dropdown-item']")
    public List<WebElement> dropdownItemList;

    @FindBy(xpath="//table/tbody/tr")
    public  List<WebElement> tableRow;

    @FindBy(css="[class='fa-chevron-right hide-text']")
    public  WebElement nextPageButton;

    @FindBy(css="[type='number']")
    public  WebElement pageNumber;






}
