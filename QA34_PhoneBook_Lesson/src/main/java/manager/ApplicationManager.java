package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class ApplicationManager {

    WebDriver wd;
    HelperUser helperUser;//1
    HelperContact contact;
    Logger logger = LoggerFactory.getLogger(ApplicationManager.class);

    public void init(){
        wd = new ChromeDriver();
        logger.info("All tests run in Chrome browser");
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/");
        logger.info("Current url --> "+wd.getCurrentUrl());
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        helperUser = new HelperUser(wd);//2
        contact = new HelperContact(wd);
    }

    public void stop(){

        wd.quit();
    }

    public HelperUser getHelperUser() {//3
        return helperUser;
    }

    public HelperContact contact() {
        return contact;
    }
}
