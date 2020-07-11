package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
        By usernameBy = By.name("username");
        By passwordBy = By.name("password");
        By loginButtonBy = By.className("SignFlow-submitButton");
        // By loginButtonNetCase = By.className("u-loginbtn");
        public LoginPage(WebDriver driver) {
            super(driver);
        }

        public LoginPage loginToZhiHu(String username, String password) {
            writeText(usernameBy, username);
            writeText(passwordBy, password);
            click(loginButtonBy);
            return this;
        }
        public LoginPage verifyLoginUserName(String expectedText){
            By errorMessageUsernameBy = By.xpath("//*[@id=\"root\"]/div/main/div/div/div/div[2]/div[1]/form/div[1]/div[2]/div[2]");
            assertEquals(errorMessageUsernameBy,expectedText);
            return this;
        }
        public LoginPage verifyLoginPassword(String expectedText){
            By errorMessagePasswordBy = By.xpath("//*[@id=\"root\"]/div/main/div/div/div/div[2]/div[1]/form/div[2]/div/div[2]");
            assertEquals(errorMessagePasswordBy,expectedText);
            return this;
        }

}