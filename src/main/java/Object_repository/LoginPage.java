package Object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy(xpath = "//input[@type='text']")
    private WebElement username;
    @FindBy(xpath = "//input[@type='password']")
    private WebElement password;
    @FindBy(xpath = "//button[@name='login']")
    private WebElement loginbotton;
    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public WebElement getUsername() {
        return username;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getLoginbotton() {
        return loginbotton;
    }

    public void setUsername(WebElement username) {
        this.username = username;
    }

    public void logintoapp(String user, String pass){
        username.sendKeys(user);
        password.sendKeys(pass);
        loginbotton.click();
    }
}
