package com.transmuda.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class VehicleInfoPage extends BasePage{
    //US-18
    @FindBy(xpath = "//button[@class='sidebar__add-widget']")
    public WebElement sidebarWidgetButton;
    @FindBy(xpath="(//a[contains(text(),'Add')])[1]")
    public WebElement recentEmailsAddButton;
    @FindBy(xpath = "(//a[contains(text(),'Add')])[2]")
    public WebElement stickyNoteAddButton;
    @FindBy(xpath = "(//a[contains(text(),'Add')])[3]")
    public WebElement taskListAddButton;
    @FindBy(xpath = "//a[contains(text(),'Close')]")
    public WebElement closeButton;

    //pin button to pin the page
    @FindBy(xpath = "//i[@class='fa-thumb-tack hide-text']")
    public WebElement pinButton;

    //favorite button
    @FindBy(xpath = "//i[contains(text(),'Favorites')]")
    public WebElement favoriteButton;




}
