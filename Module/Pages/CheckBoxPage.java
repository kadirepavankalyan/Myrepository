package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckBoxPage {
    private WebDriverWait wait;

    // Locators
    private By checkBoxTitleName  = By.className("rct-title");
    
    private By outputText = By.id("result");

    // Constructor
    public CheckBoxPage(WebDriver driver) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Methods for interacting with elements
    public void clickOnCheckBox() {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(checkBoxTitleName));
        element.click();
    }
    
    public String getOutputText() {
    	WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(outputText));
    	return element.getText();

    }

}
