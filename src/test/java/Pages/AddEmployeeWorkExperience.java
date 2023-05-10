package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployeeWorkExperience extends CommonMethods {
    @FindBy(xpath = "//b[text()='My Info']")
    public WebElement myInfoTab;
    @FindBy(xpath = "//a[text()='Qualifications']")
    public WebElement empIdnum;

    @FindBy(xpath="//a[contains(@href,'Qua')]")
   public WebElement QualifyBtn;
    @FindBy(xpath = "//input[@id='addWorkExperience']")
    public WebElement addworkexpBtn;
@FindBy(xpath = "//input[@id='experience_employer']")
    public WebElement CompanyName;
@FindBy(xpath  ="//input[@id='experience_jobtitle']")
    public WebElement JobTitle;
@FindBy(xpath = "//input[@id='experience_from_date']")
    public WebElement FromCalender;
    @FindBy(xpath = "//label[text()='To']")
    public WebElement TOCalender;
@FindBy(xpath = "//select[@class='ui-datepicker-month']")
    public WebElement month;
@FindBy(xpath = "//select[@class='ui-datepicker-year']")
    public WebElement year;
@FindBy(xpath = "//textarea[@id='experience_comments']")
public WebElement comments;
@FindBy(xpath = "//input[@id='btnWorkExpSave']")
    public WebElement btnWorkEx;
public AddEmployeeWorkExperience(){
    PageFactory.initElements(driver, this);
}
}
