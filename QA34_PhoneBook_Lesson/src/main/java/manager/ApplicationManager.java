package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ApplicationManager {

    WebDriver wd;
    HelperUser helperUser;//1

    public void init(){
        wd = new ChromeDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/");
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        helperUser = new HelperUser(wd);//2
    }

    public void stop(){

        wd.quit();
    }

    public HelperUser getHelperUser() {//3
        return helperUser;
    }

}
