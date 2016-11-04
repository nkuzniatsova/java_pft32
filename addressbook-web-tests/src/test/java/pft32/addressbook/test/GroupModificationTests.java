package pft32.addressbook.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pft32.addressbook.model.GroupData;

import java.util.HashSet;
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
        GroupData group = new GroupData(before.get(before.size()-1).getId(), "test11", "test21", "test31");
        app.getGroupHelper().fillGroupForm(group);
        app.getGroupHelper().submitGroepModification();
        app.getGroupHelper().returnToGroupPage();
        List<GroupData> after = app.getGroupHelper().getGroupList();
        Assert.assertEquals(after.size(), before.size());

        before.remove(before.size() - 1);
        before.add(group);
        Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));
    }
}
