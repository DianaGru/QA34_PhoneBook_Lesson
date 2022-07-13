package tests;

import models.Contact;
import models.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Random;

public class AddNewContact extends TestBase {



    @BeforeMethod
    public void preCondition() {


        if (!app.getHelperUser().isLogged()) {
           app.getHelperUser().login(new User().setEmail("gigigmail.com").setPassword("Gigi12345$"));


        }

    }

    @Test (invocationCount = 5)
    public void positiveAddNewContact() {
        Random random = new Random();
        int i = random.nextInt(1000)+1000;

        Contact contact = Contact.builder()
                .name("Hanna"+1)
                .lastName("Levi")
                .phone("052-326"+i)
                .email("hanna@gmail.com")
                .address("Jaffo, Israel")
                .description("student friend")
                .build();

        app.contact().openContactForm();
        app.contact().fillContactForm(contact);
        app.contact().save();

        Assert.assertTrue(app.contact().isContactAddedByName(contact.getName()));
        Assert.assertTrue(app.contact().isContactAddedByPhone(contact.getPhone()));
    }

    @Test
    public void positiveAddNewContact2() {
        int i = (int) System.currentTimeMillis() / 1000;
        Contact contact = Contact.builder()
                .name("Hanna")
                .lastName("Levi")
                .phone("052-326-06-26")
                .email("hanna"+i+"@gmail.com")
                .address("Jaffo, Israel")
                .description("student friend")
                .build();

        app.contact().openContactForm();
        app.contact().fillContactForm(contact);
        app.contact().save();

        Assert.assertTrue(app.contact().isContactAddedByName(contact.getName()));
    }


}

