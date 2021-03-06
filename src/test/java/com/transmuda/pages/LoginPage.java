package com.transmuda.pages;

import com.transmuda.utilities.ConfigurationReader;
import com.transmuda.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {

        PageFactory.initElements(Driver.get(), this);
    }


    /**
     * Locators
     */
    //------------------------------------------------

    // For login page

    @FindBy(id = "prependedInput")
    public WebElement userName;

    @FindBy(id = "prependedInput2")
    public WebElement password;

    @FindBy(name = "_submit")
    public WebElement submit;

    @FindBy(css = ".custom-checkbox__icon")
    public WebElement RememberMeOnThisComputer;

    @FindBy(xpath = "//a[.='Forgot your password?']")
    public WebElement ForgotYourPasswordLink;


    //------------------------------------------------

    // forgot password page

    @FindBy(xpath = "//button[contains(text(),'Request')]")
    public WebElement RequestButton;

    @FindBy(xpath = "//a[.='« Return to Login']")
    public WebElement ReturnToLoginPage;




    /**
     * Methods
     */
    //------------------------------------------------


    public void login(String userName, String password) {
        this.userName.sendKeys(userName);
        this.password.sendKeys(password);
        submit.click();
    }

    public void loginForSalesManagerStoreManager(String userType) {

        Driver.get().get(ConfigurationReader.get("url"));

        String username = null;
        String password = null;

        if (userType.equals("driver")) {
            username = ConfigurationReader.get("driver_username");
            password = ConfigurationReader.get("driver_password");
        } else if (userType.equals("sales manager")) {
            username = ConfigurationReader.get("sales_manager_username");
            password = ConfigurationReader.get("sales_manager_password");
        } else if (userType.equals("store manager")) {
            username = ConfigurationReader.get("store_manager_username");
            password = ConfigurationReader.get("store_manager_password");
        }

        new LoginPage().login(username, password);
    }


    public void ForgotPassword(String userName) {
        this.userName.sendKeys(userName);
        RequestButton.click();
    }

    public void forgotStoreManager() {

        String username = ConfigurationReader.get("storemanager_username");

        userName.sendKeys(username);
        RequestButton.click();
    }

    public void forgotDriver() {

        String username = ConfigurationReader.get("driver_username");

        userName.sendKeys(username);
        RequestButton.click();
    }
}
