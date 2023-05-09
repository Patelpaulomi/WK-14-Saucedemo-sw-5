package com.saucedemo.pages;

import com.aventstack.extentreports.Status;
import com.saucedemo.customlisteners.CustomListeners;
import com.saucedemo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends Utility {
    public HomePage(){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(id = "user-name")
    WebElement usernameField;

    @CacheLookup
    @FindBy(id = "password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(id = "login-button")
    WebElement loginButton;


    public void enterUserName(String userName) {
        Reporter.log(usernameField+userName);
        sendTextToElement(usernameField, userName);
        CustomListeners.test.log(Status.PASS,"Enter UserName" + userName);
    }

    public void enterPassword(String password) {
        Reporter.log(passwordField+password);
        sendTextToElement(passwordField, password);
        CustomListeners.test.log(Status.PASS,"Enter Password" + password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
        CustomListeners.test.log(Status.PASS,"Click On LoginButton");
    }
}
