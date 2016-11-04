package pft32.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//System.setProperty("webdriver.gecko.driver", "C://Tools/geckodriver/geckodriver.exe");

/**
 * Created by Natallia on 20/10/16.
 */
public class NavigationHelper extends HelperBase {

    public NavigationHelper(WebDriver wd) {
        super(wd);
    }

    public void gotoGroupPage() {
        if (isElementPresent(By.tagName("h1"))
                && wd.findElement(By.tagName("h1")).getText().equals("Groups")
                && isElementPresent(By.name("new"))) {
            return;
        }

        click(By.linkText("groups"));
        //WebDriverWait wait = new WebDriverWait(wd, 10);
        //WebElement element = (new WebDriverWait(wd, 10)).until(ExpectedConditions.presenceOfElementLocated(By.tagName("h1")));
    }

    public void gotoHomePage() {
        if (isElementPresent(By.id("maintable"))) {
            return;
        }
        click(By.linkText("home"));
    }
}
