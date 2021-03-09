package com.transmuda.pages;

import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = "span.title-level-1")
    public List<WebElement> menuOptions;

    @FindBy(css = "div[class='loader-mask shown']")
    @CacheLookup
    protected WebElement loaderMask;

    @FindBy(css = "h1[class='oro-subtitle']")
    public WebElement pageSubTitle;

    @FindBy(css = ".list-bar")
    public WebElement pinBar;

    @FindBy(xpath = "//div[@class='list-bar']//li[@class='pin-holder active']")
    public WebElement pinBarActivePin;

    @FindBy(xpath = "//div[@class='list-bar']//li/button[@class='btn-close fa-close']")
    public List<WebElement> pinBarDeletePinButtons;

    @FindBy(xpath = "//div[@class='list-bar']//ul/li")
    public List<WebElement> listBarPinnedPages;

    @FindBy(xpath = "//h1[@class='logo logo-text']")
    public WebElement logo;

    @FindBy(css = ".top-search")
    public WebElement ShortCutsSearchButton;

    @FindBy(xpath = "//ul[contains(.,'Shortcuts')]")
    public WebElement shortCutsPopup;

    @FindBy(css = "[placeholder='Enter shortcut action']")
    public WebElement shortCutActionInputText;


    public WebElement foundedShortCut(String SearchingShortCutValue) {
        String shortCutName = "//li[@class='active']/a[.='" + SearchingShortCutValue + "']";
        return Driver.get().findElement(By.xpath(shortCutName));
    }

    @FindBy(xpath = "//a[.='See full list']")
    public WebElement shortCutsActionFullListLink;

    @FindBy(xpath = "//tbody//tr/td[1]")
    public List<WebElement> shortCutsList;

    public void shortCutListClick(String shortCutName) {
        for (WebElement shortCut : shortCutsList) {
            if (shortCut.getText().equals(shortCutName)) {
                shortCut.click();
            }
        }
    }

    public boolean shortCutListCheck(String shortCutName) {
        for (WebElement shortCut : shortCutsList) {
            if (shortCut.getText().equals(shortCutName)) {
                return true;
            }
        }
        return false;
    }

    @FindBy(css = ".fa-question-circle")
    public WebElement helpLinkButton;

    @FindBy(xpath = "//ul[@class='breadcrumb']/li")
    public List<WebElement> breadCrumb;

    @FindBy(css = ".favorite-button")
    public WebElement favoriteButton;

    @FindBy(css = ".minimize-button")
    public WebElement pinButton;



    @FindBy(css = ".dot-menu")
    public WebElement historyAndFavoritesButton;

    @FindBy(xpath = "//li[@class='dot-menu dropdown open']/div[@class='dropdown-menu pull-right']")
    public WebElement historyAndFavoritesPopup;

    @FindBy(xpath = "//a[contains(.,'History')]")
    public WebElement historyTab;

    @FindBy(xpath = "//div[@id='history-content']/ul[@class='extra-list']//li")
    public List<WebElement> historyTabContentLinks;

    @FindBy(xpath = "//a[contains(.,'Favorites')]")
    public WebElement favoritesTab;

    @FindBy(xpath = "//div[@id='favorite-content']/ul[@class='extra-list']/li")
    public List<WebElement> favoritesTabContentLinks;

    @FindBy(xpath = "//a[contains(.,'Most Viewed')]")
    public WebElement mostViewedTab;

    @FindBy(xpath = "//div[@id='mostviewed-content']/ul[@class='extra-list']/li")
    public List<WebElement> mostViewedTabContentLinks;

    @FindBy(css = ".email-notification-menu")
    public WebElement mailButton;

    @FindBy(xpath = "//li[@title='Recent Emails']/div")
    public WebElement mailPopup;

    @FindBy(css = "#user-menu > a")
    public WebElement userName;

    @FindBy(linkText = "Logout")
    public WebElement logOutLink;

    @FindBy(linkText = "My User")
    public WebElement myUser;

    // Alert Messages
    @FindBy(xpath = "//div[@class='alert alert-error fade in top-messages ']")
    public WebElement alertMessage;

    @FindBy(xpath = "//div[@class='flash-messages-holder']/div")
    public List<WebElement> alertMessages;

    @FindBy(xpath = "//div[@class='alert alert-error fade in top-messages ']/button")
    public WebElement alertCloseButton;


    //Page Sidebar Elements

    @FindBy(css = ".sidebar__toggle")     public WebElement sideBarToggle;


    /**
     * @return page name, for example: Dashboard
     */
    public String getPageSubTitle() {
        //ant time we are verifying page name, or page subtitle, loader mask appears
        waitUntilLoaderScreenDisappear();
//        BrowserUtils.waitForStaleElement(pageSubTitle);
        return pageSubTitle.getText();
    }


    /**
     * Waits until loader screen present. If loader screen will not pop up at all,
     * NoSuchElementException will be handled  bu try/catch block
     * Thus, we can continue in any case.
     */
    public void waitUntilLoaderScreenDisappear() {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.get(), 5);
            wait.until(ExpectedConditions.invisibilityOf(loaderMask));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public String getUserName() {
        waitUntilLoaderScreenDisappear();
        BrowserUtils.waitForVisibility(userName, 5);
        return userName.getText();
    }


    public void logOut() {
        BrowserUtils.waitFor(2);
        BrowserUtils.clickWithJS(userName);
        BrowserUtils.clickWithJS(logOutLink);
    }

    public void goToMyUser() {
        waitUntilLoaderScreenDisappear();
        BrowserUtils.waitForClickablility(userName, 5).click();
        BrowserUtils.waitForClickablility(myUser, 5).click();

    }

    /**
     * This method will navigate user to the specific module in transmuda application.
     * For example: if tab is equals to Activities, and module equals to Calls,
     * Then method will navigate user to this page: http://qa.transmuda.com/call/
     *
     * @param tab
     * @param module
     */
    public void navigateToModule(String tab, String module) {
        String tabLocator = "//span[normalize-space()='" + tab + "' and contains(@class, 'title title-level-1')]";
        String moduleLocator = "//span[normalize-space()='" + module + "' and contains(@class, 'title title-level-2')]";
        try {
            BrowserUtils.waitForClickablility(By.xpath(tabLocator), 5);
            WebElement tabElement = Driver.get().findElement(By.xpath(tabLocator));
            new Actions(Driver.get()).moveToElement(tabElement).pause(200).doubleClick(tabElement).build().perform();
        } catch (Exception e) {
            BrowserUtils.clickWithWait(By.xpath(tabLocator), 5);
        }
        try {
            BrowserUtils.waitForPresenceOfElement(By.xpath(moduleLocator), 5);
            BrowserUtils.waitForVisibility(By.xpath(moduleLocator), 5);
            BrowserUtils.scrollToElement(Driver.get().findElement(By.xpath(moduleLocator)));
            Driver.get().findElement(By.xpath(moduleLocator)).click();
        } catch (Exception e) {
//            BrowserUtils.waitForStaleElement(Driver.get().findElement(By.xpath(moduleLocator)));
            BrowserUtils.clickWithTimeOut(Driver.get().findElement(By.xpath(moduleLocator)), 5);
        }
    }

}