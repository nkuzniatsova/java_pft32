package pft32.addressbook.test;

import org.testng.annotations.Test;
import pft32.addressbook.model.ContactData;

/**
 * Created by Natallia on 21/10/16.
 */
public class ContactDeletionTests extends TestBase {

    @Test
    public void testContactDeletion () {
        app.getNavigationHelper().gotoHomePage();
        if (! app.getContactHelper().isThereAContact())
            app.getContactHelper().createContact(new ContactData("First22", "Contact22", "JavaForTesters", "Teststreet 100\nAmsterdam", "0612345678", "test@test.nl", "test11"));
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteContact();
        app.getContactHelper().submitContactDeletion();
    }
}
