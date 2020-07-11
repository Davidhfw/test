package pagesGuru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Guru99Login {
    WebDriver webDriver;
    By user99GuruName = By.name("uid");
    By password99Guru = By.name("password");
    By titleText = By.className("barone");
    By login = By.name("btnLogin");

    public Guru99Login(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    //set username in textbox
    public void setUser99GuruName(String userName) {
        webDriver.findElement(user99GuruName).sendKeys(userName);
    }
    //set password in password textbox
    public void setPassword99Guru(String password) {
        webDriver.findElement(password99Guru).sendKeys(password);
    }
    // click on login button
    public void clickLogin() {
        webDriver.findElement(login).click();
    }
    //get the title of Login Page
    public String getLoginTitle() {
        return webDriver.findElement(titleText).getText();
    }
    /**
     * This POM method will be exposed in test case to login in the application
     *
     */
    public void loginToGuru99(String username, String password) {
        // fill user name
        this.setUser99GuruName(username);
        // fill password
        this.setPassword99Guru(password);
        // Click Login Button
        this.clickLogin();
    }
}

