package com.execute_Auto.pages;

import com.execute_Auto.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id = "UserName")
    public WebElement inputUserName;

    @FindBy(id = "Password")
    public WebElement inputPassword;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement loginButton;

    public void login() {

        inputUserName.sendKeys(ConfigurationReader.get("username"));
        inputPassword.sendKeys(ConfigurationReader.get("password"));
        loginButton.click();
    }
}
