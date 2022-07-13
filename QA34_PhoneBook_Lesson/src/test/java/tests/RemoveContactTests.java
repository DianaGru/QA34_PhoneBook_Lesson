package tests;

import models.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class RemoveContactTests extends TestBase{

    @BeforeMethod
    public void preCondition() {


        if (!app.getHelperUser().isLogged()) {
            app.getHelperUser().login(new User().setEmail("gigigmail.com").setPassword("Gigi12345$"));
        }

        app.contact().providerContactData();
    }

    @Test
    public void removeOneContactSuccess(){
        //assert before-after=1
        Assert.assertEquals(app.contact().removeOneContact(), 1);
      //  app.contact().removeOneContact();

    }

    @Test
    public void removeAllContactsSuccess(){
        app.contact().removeAllContacts();
       Assert.assertTrue(app.contact().isNoContactsHere());
    }
}
