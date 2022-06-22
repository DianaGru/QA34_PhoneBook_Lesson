package tests;

import org.testng.annotations.Test;

public class LoginTests extends TestBase{


//login success:
    @Test
    public void loginSuccess(){
//3. open form
       openLoginRegistrationForm();
//4. fill form + valid data
       fillLoginRegistrationForm("gigi@gmail.com","Gigi12345$");
//5. submit login
       submitLogin();
//6. Assert (is login success?) -->button 'logout IS present?'

    }

//negative login:
    @Test
    public void negativeLogin(){
//3. open form
       openLoginRegistrationForm();
//4. fill form + invalid data
       fillLoginRegistrationForm("gigigmail.com","Gigi12345$");
//5. submit login
       submitLogin();
//6. Assert (is login unsuccessful?) -->button 'logout NOT present?'


    }


}
