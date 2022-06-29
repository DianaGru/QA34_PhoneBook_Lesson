package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {

    @BeforeMethod
    public void preCondition() {

        if(app.getHelperUser().isLogged()){
            app.getHelperUser().logOut();
        }
    }

    //login success:
    @Test
    public void loginSuccess() {

        app.getHelperUser().openLoginRegistrationForm();
        app.getHelperUser().fillLoginRegistrationForm("gigi@gmail.com", "Gigi12345$");
        app.getHelperUser().submitLogin();
//6. Assert (is login success?) -->button 'logout IS present?'
        Assert.assertTrue(app.getHelperUser().isLogged());

    }

    //negative login:
    @Test
    public void negativeLoginTest() {

        app.getHelperUser().openLoginRegistrationForm();
        app.getHelperUser().fillLoginRegistrationForm("gigigmail.com", "Gigi12345$");
        app.getHelperUser().submitLogin();
//6. Assert (is login unsuccessful?) -->button 'logout NOT present?'
        Assert.assertFalse(app.getHelperUser().isLogged());
        Assert.assertTrue(app.getHelperUser().isAlertDisplayed());
        Assert.assertTrue();


    }


}
