package Guru99Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pagesGuru99.Guru99HomePage;
import pagesGuru99.Guru99Login;

import java.util.concurrent.TimeUnit;

public class Test99GuruLogin {
    String driverPath = "/home/rapheal-wu/learning/javaprojects/SeleniumTest/drivers/chromedriver";
    WebDriver driver;
    Guru99Login guru99Login;
    Guru99HomePage guru99HomePage;
    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/V4/");

    }
    @Test
    public void testHomePageAppearCorrect() {
        // Create Login Page Object
        guru99Login = new Guru99Login(driver);
        //Verify login page title
        String loginPageTitle = guru99Login.getLoginTitle();
        Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));
        // Create Home Page object
        guru99HomePage = new Guru99HomePage(driver);
        // Login to application
        guru99Login.loginToGuru99("mgr123", "mgr!23");
        //　get the next page
        guru99HomePage  = new Guru99HomePage(driver);
        Assert.assertTrue(guru99HomePage.getHomePageDashBoardUserName().toLowerCase().contains("manger id : mgr123"));
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
