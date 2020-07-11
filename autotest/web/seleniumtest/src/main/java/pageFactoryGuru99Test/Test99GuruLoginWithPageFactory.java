package pageFactoryGuru99Test;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageFactoryGuru99.Guru99HomePage;
import pageFactoryGuru99.Guru99Login;

import java.util.concurrent.TimeUnit;

public class Test99GuruLoginWithPageFactory {
    String dirverPath = "/home/rapheal-wu/learning/javaprojects/SeleniumTest/drivers/chromedriver";
    WebDriver driver;
    Guru99Login objLogin;
    Guru99HomePage  objHomePage;
    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", dirverPath);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/V4/");
    }
    @Test
    public void testHomePageAppearCorrect() {
        // Create Login Page Object
        objLogin = new Guru99Login(driver);
        // Verify Login Page Title
        String loginPageTitle = objLogin.getLoginTitle();
        Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru bank"));
        // Login to Application
        objLogin.loginToGuru99("mgr123", "mgr!123");
        // go to the next page
        objHomePage = new Guru99HomePage(driver);
        // Verify Home Page
        Assert.assertTrue(objHomePage.getHomePageDashbordUserName().toLowerCase().contains("manger id : mgr123"));

    }
    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
