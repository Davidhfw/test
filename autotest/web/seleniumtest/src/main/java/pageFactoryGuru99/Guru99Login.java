package pageFactoryGuru99;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99Login {
    WebDriver driver;
    @FindBy(name="uid")
    WebElement  use99GuruName;
    @FindBy(name="password")
    WebElement password99Guru;
    @FindBy(name = "barone")
    WebElement titleText;
    @FindBy(name = "btnLogin")
    WebElement login;

    public Guru99Login(WebDriver webDriver) {
        this.driver = webDriver;
        //This initElements method will create all webElements
        PageFactory.initElements(driver, this);
    }

    //set userName in text box
    public void setUse99GuruName(String strUserName) {
        use99GuruName.sendKeys(strUserName);
    }
    // set password in password textbox
    public void setPassword99Guru(String strPassword) {
        password99Guru.sendKeys(strPassword);
    }
    // Click on login button
    public void clickButton() {
        login.click();
    }
    //Get the title of LoginPage
    public String getLoginTitle() {
        return titleText.getText();
    }

    /**
     * This POM Method will be exposed in test case to login in the application
     * @param userName
     * @param password
     */
    public void loginToGuru99(String userName, String password) {
        // Fill user name
        this.setUse99GuruName(userName);
        // Fill password
        this.setPassword99Guru(password);
        // Click Login Btn
        this.clickButton();
    }
}
