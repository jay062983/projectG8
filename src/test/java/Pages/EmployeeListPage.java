package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeeListPage extends CommonMethods {

    @FindBy(xpath = "//a[@id='menu_pim_viewPimModule']")
    public WebElement pimBtn;
    @FindBy(xpath = "//input[@id='btnAdd']")
    public WebElement addEmpBtn;

    @FindBy(xpath = "//input[@id='empsearch_employee_name_empName']")
    public WebElement empNameTextBox;

    @FindBy(xpath = "//input[@id='empsearch_id']")
    public WebElement idTextBox;

    @FindBy(xpath = "//select[@id='empsearch_job_title']")
    public WebElement jobTitleDropdown;

    @FindBy(xpath = "//select[@id='empsearch_employee_status']")
    public WebElement empStatusDropdown;

    @FindBy(xpath = "//select[@id='empsearch_sub_unit']")
    public WebElement subUnitDropdown;

    @FindBy(xpath = "//select[@id='empsearch_termination']")
    public WebElement includeDropdown;

    @FindBy(xpath = "//input[@id='searchBtn']")
    public WebElement searchBtn;

    @FindBy(xpath = "//input[@id='resetBtn']")
    public WebElement resetBtn;

    public EmployeeListPage(){
        PageFactory.initElements(driver, this);
    }
}
