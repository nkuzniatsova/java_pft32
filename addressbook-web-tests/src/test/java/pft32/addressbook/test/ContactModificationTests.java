package pft32.addressbook.test;

import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;
import pft32.addressbook.model.ContactData;

/**
 * Created by Natallia on 20/10/16.
 */
public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification() {

       // app.getContactHelper().gotoContactPage();
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData("First22", "Contact22", "JavaForTesters", "Teststreet 100\nAmsterdam", "0612345678", "test@test.nl"));
        app.getContactHelper().submitContactModification();
    }

}
