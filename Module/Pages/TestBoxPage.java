package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestBoxPage {
    private WebDriver driver;
    private WebDriverWait wait;

    // Locators
    private By userNameField = By.id("userName");
    private By userEmailField = By.id("userEmail");
    private By currentAddressField = By.id("currentAddress");
    private By permanentAddressField = By.id("permanentAddress");
    private By submitButton = By.id("submit");
    private By outputText = By.id("output");

    // Constructor
    public TestBoxPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Methods for interacting with elements
    public void scrollToView() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 450);");
    }

    public void enterUserName(String userName) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(userNameField));
        element.sendKeys(userName);
    }

    public void enterUserEmail(String userEmail) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(userEmailField));
        element.sendKeys(userEmail);
    }

    public void enterCurrentAddress(String currentAddress) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(currentAddressField));
        element.sendKeys(currentAddress);
    }

    public void enterPermanentAddress(String permanentAddress) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(permanentAddressField));
        element.sendKeys(permanentAddress);
    }

    public void clickSubmitButton() {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(submitButton));
        element.click();
    }

    public String getOutputText() {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(outputText));
        return element.getText();
    }
}
