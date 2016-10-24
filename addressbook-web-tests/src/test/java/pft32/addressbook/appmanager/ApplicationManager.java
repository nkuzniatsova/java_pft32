package pft32.addressbook.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/**
 * Created by Natallia on 20/10/16.
 */
public class ApplicationManager {
    private String browser;
    WebDriver wd;

    private SessionHelper sessionHelper;
    private NavigationHelper navigationHelper;
    private GroupHelper groupHelper;
    private ContactHelper contactHelper;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }

    public void init() {
        //wd = new FirefoxDriver();
        //Now you can Initialize marionette driver to launch firefox
        /*DesiredCapabilities capabilities = DesiredCapabilities.firefox();
         capabilities.setCapability("marionette", true);*/

        //WebDriver wd = new FirefoxDriver(capabilities); //for selenium 3 use new FirefoxDriver(capabilities);
        // WebDriver wd;

        if (Objects.equals(browser, BrowserType.FIREFOX)){
            DesiredCapabilities capabilities = DesiredCapabilities.firefox();
            capabilities.setCapability("marionette", true);
            wd = new FirefoxDriver(capabilities);
        }
        else if (Objects.equals(browser, BrowserType.CHROME)){
            DesiredCapabilities capabilities = DesiredCapabilities.chrome();
            capabilities.setCapability("marionette", true);
            wd = new ChromeDriver(capabilities);
        }
        else if (Objects.equals(browser, BrowserType.IE)){
            DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
            capabilities.setCapability("marionette", true);
            wd = new InternetExplorerDriver(capabilities);
        }
        else if (Objects.equals(browser, BrowserType.SAFARI)){
            DesiredCapabilities capabilities = DesiredCapabilities.safari();
            capabilities.setCapability("marionette", true);
            wd = new SafariDriver(capabilities);
        }

        wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbook/");
        groupHelper = new GroupHelper(wd);
        contactHelper = new ContactHelper(wd);
        navigationHelper = new NavigationHelper(wd);
        sessionHelper = new SessionHelper(wd);
        sessionHelper.login("admin", "secret");
    }



    public void stop() {
        wd.quit();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public ContactHelper getContactHelper() {
        return contactHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }
}
