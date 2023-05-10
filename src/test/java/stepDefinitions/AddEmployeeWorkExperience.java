package stepDefinitions;

import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AddEmployeeWorkExperience extends CommonMethods {
    @Given("employee has logged in")
    public void employeeHasLoggedIn() {

    sendText(login.usernameTextBox, ConfigReader.getPropertyValue("empusername"));
    sendText(login.passwordTextBox, ConfigReader.getPropertyValue("emppassword"));
    doClick(login.loginBtn);
    }
    @Given("employee clicked MyInfo tab")
    public void employee_clicked_my_info_tab() {
        doClick(AddEmployeeWorkExperiencePage.myInfoTab);
    }


    @When("Employee clicks on Qualifications")
    public void employee_clicks_on_qualifications() {
      doClick(AddEmployeeWorkExperiencePage.QualifyBtn);
    }
    @And("user clicks on add work experience button")
    public void userClicksOnAddWorkExperienceButton() {

        doClick(AddEmployeeWorkExperiencePage.addworkexpBtn);
    }
    @Then("user enters previous company name")
    public void user_enters_previous_company_name() {
        sendText(AddEmployeeWorkExperiencePage.CompanyName, ConfigReader.getPropertyValue("companyname") );
    }
    @Then("user enters previous job title")
    public void user_enters_previous_job_title() {
        sendText(AddEmployeeWorkExperiencePage.JobTitle, ConfigReader.getPropertyValue("previoiusjobtitle"));
    }
    @And("user enters start date")
    public void userEntersStartDate() {
        doClick(AddEmployeeWorkExperiencePage.FromCalender);
        Select months=new Select(AddEmployeeWorkExperiencePage.month);
        months.selectByIndex(6);
        Select years=new Select(AddEmployeeWorkExperiencePage.year);
        years.selectByValue("2016");
        boolean isFound=false;
        WebElement next = driver.findElement(By.xpath("//span[text()='Next']"));
        List<WebElement> days=driver.findElements(By.xpath("//input[@id='experience_from_date']"));
        for(WebElement day:days){
            String day_text= day.getText();
            if(day_text.equalsIgnoreCase("20")){
                day.click();
                isFound=true;
                break;
            }
            else {
                next.click();
    }}}
            @Then("user Enters End date")
            public void userEntersEndDate() {
        doClick(AddEmployeeWorkExperiencePage.TOCalender);
        Select Tomonths=new Select(AddEmployeeWorkExperiencePage.month);
            Tomonths.selectByIndex(6);
            Select Toyears=new Select(AddEmployeeWorkExperiencePage.year);
            Toyears.selectByValue("2016");
            boolean isFound1=false;
            WebElement Tonext = driver.findElement(By.xpath("//span[text()='Next']"));
            List<WebElement> Todays=driver.findElements(By.xpath("//input[@id='experience_from_date']"));
            for(WebElement Today:Todays){
                String Today_text= Today.getText();
                if(Today_text.equalsIgnoreCase("20")){
                    Today.click();
                    isFound1=true;
                    break;
                }
                else {
                    Tonext.click();


                }}}
              @Then("user leaves comments in the comment box")
            public void user_leaves_comments_in_the_comment_box() {
                sendText(AddEmployeeWorkExperiencePage.comments, ConfigReader.getPropertyValue("comment"));

}
@Then("user clicks on workExperience save button")
    public void userClicksOnWorkExperienceSaveButton() {
        doClick(AddEmployeeWorkExperiencePage.btnWorkEx);
    }



}
