package pft32.addressbook.test;

import org.testng.annotations.Test;
import pft32.addressbook.model.ContactData;

/**
 * Created by Natallia on 20/10/16.
 */
public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification() {

        app.goTo().gotoHomePage();
        if (! app.getContactHelper().isThereAContact())
            app.getContactHelper().createContact(new ContactData("First22", "Contact22", "JavaForTesters", "Teststreet 100\nAmsterdam", "0612345678", "test@test.nl", "test33", null));
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData("First22", "Contact22", "JavaForTesters", "Teststreet 100\nAmsterdam", "0612345678", "test@test.nl", null, null), false);
        app.getContactHelper().submitContactModification();
    }

}
