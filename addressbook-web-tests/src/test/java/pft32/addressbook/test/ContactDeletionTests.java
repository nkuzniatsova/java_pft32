package pft32.addressbook.test;

import org.testng.annotations.Test;

/**
 * Created by Natallia on 21/10/16.
 */
public class ContactDeletionTests extends TestBase {

    @Test
    public void testContactDeletion () {
        app.getNavigationHelper().gotoHomePage();
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteContact();
        app.getContactHelper().submitContactDeletion();
    }
}
