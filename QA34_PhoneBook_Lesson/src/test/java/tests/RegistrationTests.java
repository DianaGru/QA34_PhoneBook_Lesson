package tests;

import org.testng.annotations.Test;

public class RegistrationTests extends TestBase {

    @Test
    public void loginSuccess() {

        app.getHelperUser().openLoginRegistrationForm();
        app.getHelperUser().fillLoginRegistrationForm("gigi001@gmail.com", "Gigi12345$");
        app.getHelperUser().submitLogin();
    }
}
