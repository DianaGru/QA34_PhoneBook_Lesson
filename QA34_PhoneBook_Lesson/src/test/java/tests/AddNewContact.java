package tests;

import models.Contact;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddNewContact extends TestBase {



    @BeforeMethod
    public void preCondition() {


        if (app.getHelperUser().isLogged()) {
            app.contact().openContactForm();
        } else {

            app.getHelperUser().openLoginRegistrationForm();
            app.getHelperUser().fillLoginRegistrationForm("gigi@gmail.com", "Gigi12345$");
            app.getHelperUser().submitLogin();
        }

    }

    @Test
    public void positiveAddNewContact() {
        Contact contact = Contact.builder()
                .name("Hanna")
                .lastName("Levi")
                .phone("052-326-06-26")
                .email("hanna@gmail.com")
                .address("Jaffo, Israel")
                .description("student friend")
                .build();

        app.contact().openContactForm();
        app.contact().fillContactForm(contact);
        app.contact().save();
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
    }


}

