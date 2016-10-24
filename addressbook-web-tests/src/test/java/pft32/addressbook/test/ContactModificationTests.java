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

        app.getNavigationHelper().gotoHomePage();
        if (! app.getContactHelper().isThereAContact())
            app.getContactHelper().createContact(new ContactData("First22", "Contact22", "JavaForTesters", "Teststreet 100\nAmsterdam", "0612345678", "test@test.nl", "test11"));
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData("First22", "Contact22", "JavaForTesters", "Teststreet 100\nAmsterdam", "0612345678", "test@test.nl", null), false);
        app.getContactHelper().submitContactModification();
    }

}
