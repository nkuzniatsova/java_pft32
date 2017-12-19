package pft32.addressbook.bdd;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.remote.BrowserType;
import pft32.addressbook.appmanager.ApplicationManager;
import pft32.addressbook.model.GroupData;

import java.io.IOException;


/**
 * Created by User on 21/04/2017.
 */

public class GroupStepDefenitions {

    private ApplicationManager app;

    @Before
    public void init() throws IOException {
        app = new ApplicationManager(System.getProperty("browser", BrowserType.FIREFOX));
        app.init();
    }

    @After
    public void stop() {
        app.stop();
        app = null;
    }

    @Given("^a set of groups$")
    public void loadGroups() {

    }

    @When("^I create a new group with name (.+), header (.+) and footer (.+)$")
    public void createGroup(String name, String header, String footer) {
        app.goTo().groupPage();
        app.group().create(new GroupData(name, header, footer));
    }

    @Then("^the new set of groups is equal to the old set with the added group$")
    public void verifyGroupCreated() {

    }
}
