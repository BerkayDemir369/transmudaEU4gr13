package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.nio.file.Watchable;

public class VehicleCostsPage extends BasePage {
    public VehicleCostsPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    //US-25

    //change page number for getting following vehicle costs informations
    @FindBy(xpath = "//i[contains(text(),'Next')]")
    public WebElement pageChangeButton;

    //change the entity number by clicking the View Per Page dropdown(10,25,50,100)
    @FindBy(xpath = "//button[@class='btn dropdown-toggle ']")
    public WebElement viewPerPageChooseButton;

    @FindBy(xpath = "//div[@class='page-size pull-right form-horizontal']//li[1]")
    public WebElement perPage10Button;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[2]")
    public WebElement perPage25Button;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[3]")
    public WebElement perPage50Button;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[4]")
    public WebElement perPage100Button;


    //Export Grid Button
    @FindBy(xpath = "(//i[@class='fa-upload'])[1]")
    public WebElement exportGridButton;

    //csv format button
    @FindBy(xpath = "//a[@title='CSV']")
    public WebElement csvButton;

    @FindBy(css = ".alert")
    public WebElement AlertMessage;

    //XLSX Format button
    @FindBy(xpath = "//a[@title='XLSX']")
    public WebElement xlsxButton;


    //========Us-34=======

    @FindBy(xpath = "//h1[@class='oro-subtitle']")
    public WebElement allVehicleCosts;


    @FindBy(xpath = "//input[@class='input-widget']")
    public WebElement pageNumber;

    @FindBy(xpath = "//i[@class='fa-chevron-left hide-text']")
    public WebElement previousPage;

    @FindBy(xpath = "//div[@class='flash-messages-holder']")
    public WebElement flashMessage;
    @FindBy(xpath = "//i[@class='fa-cog hide-text']")
    public WebElement gridSettingsButton;

    @FindBy(xpath = "//tbody[@class='ui-sortable']/tr[1]//input[1]")
    public WebElement idCheckBox;

    @FindBy(xpath = "//tbody[@class='ui-sortable']/tr[2]//input[1]")
    public WebElement typeCheckBox;

    @FindBy(xpath = "//tbody[@class='ui-sortable']/tr[3]//input[1]")
    public WebElement totalPriceCheckBox;

    @FindBy(xpath = "//tbody[@class='ui-sortable']/tr[4]//input[1]")
    public WebElement dateCheckBox;

    @FindBy(xpath = "//button[@class='btn btn-success action-button']")
    public WebElement saveAndClose;






    @FindBy(xpath = "//a[.='Select All']")
    public WebElement selectAll;

    @FindBy(xpath = "//span[.='Id']")
    public WebElement idColumn;

    @FindBy(xpath = "//span[.='Type']")
    public WebElement typeColumn;

    @FindBy(xpath = "//span[.='Total Price']")
    public WebElement totalPriceColumn;

    @FindBy(xpath = "//span[.='Date']")
    public WebElement dateColumn;


    @FindBy(xpath = "//span[@class='close']")
    public WebElement xButton;


    @FindBy(xpath = "//i[@class='fa-filter hide-text']")
    public WebElement filterButton;

    @FindBy(xpath = "//a[.='Manage filters']")
    public WebElement manageFiltersButton;


    @FindBy(xpath = "//label[contains(.,'Type')]")
    public WebElement typeFilterBox;

    @FindBy(xpath = "//label[contains(.,'Total Price')]")
    public WebElement totalPriceFilterBox;

    @FindBy(xpath = "//label[contains(.,'Date')]")
    public WebElement dateFilterBox;


    @FindBy(xpath = "//span[@class='filter-items']/div[1]/div[@class='btn filter-criteria-selector oro-drop-opener oro-dropdown-toggle filter-default-value']")
    public WebElement typeAll;

    @FindBy(xpath = "//span[@class='filter-items']/div[2]/div[@class='btn filter-criteria-selector oro-drop-opener oro-dropdown-toggle filter-default-value']")
    public WebElement totalPriceAll;

    @FindBy(xpath = "//span[@class='filter-items']/div[3]/div[@class='btn filter-criteria-selector oro-drop-opener oro-dropdown-toggle filter-default-value']")
    public WebElement dateAll;

    @FindBy(xpath = "//i[@class='fa-repeat']")
    public WebElement refreshButton;

    @FindBy(xpath = "//a[3]/i[@class='fa-refresh']")
    public WebElement resetButton;


    // US-27 (aynur)

    @FindBy(xpath = "//button[@class='sidebar__add-widget']")
    public WebElement AddSign;

    @FindBy(xpath = "//div[@class='widget-picker-containers']/div[1]//a[contains(.,'Add')]")
    public WebElement recentAddBNT;

    @FindBy(xpath = "//div[@class='widget-picker-containers']/div[2]//a[contains(.,'Add')]")
    public WebElement stickyAddBNT;

    @FindBy(xpath = "//div[@class='widget-picker-containers']/div[3]//a[contains(.,'Add')]")
    public WebElement tasklistAddBNT;

    @FindBy(xpath = "//a[.='Close']")
    public WebElement closeAddBNT;

    @FindBy(xpath = "//i[@class='sidebar-widget-icon mail-icon']")
    public WebElement amilIcon;

    @FindBy(xpath = "//i[@class='sidebar-widget-icon fa-sticky-note-o']")
    public WebElement stickyIcon;

    @FindBy(xpath = "//i[@class='sidebar-widget-icon fa-tasks']")
    public WebElement tasklistIcon;

    @FindBy(xpath = "//i[@class='fa-thumb-tack hide-text']")
    public WebElement pinIcon;

    @FindBy(xpath = " //i[@class='fa-star hide-text']")
    public WebElement favoriteIcon;

    @FindBy(xpath = " //div[@class='list-bar']//a[.='Vehicle Costs - Entities - System']")
    public WebElement addpinInformation;

    //US-30

    @FindBy(xpath = "//a[@data-action-name='refresh']")
    public WebElement detailRefreshButton;

    public static WebElement elementNamedElement(String typeText) {
        String typeString = "//div[@class='scrollspy container-fluid scrollable-container']//div[@class='controls']/div[contains(.,'" + typeText + "')]";
        return Driver.get().findElement(By.xpath(typeString));
    }

    @FindBy(xpath = "//a[contains(.,'Newer')]")     public WebElement newer;
    @FindBy(xpath = "//a[contains(.,'Older')]")     public WebElement older;

    //US-35 aynur


    @FindBy(xpath = " //i[@class='fa-caret-down']")
    public WebElement facaretDown;


    @FindBy(xpath = "//i[@class='fa-bars']")
    public WebElement facbars;

    @FindBy(xpath = "//a[contains(.,'Favorites')]")
    public WebElement favoritesContent;

    @FindBy(xpath = "//a[.='Vehicle Costs - Entities - System - Car - Entities - System']")
    public WebElement VehicleCostsEntitiesSystem;


    // =============================


    // US-28 (Hamdulla)

    @FindBy(xpath = "(//td[contains(text(),'Tax Roll')])[1]")
    public WebElement TaxRoll1;

    @FindBy(xpath = "//tbody[@class='grid-body']/tr[2]//a[.='...']")
    public WebElement PoinsSignOfTaxRoll1;

    @FindBy(xpath = "(//i[@class='fa-eye hide-text'])[2]")
    public WebElement EyeButton;

    @FindBy(xpath = "//h1[contains(text(),'Item #3')]")
    public WebElement TaxRollItem3;

    @FindBy(xpath = "(//i[@class='fa-pencil-square-o hide-text'])[2]")
    public WebElement EditButton;

    @FindBy(xpath = "(//h1[contains(text(),'Quick Launchpad')])[1]")
    public WebElement EditResultQuickLaunchpad;

    @FindBy(xpath = "(//i[@class='fa-trash-o hide-text'])[2]")
    public WebElement DeleteButton;

    @FindBy(xpath = "//a[@class='btn ok btn-danger']")
    public WebElement DeleteYesButton;

    @FindBy(xpath = "//div[@class='message']")
    public WebElement DeleteErrorMessage;


    // ===========================

    //US-31  Hamdulla

    @FindBy(xpath = "//a[.='Add EventAdd Event']")
    public WebElement AddEventButton;

    @FindBy(xpath = "//span[contains(text(),'Add Event')]")
    public WebElement AddEventWindow;

    @FindBy(name = "oro_calendar_event_form[title]")
    public WebElement TitleInputBox;

    @FindBy(name = "oro_calendar_event_form[organizerDisplayName]")
    public WebElement OrganizerNameBox;

    @FindBy(name = "oro_calendar_event_form[organizerEmail]")
    public WebElement OrganizerEmailBox;

    @FindBy(xpath = "(//input[@placeholder='Choose a date'])[1]")
    public WebElement StartDate;

    @FindBy(xpath = "(//a[contains(text(),'10')])[5]")
    public WebElement Date10;

    @FindBy(xpath = "(//input[@placeholder='time'])[1]")
    public WebElement StartHour;

    @FindBy(xpath = "//li[contains(text(),'8:00 AM')]")
    public WebElement Hour8AM;

    @FindBy(xpath = "(//input[@placeholder='Choose a date'])[2]")
    public WebElement EndDate;

    @FindBy(xpath = "//a[contains(text(),'12')]")
    public WebElement Date12;

    @FindBy(xpath = "(//input[@placeholder='time'])[2]")
    public WebElement EndHour;

    @FindBy(xpath = "//li[contains(text(),'6:07 PM')]")
    public WebElement Hour607PM;

    @FindBy(xpath = "//button[contains(text(),'Save')]")
    public WebElement SaveButton;

    @FindBy(xpath = "//span[contains(text(),'not be blank')]")
    public WebElement ErrorMessage;

    @FindBy(xpath = "//strong[contains(text(),'Hamdulla1')]")
    public WebElement EventName;

    @FindBy(xpath = "//a[contains(text(),'Activity')]")
    public WebElement ActivityTab;


























}



