package demoqa;

import org.bouncycastle.asn1.cms.OtherRecipientInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class PracticeDemoQA {
    WebDriver driver;
    WebDriverWait wait;
    PageActions pageActions;
    PageObject pageObject;

    class PageObject {
        By firstNameLocator = By.id("firstName");
        By lastNameLocator = By.id("lastName");
        By email = By.id("userEmail");

        public By selectGender(String gender) {
            return By.xpath("//label[text()='%s']/parent::div".formatted(gender));
        }

        By mobileNumber = By.id("userNumber");
        By DOBInputBox = By.xpath("//div[./label[text()='Date of Birth']]/following-sibling::div/div/div");
        By selectMonth = By.className("react-datepicker__month-select");
        By selectYear = By.className("react-datepicker__year-select");

        public By selectDateOfBirth(String day) {
            return By.xpath("//div[contains(@class,'react-datepicker__day') and text()='%s']".formatted(day));
        }

        By subjectTextBOx = By.id("subjectsContainer");

        public By selectHobby(String hobby) {
            return By.xpath("//label[text()='%s']/parent::div".formatted(hobby));
        }

        By currentAddressTextBox = By.id("currentAddress");
        By SelectStateDropDownButton = By.xpath("//div[./div[text()='Select State']]/following-sibling::div");
        By SelectCityDropDownButton = By.xpath("//div[./div[text()='Select City']]/following-sibling::div");

        public By selectStateDropDown(String state) {
            return By.xpath("//div[./div/div[text()='Select State']]/following-sibling::div/div/div[text()='%s']".formatted(state));
        }

        public By selectCityDropDown(String city) {
            return By.xpath("//div[./div/div[text()='Select City']]/following-sibling::div/div/div[text()='%s']".formatted(city));
        }

        By submitButtonLocator = By.id("submit");
    }

    class PageActions {
        PageObject object;
        WebDriver driver;
        WebDriverWait wait;
        JavascriptExecutor js;

        public PageActions(WebDriver driver) {
            this.object = new PageObject();
            this.driver = driver;
            wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            js = (JavascriptExecutor) driver;
        }

        public void inputFirstName(String firstName) {
            driver.findElement(object.firstNameLocator).sendKeys(firstName);
        }

        public void inputLastName(String lastName) {
            driver.findElement(object.lastNameLocator).sendKeys(lastName);
        }

        public void inputEmail(String email) {
            driver.findElement(object.email).sendKeys(email);
            driver.findElement(object.email).sendKeys(Keys.TAB);
        }

        public void selectGender(String gender) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(object.selectGender(gender)));
            js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(object.selectGender(gender)));
            driver.findElement(object.selectGender(gender)).click();
        }

        public void inputMobile(String number) {
            driver.findElement(object.mobileNumber).sendKeys(number);
        }

        public void selectDaate(String date) {
            LocalDate localDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd.MMM.yyyy", Locale.ENGLISH));
            wait.until(ExpectedConditions.elementToBeClickable(object.DOBInputBox));
            driver.findElement(object.DOBInputBox).click();

            driver.findElement(object.selectMonth).click();
            Select selectMonth = new Select(driver.findElement(object.selectMonth));
            selectMonth.selectByVisibleText(localDate.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH));

            driver.findElement(object.selectYear).click();
            Select selectYear = new Select(driver.findElement(object.selectYear));
            selectYear.selectByVisibleText(String.valueOf(localDate.getYear()));

            wait.until(ExpectedConditions.elementToBeClickable(object.selectDateOfBirth(String.valueOf(localDate.getDayOfMonth()))));
            driver.findElement(object.selectDateOfBirth(String.valueOf(localDate.getDayOfMonth()))).sendKeys(Keys.ENTER);
        }

        public void inputSubject(String subject) {
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(object.subjectTextBOx)));
            js.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(object.subjectTextBOx));
            driver.findElement(object.subjectTextBOx).sendKeys(subject);
        }

        public void hobbyCheck(String hobby) {
            js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(object.selectHobby(hobby)));
            js.executeScript("arguments[0].click();", driver.findElement(object.selectHobby(hobby)));
        }

        public void inputCurrentAddress(String address) {
            driver.findElement(object.currentAddressTextBox).sendKeys(address);
        }

        public void inputState(String state) {
            js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(object.SelectStateDropDownButton));
            driver.findElement(object.SelectStateDropDownButton).click();
            driver.findElement(object.selectStateDropDown(state));
        }

        public void inputCity(String city) {
            js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(object.SelectCityDropDownButton));
            driver.findElement(object.SelectCityDropDownButton).click();
            driver.findElement(object.selectCityDropDown(city));
        }

        public void submit() {
            driver.findElement(object.submitButtonLocator).click();
        }

    }

    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoqa.com/automation-practice-form");
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    public void form() {
        pageActions = new PageActions(driver);
        pageActions.inputFirstName("Shubham");
        pageActions.inputLastName("Tirpue");
        pageActions.inputEmail("sgta@gmail.com");
        pageActions.selectGender("Male");
        pageActions.inputMobile("8698498054");
        pageActions.selectDaate("25.May.2025");
        pageActions.inputSubject("Something");
        pageActions.hobbyCheck("Reading");
        pageActions.inputCurrentAddress("Wallstreat");
        pageActions.inputState("NCR");
        pageActions.inputCity("Delhi");
        pageActions.submit();
    }

    @AfterTest
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
