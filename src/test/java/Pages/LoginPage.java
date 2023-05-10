package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonMethods {
    @FindBy(xpath = "//input[@id='txtUsername']")
    public
    WebElement usernameTextBox;

    @FindBy(xpath = "//input[@id='txtPassword']")
    public
    WebElement passwordTextBox;

    @FindBy(xpath = "//input[@id='btnLogin']")
    public
    WebElement loginBtn;

    @FindBy(xpath = "//span[@id='spanMessage']")
            public
    WebElement errorMsg;

    @FindBy(xpath = "//title")
            public
    WebElement loginPageTitle;

    public LoginPage(){
        PageFactory.initElements(driver, this);
    }
}
