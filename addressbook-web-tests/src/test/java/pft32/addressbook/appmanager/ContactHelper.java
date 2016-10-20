package pft32.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import pft32.addressbook.model.ContactData;

/**
 * Created by Natallia on 20/10/16.
 */
public class ContactHelper extends HelperBase {

    public ContactHelper(FirefoxDriver wd) {
        super(wd);
    }

    public void fillContactForm(ContactData contactData) {
        type(By.name("firstname"),contactData.getFirstName());
        type(By.name("lastname"),contactData.getLastName());
        type(By.name("company"),contactData.getCompanyName());
        type(By.name("address"),contactData.getContactAddress());
        type(By.name("mobile"),contactData.getContactMob());
        type(By.name("email"),contactData.getContactEmail());
    }

    public void submitContactCreation() {
        click(By.xpath("//div[@id='content']/form/input[21]"));
    }

    public void initContactCreation() {
        click(By.linkText("add new"));
    }


}
