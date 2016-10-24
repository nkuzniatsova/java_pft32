package pft32.addressbook.test;

import org.testng.annotations.Test;
import pft32.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreation() {

        app.getNavigationHelper().gotoHomePage();
        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContactForm(new ContactData("First11", "Contact11", "JavaForTesters", "Teststreet 100\nAmsterdam", "0612345678", "test@test.nl", "test11"), true);
        app.getContactHelper().submitContactCreation();
    }

}
