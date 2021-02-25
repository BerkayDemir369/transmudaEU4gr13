package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class GridBasePage extends BasePage {
    public GridBasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//div[@class='alert alert-error fade in top-messages ']")
    public WebElement AlertMessage;

    @FindBy(xpath = "//div[@class='alert alert-error fade in top-messages ']/button")
    public WebElement AlertCloseButton;

    @FindBy(xpath = "//div[@class='pull-right title-buttons-container']/a[contains(.,'Create')]")
    public WebElement CreateButton;

    //Export Grid element
    @FindBy(linkText = "Export Grid")
    public List<WebElement> ExportGridSelect;

    @FindBy(css = "a[title='CSV']")
    public WebElement ExportCSVButton;

    @FindBy(css = "a[title='XLSX']")
    public WebElement ExportXLSXButton;


    //Standard toolbar elements
    @FindBy(linkText = "Reset")
    public WebElement ResetButton;

    @FindBy(css = "a[class*='refresh-action']")
    public WebElement RefreshButton;

    @FindBy(css = "div[class*='page-size'] > div > div > button")
    public WebElement ViewPerPageSelect;

    @FindBy(linkText = "Prev")
    public WebElement PrevButton;

    @FindBy(linkText = "Next")
    public WebElement NextButtonElement;

    @FindBy(css = "input[class*='input-widget']")
    public WebElement CurrentPageTxtBoxElement;


    //Filter Button and popup elements
    @FindBy(xpath = "//div[2]/div[1]/div/div[3]/div[1]/div/a[1]")
    public WebElement FilterButton;

    @FindBy(css = "button[class*='ui-multiselect']")
    public WebElement ManageFilters;

    @FindBy(css = "div[class*='ui-multiselect-menu']")
    public WebElement ManageFiltersPopup;

    @FindBy(css = "div[class*='filter-box']")
    public WebElement FilterBoxArea;

    @FindBy(css = "div[class*='ui-multiselect-header'] > div > input")
    public WebElement FilterSearchTextBox;

    @FindBy(xpath = "//ul[@class='ui-multiselect-checkboxes ui-helper-reset fixed-li']/li")
    public List<WebElement> ManageFiltersHeaders;


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
    @FindBy(xpath = "//table[@class='grid table-hover table table-bordered table-condensed']/thead/tr/th")
    public List<WebElement> GridTableHeaders;

    @FindBy(xpath = "//thead[@class='grid-header']//div[@class='btn-group dropdown']")
    public WebElement FirstHeaderCheckBox;

    /**
     * @return firstHeaders
     */
    public boolean getGridTableFirstHeaderIsCheckBox() {
        return getGridTableHeaders().get(0).isBlank();
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
        int i = 1;
        for (WebElement gridTableHeader : GridTableHeaders) {
            if (gridTableHeader.getText().equals(data)) {
                break;
            }
            i++;
        }
        return i;
    }

    /**
     * @param headerName send table header name
     * @param RowData    send table header row data value
     * @return if row has RowData value then return true else false
     */
    public boolean findRowValue(String headerName, String RowData) {
        int i = getGridTableHeaderIndex(headerName);
        String findRow = "//table[@class='grid table-hover table table-bordered table-condensed']/tbody/tr/td[" + i + "]";
        List<WebElement> findRowData = Driver.get().findElements(By.xpath(findRow));

        for (WebElement value : findRowData) {
            if (value.getText().equals(RowData))
                return true;
        }
        return false;
    }

    @FindBy(xpath = "//table[@class='grid table-hover table table-bordered table-condensed']/tbody/tr/td[1]/input")
    public List<WebElement> GridTableRowsCheckBoxes;

    //Select grid table records
    @FindBy(css = "button[class='btn btn-default btn-small dropdown-toggle'] input[type='checkbox']")
    public WebElement SelectAllRecords;

    @FindBy(css = "div[class='btn-group dropdown'] i[class='caret']")
    public WebElement SelectRecordsPopup;

    @FindBy(xpath = "//a[.='All visible']")
    public WebElement AllVisibleSelect;

    @FindBy(xpath = "//a[.='All visible']")
    public WebElement NoneSelect;

}
