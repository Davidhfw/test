package pageFactoryGuru99;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99HomePage {
    WebDriver driver;
    @FindBy(xpath = "//table//tr[@class='heading3']")
    WebElement homePageUserName;
    public Guru99HomePage(WebDriver webDriver) {
        this.driver = webDriver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }
    //Get the User Name from home page
    public String getHomePageDashbordUserName() {
        return homePageUserName.getText();
    }

}
