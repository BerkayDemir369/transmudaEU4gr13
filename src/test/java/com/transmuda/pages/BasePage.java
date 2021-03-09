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
    public WebElement PinBar;

    @FindBy(xpath = "//div[@class='list-bar']//li[@class='pin-holder active']")
    public WebElement PinBarActivePin;

    @FindBy(xpath = "//div[@class='list-bar']//li/button[@class='btn-close fa-close']")
    public List<WebElement> PinBarDeletePinButtons;

    @FindBy(xpath = "//div[@class='list-bar']//ul/li")
    public List<WebElement> ListBarPinnedPages;

    @FindBy(xpath = "//h1[@class='logo logo-text']")
    public WebElement Logo;

    @FindBy(css = ".top-search")
    public WebElement ShortCutsSearchButton;

    @FindBy(xpath = "//ul[contains(.,'Shortcuts')]")
    public WebElement ShortCutsPopup;

    @FindBy(css = "[placeholder='Enter shortcut action']")
    public WebElement ShortCutActionInputText;


    public WebElement FoundedShortCut(String SearchingShortCutValue) {
        String shortCutName = "//li[@class='active']/a[.='" + SearchingShortCutValue + "']";
        return Driver.get().findElement(By.xpath(shortCutName));
    }

    @FindBy(xpath = "//a[.='See full list']")
    public WebElement ShortCutsActionFullListLink;

    @FindBy(xpath = "//tbody//tr/td[1]")
    public List<WebElement> ShortCutsList;

    public void ShortCutListClick(String shortCutName) {
        for (WebElement shortCut : ShortCutsList) {
            if (shortCut.getText().equals(shortCutName)) {
                shortCut.click();
            }
        }
    }

    public boolean ShortCutListCheck(String shortCutName) {
        for (WebElement shortCut : ShortCutsList) {
            if (shortCut.getText().equals(shortCutName)) {
                return true;
            }
        }
        return false;
    }

    @FindBy(css = ".fa-question-circle")
    public WebElement HelpLinkButton;

    @FindBy(css = ".dot-menu")
    public WebElement HistoryAndFavoritesButton;

    @FindBy(xpath = "//li[@class='dot-menu dropdown open']/div[@class='dropdown-menu pull-right']")
    public WebElement HistoryAndFavoritesPopup;

    @FindBy(xpath = "//a[contains(.,'History')]")
    public WebElement HistoryTab;

    @FindBy(xpath = "//div[@id='history-content']/ul[@class='extra-list']//li")
    public List<WebElement> HistoryTabContentLinks;

    @FindBy(xpath = "//a[contains(.,'Favorites')]")
    public WebElement FavoritesTab;

    @FindBy(xpath = "//div[@id='favorite-content']/ul[@class='extra-list']/li")
    public List<WebElement> FavoritesTabContentLinks;

    @FindBy(xpath = "//a[contains(.,'Most Viewed')]")
    public WebElement MostViewedTab;

    @FindBy(xpath = "//div[@id='mostviewed-content']/ul[@class='extra-list']/li")
    public List<WebElement> MostViewedTabContentLinks;

    @FindBy(css = ".email-notification-menu")
    public WebElement MailButton;

    @FindBy(xpath = "//li[@title='Recent Emails']/div")
    public WebElement MailPopup;

    @FindBy(css = "#user-menu > a")
    public WebElement userName;

    @FindBy(linkText = "Logout")
    public WebElement logOutLink;

    @FindBy(linkText = "My User")
    public WebElement myUser;


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