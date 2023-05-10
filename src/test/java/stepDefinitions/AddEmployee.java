package stepDefinitions;

import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.java.en.When;

import static stepDefinitions.pageInitializer.addEmployeepage;

public class AddEmployee extends CommonMethods {

    @When("user clicks on PIM option")
    public void user_clicks_on_pim_option() {
        doClick(addEmployeepage.pimTab);

    }
    @When("user clicks on add employee button")
    public void user_clicks_on_add_employee_button() {


        doClick(addEmployeepage.addemp);
    }
    @When("user enters firstname and middlename and lastname")
    public void user_enters_firstname_and_middlename_and_lastname() {

        sendText(addEmployeepage.firstNameTextBox, ConfigReader.getPropertyValue("firstname"));

        sendText(addEmployeepage.middleNameTextBox, ConfigReader.getPropertyValue("middlename"));

        sendText(addEmployeepage.lastNameTextBox, ConfigReader.getPropertyValue("lastname"));

    }

    }
