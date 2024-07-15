package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Pages.TestBoxPage;
import Pages.CheckBoxPage;

public class LoginTest {
    private WebDriver driver;
    private TestBoxPage textBoxPage;
    private CheckBoxPage checkBoxPage;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        textBoxPage = new TestBoxPage(driver);
        checkBoxPage = new CheckBoxPage(driver);
        
        driver.manage().window().maximize();
    }

    @Test
    public void fillTextBoxForm() {
        driver.get("https://demoqa.com/text-box");
        System.out.println("Title: " + driver.getTitle());

        textBoxPage.scrollToView();
        textBoxPage.enterUserName("Pavan");
        textBoxPage.enterUserEmail("Pavan@dispostable.com");
        textBoxPage.enterCurrentAddress("2-4, Bangalore, 560068");
        textBoxPage.enterPermanentAddress("2-4, Hyderabad, 568829");
        textBoxPage.clickSubmitButton();
        System.out.println("Output Text after clicking on submit with valid details: " + textBoxPage.getOutputText());
    }
    
    @Test
    public void checkBoxForm() {
    	driver.get("https://demoqa.com/checkbox");
    	System.out.println("Tilte: " + driver.getTitle());
    	
        textBoxPage.scrollToView();    	
    	checkBoxPage.clickOnCheckBox();
    	System.out.println("Output Text after checkbox selection: "+ checkBoxPage.getOutputText());
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
