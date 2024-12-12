package Object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMLoginPage {
    @FindBy(xpath = "//input[@name='username']")
    private WebElement UserName;
    @FindBy(xpath = "//input[@name='password']")
    private WebElement PassWord;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement LoginButton;
    public OrangeHRMLoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public WebElement getUserName() {
        return UserName;
    }

    public WebElement getPassWord() {
        return PassWord;
    }

    public WebElement getLoginButton() {
        return LoginButton;
    }
    public void LoginToOrangeHRMApp(String user, String pass){
        UserName.sendKeys(user);
        PassWord.sendKeys(pass);
        getLoginButton().click();
    }
}
