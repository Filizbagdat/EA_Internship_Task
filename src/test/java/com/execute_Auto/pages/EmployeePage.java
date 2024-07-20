package com.execute_Auto.pages;

import com.execute_Auto.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class EmployeePage extends BasePage {

    @FindBy(xpath = "//a[text()='Create New']")
    public WebElement createBtn1;

    @FindBy(id = "Name")
    public WebElement nameInput;

    @FindBy(id = "Salary")
    public WebElement salaryInput;

    @FindBy(id = "DurationWorked")
    public WebElement durWorkedInput;

    @FindBy(id = "Grade")
    public WebElement gradeDropBox;

    @FindBy(id = "Email")
    public WebElement emailInputBox;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement createBtn2;

    public void selectDropdown(String name) {
        Select selectGrade = new Select(gradeDropBox);
        BrowserUtils.waitFor(2);
        selectGrade.selectByVisibleText(name);
    }

    public void createRegister(String name, String salary, String durationWorked, String grade, String email) {

        EmployeeListBtn.click();
        createBtn1.click();
        nameInput.sendKeys(name);
        salaryInput.sendKeys(salary);
        durWorkedInput.sendKeys(durationWorked);
        selectDropdown(grade);
        BrowserUtils.waitFor(2);
        emailInputBox.sendKeys(email);
        createBtn2.click();
    }
}
