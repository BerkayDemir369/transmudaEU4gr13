package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.*;

public class GridBasePage extends BasePage {
    public GridBasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    //page elements

    @FindBy(css = ".oro-subtitle")
    public WebElement PageSubTitle;

    @FindBy(css = ".favorite-button")
    public WebElement FavoriteButton;

    @FindBy(css = ".minimize-button")
    public WebElement PinButton;

    @FindBy(xpath = "//div[@class='alert alert-error fade in top-messages ']")
    public WebElement AlertMessage;

    @FindBy(xpath = "//div[@class='alert alert-error fade in top-messages ']/button")
    public WebElement AlertCloseButton;

    @FindBy(xpath = "//div[@class='pull-right title-buttons-container']/a[contains(.,'Create')]")
    public WebElement CreateButton;


    //==========================================
    //=           Grid Tool Elements           =
    //==========================================

    //Standard toolbar elements

    //Export Grid element
    @FindBy(linkText = "Export Grid")
    public List<WebElement> ExportGridSelect;

    @FindBy(css = "a[title='CSV']")
    public WebElement ExportCSVButton;

    @FindBy(css = "a[title='XLSX']")
    public WebElement ExportXLSXButton;

    @FindBy(css = "input[class*='input-widget']")
    public WebElement CurrentPageTxtBoxElement;

    @FindBy(linkText = "Prev")
    public WebElement PrevButton;

    @FindBy(linkText = "Next")
    public WebElement NextButtonElement;

    @FindBy(xpath = "//div[@class='pagination pagination-centered']//label[2]")
    public WebElement TotalPages;

    public int getTotalPages() {
        return Integer.parseInt(TotalPages.getText().replaceAll("[^0-9]", ""));
    }

    @FindBy(xpath = "//div[@class='pagination pagination-centered']//label[3]")
    public WebElement TotalRecords;

    public int getTotalRecords() {
        return Integer.parseInt(TotalRecords.getText().replaceAll("[^0-9]", ""));
    }

    @FindBy(css = "div[class*='page-size'] > div > div > button")
    public WebElement ViewPerPageSelect;

    @FindBy(linkText = "Reset")
    public WebElement ResetButton;

    @FindBy(css = "a[class*='refresh-action']")
    public WebElement RefreshButton;

    //Filter Button and popup elements
    @FindBy(css = ".fa-filter")
    public WebElement FilterButton;

    @FindBy(css = "button[class*='ui-multiselect']")
    public WebElement ManageFilters;

    @FindBy(css = "div[class*='ui-multiselect-menu']")
    public WebElement ManageFiltersPopup;

    @FindBy(xpath = "//div[@class='filter-item oro-drop open-filter']/div[@class='filter-criteria dropdown-menu']")
    public WebElement ManageFilterSelectedPopup;

    @FindBy(css = "div[class*='filter-box']")
    public WebElement FilterBoxArea;

    @FindBy(css = "div[class*='ui-multiselect-header'] > div > input")
    public WebElement FilterSearchTextBox;

    @FindBy(xpath = "//ul[@class='ui-multiselect-checkboxes ui-helper-reset fixed-li']/li")
    public List<WebElement> ManageFiltersHeaders;

    // Selected filters
    @FindBy(xpath = "//span[@class='filter-items']/div")
    public List<WebElement> ManageFilterItems;


    public boolean findFilterHeader(String headerName) {
        for (WebElement manageFiltersHeaders : ManageFiltersHeaders) {
            if (manageFiltersHeaders.getText().equals(headerName)) {
                return true;
            }
        }
        return false;
    }

    // for select filters list
    @FindBy(xpath = "//select[@data-action='add-filter-select']")
    public WebElement FilterSelectList;

    public Select getFilterSelectList() {
        return new Select(FilterSelectList);
    }


    public List<List<String>> types = new ArrayList<List<String>>();
    public Map<String, List<WebElement>> filterElements;

    public void getTypesFromFilterOptions() {
        int i = 1;

        for (WebElement manageFilterItem : ManageFilterItems) {

            String FindFilterName = "//span[@class='filter-items']/div[" + i + "]/div";
            String FindCondition = "//span[@class='filter-items']/div/div/div/div/ul/li";
            List<WebElement> conditions = manageFilterItem.findElements(By.xpath(FindCondition));

            filterElements.put(
                    manageFilterItem.findElement(By.xpath(FindFilterName)).getText(), conditions);
            i++;
        }


        types.add(Arrays.asList("fading", "dfg"));
    }


    /**
     * @param activeFilter send table header name
     * @param condition    send table header row data value
     * @param searchText   starting Data
     * @param searchText2  ending Data
     * @return if row has searchText or searchText2 value then return true else false
     */
    public boolean checkRowValue(String activeFilter, String condition, String searchText, String searchText2) {
        boolean flag = false;
        if (findHeader(activeFilter)) {
            int i = getGridTableHeaderIndex(activeFilter);
            String findRow = "//table[@class='grid table-hover table table-bordered table-condensed']/tbody/tr/td[" + i + "]";
            List<WebElement> findRowData = Driver.get().findElements(By.xpath(findRow));
            System.out.println("checkRow active found");

            for (WebElement value : findRowData) {
                if (!value.getText().equals(searchText)) {
                    switch (condition) {
                        case "Equal":
                        case "Not Equals":
                            flag = findRowValue(activeFilter, searchText);
                            break;
                        default:
                            break;
                    }
                }
            }
        }
        return flag;
    }


    @FindBy(xpath = "//button[@class='btn dropdown-toggle']")
    public WebElement FilterConditionButton;

    @FindBy(xpath = "//a[.='equals']")
    public WebElement ConditionType;

    @FindBy(xpath = "//div[@class='filter-start']/input[@name='value']")
    public WebElement FilterStartValue;

    @FindBy(xpath = "//input[@name='value_end']")
    public WebElement FilterEndValue;

    @FindBy(xpath = "//div[@class='choice-filter number-range-filter']//button[@class='btn btn-primary filter-update']")
    public WebElement FilterUpdateButton;

    //Grid Settings Elements
    @FindBy(xpath = "//i[@class='fa-cog hide-text']")
    public WebElement GridSettingsButton;

    @FindBy(xpath = "//div[@class='dropdown-menu']")
    public WebElement GridSettingsPopup;

    @FindBy(css = "div[class*='column-manager-search'] > input")
    public WebElement QuickSearch;

    @FindBy(linkText = "Selected")
    public WebElement Selected;

    @FindBy(linkText = "All")
    public WebElement All;

    @FindBy(xpath = "//a[.='Select All']")
    public WebElement SelectAll;

    @FindBy(xpath = "//div[@class='table-wrapper']//table[@class='grid table-hover table table-condensed']/tbody/tr/td[2]/span")
    public List<WebElement> GridSettingsMoves;

    @FindBy(xpath = "//div[@class='table-wrapper']//table[@class='grid table-hover table table-condensed']/tbody/tr/td[1]")
    public List<WebElement> GridSettingsRowNames;

    /**
     * This method returns table headers
     *
     * @return rowNames
     */
    public List<String> getGridSettingsRowNames() {
        List<String> rowNames = new ArrayList<>();
        for (WebElement name : GridSettingsRowNames) {
            rowNames.add(name.getText());
        }
        return rowNames;
    }

    public String getGridSettingsRowName(int index) {
        String rowNames = "";
        for (WebElement name : GridSettingsRowNames) {
            rowNames = GridSettingsRowNames.get(index).getText();
        }
        return rowNames;
    }

    @FindBy(xpath = "//div[@class='table-wrapper']//table[@class='grid table-hover table table-condensed']/tbody/tr/td[3]/input")
    public List<WebElement> GridSettingsRowCheckBoxes;


    //Grid table headers
    @FindBy(xpath = "//thead[@class='grid-header thead-sizing']//tr/th/a")
    public List<WebElement> GridTableHeaders;

    @FindBy(xpath = "//thead[@class='grid-header']//div[@class='btn-group dropdown']")
    public WebElement FirstHeaderCheckBox;

    /**
     * @return firstHeaders
     */
    public boolean getGridTableFirstHeaderIsCheckBox() {
        return getGridTableHeaders().get(0).isEmpty();
    }


    /**
     * This method returns table headers
     *
     * @return headers
     */
    public List<String> getGridTableHeaders() {
        List<String> headers = new ArrayList<>();
        for (WebElement gridTableHeader : GridTableHeaders) {
            headers.add(gridTableHeader.getText());
        }
        return headers;
    }

    public int getGridTableHeaderIndex(String data) {
        int i = 0;
        for (WebElement gridTableHeader : GridTableHeaders) {
            if (gridTableHeader.getText().equals(data)) {
                break;
            }
            i++;
        }
        return i;
    }

    public boolean findHeader(String headerName) {
        for (WebElement gridTableHeader : GridTableHeaders) {
            if (gridTableHeader.getText().equals(headerName)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param headerName send table header name
     * @param RowData    send table header row data value
     * @return if row has RowData value then return true else false
     */
    public boolean findRowValue(String headerName, String RowData) {
        if (findHeader(headerName)) {
            int i = getGridTableHeaderIndex(headerName);
            System.out.println("i = " + i);
            String findRow = "//table[@class='grid table-hover table table-bordered table-condensed']/tbody/tr/td[" + i + "]";
            List<WebElement> findRowData = Driver.get().findElements(By.xpath(findRow));

            for (WebElement value : findRowData) {
                if (value.getText().equals(RowData))
                    return true;
            }
        }
        return false;
    }


    @FindBy(xpath = "//table[@class='grid table-hover table table-bordered table-condensed']/tbody/tr/td[1]/input")
    public List<WebElement> GridTableRowsCheckBoxes;

    //Select grid table records
    @FindBy(css = "button[class='btn btn-default btn-small dropdown-toggle'] input[type='checkbox']")
    public WebElement SelectAllRecordsCheckBox;

    @FindBy(css = "div[class='btn-group dropdown'] i[class='caret']")
    public WebElement SelectRecordsPopup;

    @FindBy(xpath = "//a[.='All visible']")
    public WebElement AllVisibleSelect;

    @FindBy(xpath = "//a[.='All visible']")
    public WebElement NoneSelect;

}
