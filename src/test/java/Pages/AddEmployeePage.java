package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployeePage extends CommonMethods {

    @FindBy(xpath = "//a[@id='menu_pim_viewPimModule']")
   public WebElement pimTab;
    @FindBy(id="menu_pim_addEmployee")
    public  WebElement addemp;
    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement firstNameTextBox;

    @FindBy(xpath = "//input[@id='middleName']")
   public WebElement middleNameTextBox;

    @FindBy(xpath = "//input[@id='lastName']")
   public WebElement lastNameTextBox;

    @FindBy(xpath = "//input[@id='employeeId']")
    public WebElement empIdTextBox;

    @FindBy(xpath = "//input[@id='photofile']")
    public WebElement photoFileBox;

    @FindBy(xpath = "//input[@id='chkLogin']")
  public   WebElement createLoginDetailsBtn;

    @FindBy(xpath = "//input[@id='user_name']")
   public WebElement usernameTextBox;

    @FindBy(xpath = "//input[@id='user_password']")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//input[@id='re_password']")
   public WebElement confirmPasswordTextBox;

    @FindBy(xpath = "//select[@id='status']")
   public WebElement statusDropdown;

    @FindBy(xpath = "//input[@id='btnSave']")

   public WebElement saveBtn;
    @FindBy(id="employeeId")
    public WebElement empIdLocator;

    public AddEmployeePage(){
        PageFactory.initElements(driver, this);
    }
}
