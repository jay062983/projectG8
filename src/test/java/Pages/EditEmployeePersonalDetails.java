package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditEmployeePersonalDetails extends CommonMethods {


    @FindBy(xpath = "//a[@id='menu_pim_viewEmployeeList']")
    public WebElement empSearchlist;
    @FindBy(xpath = "//input[@id='empsearch_id']")
    public WebElement empId;
    @FindBy(xpath = "//a[text()='10465045']")
    public WebElement empIdno;
    @FindBy(xpath = "//input[@title='First Name']")
    public WebElement firstnametextBox;
    @FindBy(xpath = "//input[@title='Middle Name']")
    public WebElement middlenametextBox;
    @FindBy(xpath = "//input[@title='Last Name']")
    public WebElement lastnametextBox;
    @FindBy(xpath = "//input[@id='searchBtn']")
    public WebElement searchbtn;
    @FindBy(xpath = "//label[text()='Female']")
    public WebElement radiobtn;
    @FindBy(xpath = "//input[@id='btnSave']")

    public WebElement saveBtn;

    public EditEmployeePersonalDetails() {
        PageFactory.initElements(driver, this);
    }
}