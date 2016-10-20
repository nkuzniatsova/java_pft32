package pft32.addressbook.test;

import org.testng.annotations.Test;
import pft32.addressbook.model.GroupData;

/**
 * Created by Natallia on 20/10/16.
 */
public class GroupModificationTests extends TestBase {

    @Test
    public void testGroupModification() {

        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroepModification();
        app.getGroupHelper().fillGroupForm(new GroupData("test11", "test21", "test31"));
        app.getGroupHelper().submitGroepModification();
        app.getGroupHelper().returnToGroupPage();
    }
}
