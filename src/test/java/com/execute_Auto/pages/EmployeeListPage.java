package com.execute_Auto.pages;

import com.execute_Auto.utilities.*;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import static org.junit.Assert.*;

public class EmployeeListPage extends BasePage {

    @FindBy(name = "searchTerm")
    public WebElement searchInput;

    @FindBy(xpath = "//input[@value='Search']")
    public WebElement searchBox;

    @FindBy(xpath = "//a[text()='Benefits']")
    public WebElement benefits;

    @FindBy(xpath = "//a[text()='Delete']")
    public WebElement deleteBtn;

    @FindBy(xpath = "//input[@value='Delete']")
    public WebElement deleteButton;

    public void searchRegister (String name) {

        searchInput.sendKeys(name);
        searchBox.click();
    }

    public void verifyRegister(String name) {

        searchRegister(name);
        benefits.click();
        String actualText = "Benefits Listed for " + name;
        String benefitText= Driver.get().findElement(By.xpath(" //h2[text()=' Benefits Listed for " +name + "']")).getText();
        Assert.assertEquals(benefitText, actualText);
    }

    public void deleteRegister(String name) {

        EmployeeListBtn.click();
        searchRegister(name);
        deleteBtn.click();
        deleteButton.click();
        searchInput.sendKeys(name);
        searchBox.click();
    }

    public void verifyDeletedRegister(String email) {

        boolean isPresent = Driver.get().getPageSource().contains(email);
        assertFalse(isPresent);
    }
}



