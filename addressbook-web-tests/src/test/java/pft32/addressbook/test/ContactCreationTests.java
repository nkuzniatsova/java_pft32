package pft32.addressbook.test;

import org.testng.annotations.Test;
import pft32.addressbook.model.ContactData;

import java.io.File;

public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreation() {

        app.goTo().gotoHomePage();
        File photo = new File("src/test/resources/fotoNata.png");
        app.getContactHelper().createContact(new ContactData("First11", "Contact11", "JavaSeleniumTests", "Teststreet 100\nAmsterdam", "0612345678", "test@test.nl", "test11", photo));
    }

    /*@Test
    public void testCurrentDir() {
        File currentDir = new File(".");
        System.out.println(currentDir.getAbsolutePath());
        File photo = new File("src/test/resources/fotoNata.png");
        System.out.println(photo.getAbsolutePath());
        System.out.println(photo.exists());
    }*/
}
