package tests;

import manager.ApplicationManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBase {

   static ApplicationManager app = new ApplicationManager();

    @BeforeMethod //steps 1-2
    public void setUp() {

        app.init();

    }

    @AfterMethod //step 7
    public void tearDown() {

        app.stop();

    }
    

}
