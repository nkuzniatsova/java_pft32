package pft32.addressbook.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pft32.addressbook.model.GroupData;

import java.util.List;

/**
 * Created by Natallia on 20/10/16.
 */
public class GroupModificationTests extends TestBase {

    @Test
    public void testGroupModification() {

        app.getNavigationHelper().gotoGroupPage();
        if (! app.getGroupHelper().isThereAGroup())
            app.getGroupHelper().createGroup(new GroupData("test1", null, null));
        List<GroupData> before = app.getGroupHelper().getGroupList();
        app.getGroupHelper().selectGroup(before.size()-1);
        app.getGroupHelper().initGroepModification();
        app.getGroupHelper().fillGroupForm(new GroupData("test11", "test21", "test31"));
        app.getGroupHelper().submitGroepModification();
        app.getGroupHelper().returnToGroupPage();
        List<GroupData> after = app.getGroupHelper().getGroupList();
        System.out.println("Nr groups before " + before.size());
        System.out.println("Nr groups after " + after.size());
        Assert.assertEquals(after.size(), before.size());
    }
}
