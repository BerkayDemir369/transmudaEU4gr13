package com.transmuda.pages;

import com.transmuda.utilities.ConfigurationReader;
import com.transmuda.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage {

    public ForgotPasswordPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    //driver.findElement(By.id("prependedInput"));
    @FindAll({
            @FindBy(id = "prependedInput"),
            @FindBy(name = "username")
    })
    public WebElement usernameInput;


    @FindBy(xpath = "//button[contains(text(),'Request')]")
    public WebElement loginBtn;

    public void login(String username, String password) {
        usernameInput.sendKeys(username);
        loginBtn.click();
    }

    public void forgotStoreManager() {

        String username = ConfigurationReader.get("storemanager_username");

        usernameInput.sendKeys(username);
        loginBtn.click();
    }

    public void forgotDriver() {

        String username = ConfigurationReader.get("driver_username");

        usernameInput.sendKeys(username);
        loginBtn.click();
    }

}
