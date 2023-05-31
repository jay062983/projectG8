package stepDefinitions;

import Utils.CommonMethods;
import Utils.ConfigReader;
import Utils.DBUtitlity;
import Utils.GlobalVariables;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

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
    @Given("user enters {string} an {string} and {string}")
    public void user_enters_an_and(String fname, String mname, String lname) {
       sendText(addEmployeepage.firstNameTextBox,fname);
       sendText(addEmployeepage.middleNameTextBox,mname);
       sendText(addEmployeepage.lastNameTextBox,lname);
    }
    @Given("user captures the employee id")
    public void user_captures_the_employee_id() {
        GlobalVariables.emp_id=addEmployeepage.empIdLocator.getAttribute("vlaue");
        System.out.println("The employee id is: "+ GlobalVariables.emp_id);
    }
    @Given("query the information in backend")
    public void query_the_information_in_backend() {
        String query ="Select * from hs_hr_employees where employee_id= ' "+ GlobalVariables.emp_id+" ' ";
        //to store the table coming from db, we used global variable here
        // in this variable we got all the key and values for employee that we searched
        GlobalVariables.tabledata=DBUtitlity.getListofMapsFromRset(query);
    }
    @Then("verify the results from frontend and backend")
    public void verify_the_results_from_frontend_and_backend() {
        //now, from all these values we need to compare one by one value
        String firstNameFromDB=GlobalVariables.tabledata.get(0).get("emp_firstname");
        System.out.println(firstNameFromDB);
        String lasNamefromDB=GlobalVariables.tabledata.get(0).get("emp_lastname");
        System.out.println(lasNamefromDB);
        Assert.assertEquals(firstNameFromDB,"nesha");
        Assert.assertEquals(lasNamefromDB,"standart");
        System.out.println("My assertion has passed all test cases");
    }


}
