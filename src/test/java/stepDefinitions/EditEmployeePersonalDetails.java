package stepDefinitions;

import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class EditEmployeePersonalDetails extends CommonMethods {
    @Given("employee has logged in using {string} and {string}")
    public void employeeHasLoggedInUsingAnd(){


    sendText(login.usernameTextBox, ConfigReader.getPropertyValue("empusername"));
    sendText(login.passwordTextBox, ConfigReader.getPropertyValue("emppassword"));
    doClick(login.loginBtn);
    }

    @Then("clicks on Edit button")
    public void clicksOnEditButton() {
        WebElement editclick = driver.findElement(By.xpath("//input[@value='Edit']"));
        editclick.click();
    }

    @And("changes firstname middle name and lastname")
    public void changesFirstnameMiddleNameAndLastname() {
        sendText(EditEmpContactPage.firstnametextBox, ConfigReader.getPropertyValue("firstname"));

        sendText(EditEmpContactPage.middlenametextBox, ConfigReader.getPropertyValue("middlename"));

        sendText(EditEmpContactPage.lastnametextBox, ConfigReader.getPropertyValue("lastname"));


    }

    @And("clicks on gender")
    public void clicksOnGender() {
        doClick(EditEmpContactPage.radiobtn);
    }

    @And("employee selects Marital Status")
    public void employeeSelectsMaritalStatus() {
        WebElement maritalstat = driver.findElement(By.xpath("//select[@id='personal_cmbMarital']"));
        Select maritalstatus = new Select(maritalstat);
        maritalstatus.selectByValue("Single");
    }

    @Then("National dropdown menu")
    public void nationalDropdownMenu() {
        WebElement nation = driver.findElement(By.xpath("//select[@id='personal_cmbNation']"));
        Select nationality = new Select(nation);
        nationality.selectByIndex(9);
    }

    @When("user clicks on save button")
    public void user_clicks_on_save_button() {
        doClick(EditEmpContactPage.saveBtn);
    }



}


