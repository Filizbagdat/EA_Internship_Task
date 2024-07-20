package com.execute_Auto.pages;

import com.execute_Auto.utilities.Driver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
public abstract class BasePage {

    @FindBy(id = "loginLink")
    public WebElement loginBtn;

    @FindBy(xpath = "//a[text()='Employee List']")
    public WebElement EmployeeListBtn;

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }
}



