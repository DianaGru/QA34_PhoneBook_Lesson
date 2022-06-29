package tests;

import manager.ApplicationManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class TestBase {

   static ApplicationManager app = new ApplicationManager();

    @BeforeSuite //steps 1-2
    public void setUp() {

        app.init();

    }

    @AfterSuite //step 7
    public void tearDown() {

       // app.stop();

    }


}
