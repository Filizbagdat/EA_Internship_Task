package com.execute_Auto.stepDefs;

import com.execute_Auto.pages.*;
import com.execute_Auto.utilities.*;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class CreateDelete_stepDefs {

    LoginPage loginPage = new LoginPage();
    EmployeePage employeePage = new EmployeePage();
    EmployeeListPage employeeListPage = new EmployeeListPage();

    @Given("The user is on the web page")
    public void the_user_is_on_the_web_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("The user navigates to login menu")
    public void the_user_navigates_to_login_menu() {
        loginPage.loginBtn.click();
    }

    @And("The user enters admins credentials")
    public void theUserEntersAdminsCredentials() {
        loginPage.login();
    }

    @And("The user enters {string} and {string} and {string} and {string}> and {string}")
    public void theUserEntersAndAndAndAnd(String name, String salary, String durationwork, String grade, String email) {
        employeePage.createRegister(name, salary, durationwork, grade, email);
    }

    @Then("The user verifies that {string}is in employeelist")
    public void theUserVerifiesThatIsInEmployeelist(String name) {
        employeeListPage.verifyRegister(name);
    }

    @And("The user deletes that {string}is in employeelist")
    public void theUserDeletesThatIsInEmployeelist(String name) {
        employeeListPage.deleteRegister(name);
    }

    @Then("The user verifies that {string}  deleted in employeelist")
    public void theUserVerifiesThatDeletedInEmployeelist(String email) {
        employeeListPage.verifyDeletedRegister(email);
    }
}
