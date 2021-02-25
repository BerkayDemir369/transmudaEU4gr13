package com.transmuda.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.nio.file.Watchable;

public class VehicleCostsPage extends BasePage{

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


}
