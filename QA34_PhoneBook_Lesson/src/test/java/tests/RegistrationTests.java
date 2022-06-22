package tests;

import org.testng.annotations.Test;

public class RegistrationTests extends TestBase {

    @Test
    public void loginSuccess() {
//3. open form
        openLoginRegistrationForm();
//4. fill form + valid data
        fillLoginRegistrationForm("gigi001@gmail.com", "Gigi12345$");
//5. submit registration
        submitRegistration();
    }
}
