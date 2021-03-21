package com.transmuda.pages;

import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class GridBasePage extends BasePage {
    public GridBasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    //page elements


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

    @FindBy(css = ".reset-action")
    public WebElement ResetButton;

    @FindBy(css = ".refresh-action")
    public WebElement RefreshButton;

    //Filter Button and popup elements
    @FindBy(css = ".fa-filter")
    public WebElement FilterButton;

    @FindBy(xpath = "//a[.='Manage filters']")
    public WebElement ManageFilters;

    @FindBy(xpath = "//div[@class='ui-multiselect-menu ui-corner-all select-filter-widget dropdown-menu']")
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
    public boolean checkRowValue(String activeFilter, String condition, String searchText, String searchText2) throws ParseException {
        boolean status = false;
        //for numbers and moneys
        Double num1 = null, num2 = null;
        //For dates                                         Jan 23, 2019
        SimpleDateFormat sdf = new SimpleDateFormat("MMM dd,yyyy");
        Date startingDate = new Date(), endingDate = new Date(), rowDate = new Date();

        try {
            num1 = Double.parseDouble(searchText);
            num2 = Double.parseDouble(searchText2);
        } catch (Exception ignored) {
        }

        try {
            startingDate = sdf.parse(searchText);
            endingDate = sdf.parse(searchText2);
        } catch (Exception ignored) {
        }


        if (findHeader(activeFilter)) {
            int i = getGridTableHeaderIndex(activeFilter);

            //if there have a problem change commented lines
            //String rows = "//table[@class='grid table-hover table table-bordered table-condensed']/tbody/tr/td[" + i + "]";

            String rows = "//td[@data-column-label='" + activeFilter + "']";
            List<WebElement> findRowData = Driver.get().findElements(By.xpath(rows));

            for (WebElement rowValue : findRowData) {
                Date rowValueDate = null;
                Double rowValueNumber = null;

                try {
                    rowValueDate = sdf.parse(rowValue.getText());
                } catch (Exception ignored) {
                }

                try {
                    rowValueNumber = Double.parseDouble(rowValue.getText().replaceAll("[^0-9]", ""));
                } catch (Exception ignored) {
                }
                condition = condition.toLowerCase();

                switch (condition) {
                    case "is equal to":
                    case "equal":
                    case "is any of":
                        if (searchText.split(" ").length > 0 && !condition.equals("is any of") && rowValueDate != null) {
                            if (rowValueDate.equals(startingDate)) {
                                status = true;
                            } else {
                                return false;
                            }
                        } else {
                            if (rowValue.getText().equalsIgnoreCase(searchText))
                                status = true;
                        }
                        break;
                    case "not equals":
                    case "is not any of":
                        if (searchText.split(" ").length > 0 && !condition.equals("is not any of") && rowValueDate != null) {
                            if (!rowValueDate.equals(startingDate)) {
                                status = true;
                            } else {
                                return false;
                            }
                        } else {
                            if (!rowValue.getText().equalsIgnoreCase(searchText)) {
                                status = true;
                            } else {
                                return false;
                            }
                        }
                        break;
                    case "between":
                        if (searchText.split(" ").length > 0 && rowValueDate != null) {

                            if ((rowValueDate.after(startingDate) || rowValueDate.equals(startingDate))
                                    && (rowValueDate.before(endingDate) || rowValueDate.equals(endingDate))) {
                                status = true;
                            } else {
                                return false;
                            }
                        } else {
                            if (rowValueNumber >= num1 && rowValueNumber <= num2) {
                                status = true;
                            } else {
                                return false;
                            }
                        }
                        break;
                    case "not between":
                        if (searchText.split(" ").length > 0 && rowValueDate != null) {
                            if (!((rowValueDate.after(startingDate) || rowValueDate.equals(startingDate))
                                    && (rowValueDate.before(endingDate) || rowValueDate.equals(endingDate)))) {
                                status = true;
                            } else {
                                return false;
                            }
                        } else {
                            if (!(rowValueNumber >= num1 && rowValueNumber <= num2)) {
                                status = true;
                            } else {
                                return false;
                            }
                        }
                        break;
                    case "more than":
                    case "later than":
                        if (searchText.split(" ").length > 0 && rowValueDate != null) {
                            if (rowValueDate.after(startingDate)) {
                                status = true;
                            } else {
                                return false;
                            }
                        } else {
                            if (rowValueNumber > num1) {
                                status = true;
                            } else {
                                return false;
                            }
                        }
                        break;
                    case "earlier than":
                    case "less than":
                        if (searchText.split(" ").length > 0 && rowValueDate != null) {
                            if (rowValueDate.before(startingDate)) {
                                status = true;
                            } else {
                                return false;
                            }
                        } else {
                            if (rowValueNumber < num1) {
                                status = true;
                            } else {
                                return false;
                            }
                        }
                        break;
                    case "equals or more than":
                        if (rowValueNumber >= num1) {
                            status = true;
                        } else {
                            return false;
                        }
                        break;
                    case "equals or less than":
                        if (rowValueNumber <= num1) {
                            status = true;
                        } else {
                            return false;
                        }
                        break;
                    case "is empty":
                        if (rowValue.getText().isBlank() || rowValue.getText().isEmpty()) {
                            status = true;
                        } else {
                            return false;
                        }
                        break;
                    case "is not empty":
                        if (!(rowValue.getText().isBlank() || rowValue.getText().isEmpty())) {
                            status = true;
                        } else {
                            return false;
                        }
                        break;
                    case "contains":
                        if (rowValue.getText().toLowerCase().contains(searchText.toLowerCase())) {
                            status = true;
                        } else {
                            return false;
                        }
                        break;
                    case "does not contain":
                        if (!(rowValue.getText().toLowerCase().contains(searchText.toLowerCase()))) {
                            status = true;
                        } else {
                            return false;
                        }
                        break;
                    case "start with":
                        if (rowValue.getText().toLowerCase().startsWith(searchText.toLowerCase())) {
                            status = true;
                        } else {
                            return false;
                        }
                        break;
                    case "end with":
                        if (rowValue.getText().toLowerCase().endsWith(searchText.toLowerCase())) {
                            status = true;
                        } else {
                            return false;
                        }
                        break;
                    case "checkboxes":
                        //get check box list and do something

                        //div[contains(@class,'multiselect-filter-widget')]//ul[contains(@class,'ui-multiselect-checkboxes')]//li

                    default:
                        break;
                }


            }
        }
        return status;
    }


    public WebElement filterConditionButton() {
        WebElement filterSelect;
        String locator1 = "//*[contains(@style,'visibility: visible; margin-left: auto;')]//*[@class='btn-group btn-block']";
        String locator2 = "//*[contains(@style,'visibility: visible; margin-left: auto;')]//*[@class='filter-select-oro-wrapper']";

        try {
            filterSelect = Driver.get().findElement(By.xpath(locator1));
        } catch (Exception e) {
            filterSelect = Driver.get().findElement(By.xpath(locator2));

        }
        return filterSelect;
    }


    public WebElement conditionKeyword(String conditionKeyword) {
        //String locator = "//a[.='" + conditionKeyword + "']";
        String locator = "//*[@style='visibility: visible; margin-left: auto;']//*[contains(text(),'" + conditionKeyword + "')]";
        String locator2 = "//li[contains(.,'" + conditionKeyword + "')]";
        try {
            return Driver.get().findElement(By.xpath(locator));
        } catch (Exception ignored) {
            return Driver.get().findElement(By.xpath(locator2));
        }

    }

    Select conditionKeywordSelect(String conditionKeyword) {
        WebElement locator = Driver.get().findElement(By.className("filter-select-oro"));
        return new Select(locator);
    }

    public void conditionKeywordClick(String conditionKeyword) {
        try {
            conditionKeyword(conditionKeyword).click();
        } catch (Exception e) {
            try {

            } catch (Exception ignored) {
                conditionKeywordSelect(conditionKeyword).selectByVisibleText(conditionKeyword);
            }

        }
    }


    @FindBy(xpath = "//a[.='equals']")
    public WebElement ConditionType;

    @FindBy(xpath = "//input[@name='value']")
    public WebElement FilterStartValue;

    public void filterStartValue(String text) {
        String locator = "//*[contains(@style,'visibility: visible; margin-left: auto;')]//input[@class='select2-input select2-default']";
        String locator2 = "//*[contains(@style,'visibility: visible; margin-left: auto;')]//div/input[1]";

        List<WebElement> startValue = Driver.get().findElements(By.xpath(locator2));
        try {
            try {
                Driver.get().findElement(By.xpath(locator)).sendKeys(text);
            } catch (Exception a) {

                FilterStartValue.sendKeys(text);
            }
        } catch (Exception c) {
            startValue.get(0).click();
            startValue.get(0).sendKeys(text);
            startValue.get(0).click();
        }
        try {
            BrowserUtils.waitFor(2);
            selectElement(text).click();
        } catch (Exception ignored) {
        }
    }

    public void filterEndValue(String text) {
        String locator2 = "//*[contains(@style,'visibility: visible; margin-left: auto;')]//div/input[1]";
        List<WebElement> endValue = Driver.get().findElements(By.xpath(locator2));
        try {
            FilterEndValue.sendKeys(text);
        } catch (Exception c) {
            endValue.get(1).click();
            endValue.get(1).sendKeys(text);
            endValue.get(1).click();
        }
    }

    public WebElement selectElement(String Keyword) {
        String locator = "//li[.='" + Keyword + "']";
        return Driver.get().findElement(By.xpath(locator));
    }


    @FindBy(xpath = "//input[@name='value_end']")
    public WebElement FilterEndValue;

    @FindBy(xpath = "//div[@style='visibility: visible; margin-left: auto;']//button[@class='btn btn-primary filter-update']")
    public WebElement FilterUpdateButton;

    //Grid Settings Elements
    @FindBy(xpath = "//i[@class='fa-cog hide-text']")
    public WebElement GridSettingsButton;

    @FindBy(xpath = "//div[@class='dropdown-menu']")
    public WebElement GridSettingsPopup;

    @FindBy(xpath = "//span[@class='close']")
    public WebElement GridSettingsPopupClose;

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

    public WebElement getGridTableRowElement(int index) {

        String findRow = "//table[@class='grid table-hover table table-bordered table-condensed']/tbody/tr[" + index + "]";
        return Driver.get().findElement(By.xpath(findRow));
    }

    @FindBy(xpath = "//div[@class='table-wrapper']//table[@class='grid table-hover table table-condensed']/tbody/tr/td[3]/input")
    public List<WebElement> GridSettingsRowCheckBoxes;


    //Grid table headers
    @FindBy(xpath = "//thead[@class='grid-header']//a")
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

    public int getGridTableHeaderIndex(String headerName) {
        int i = 1;
        for (WebElement gridTableHeader : GridTableHeaders) {
            if (gridTableHeader.getText().equalsIgnoreCase(headerName)) {
                break;
            }
            i++;
        }
        return i;
    }

    public boolean findHeader(String headerName) {
        for (WebElement gridTableHeader : GridTableHeaders) {
            if (gridTableHeader.getText().equalsIgnoreCase(headerName)) {
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
            String findRow = "//table[@class='grid table-hover table table-bordered table-condensed']/tbody/tr/td[" + i + "]";
            List<WebElement> findRowData = Driver.get().findElements(By.xpath(findRow));

            for (WebElement value : findRowData) {
                if (value.getText().equalsIgnoreCase(RowData))
                    return true;
            }
        }
        return false;
    }

    public void findRowValueAndClick(String headerName, String RowData) {
        if (findHeader(headerName)) {
            int i = getGridTableHeaderIndex(headerName);
            String findRow = "//table[@class='grid table-hover table table-bordered table-condensed']/tbody/tr/td[" + i + "]";
            List<WebElement> findRowData = Driver.get().findElements(By.xpath(findRow));
            for (WebElement value : findRowData) {
                if (value.getText().equals(RowData))
                    value.click();
            }
        }
    }

    public WebElement findRowWebElement(String headerName, String RowData) {
        WebElement rowElement = null;
        int i = getGridTableHeaderIndex(headerName);
        String findRow = "//table[@class='grid table-hover table table-bordered table-condensed']/tbody/tr/td[" + i + "]";
        List<WebElement> findRowData = Driver.get().findElements(By.xpath(findRow));

        for (WebElement value : findRowData) {
            if (value.getText().equals(RowData))
                rowElement = value;
        }
        return rowElement;
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
