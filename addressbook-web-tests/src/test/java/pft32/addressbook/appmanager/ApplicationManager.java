package pft32.addressbook.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/**
 * Created by Natallia on 20/10/16.
 */
public class ApplicationManager {
    private final Properties properties;
    private String browser;
    WebDriver wd;

    private SessionHelper sessionHelper;
    private NavigationHelper navigationHelper;
    private GroupHelper groupHelper;
    private ContactHelper contactHelper;

    public ApplicationManager(String browser) {
        this.browser = browser;
        properties = new Properties();
    }

    public void init() throws IOException {
        //wd = new FirefoxDriver();
        //Now you can Initialize marionette driver to launch firefox
        /*DesiredCapabilities capabilities = DesiredCapabilities.firefox();
         capabilities.setCapability("marionette", true);*/

        //WebDriver wd = new FirefoxDriver(capabilities); //for selenium 3 use new FirefoxDriver(capabilities);
        // WebDriver wd;
        String target = System.getProperty("target", "local");
        properties.load(new FileReader(new File(String.format("src/test/resources/%s.properties", target))));
        if (Objects.equals(browser, BrowserType.FIREFOX)){
            System.setProperty("webdriver.gecko.driver", "C:\\Tools\\SeleniumDrivers\\geckodriver-v0.16.0-win64\\geckodriver.exe");
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

        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wd.get(properties.getProperty("web.baseUrl", "http://localhost/addressbook/"));
        groupHelper = new GroupHelper(wd);
        contactHelper = new ContactHelper(wd);
        navigationHelper = new NavigationHelper(wd);
        sessionHelper = new SessionHelper(wd);
        sessionHelper.login(properties.getProperty("web.adminLogin", "admin"), properties.getProperty("web.adminPassword", "secret"));
    }



    public void stop() {
        wd.quit();
    }

    public GroupHelper group() {
        return groupHelper;
    }

    public ContactHelper getContactHelper() {
        return contactHelper;
    }

    public NavigationHelper goTo() {
        return navigationHelper;
    }
}
