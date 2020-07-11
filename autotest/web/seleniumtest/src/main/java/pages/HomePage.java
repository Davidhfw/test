package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    String baseUrl = "https://www.zhihu.com";
    By signInButtonBy = By.xpath("//*[@id=\"root\"]/div/main/div/div/div/div[2]/div[2]/span");
    public HomePage goToN11() {
        driver.get(baseUrl);
        return this;
    }
    public LoginPage goToLoginPage() {
        click(signInButtonBy);
        return new LoginPage(driver);
    }
}
//*[@id="auto-id-1588643780950"]
//*[@id="auto-id-1588643780950"]

//*[@id="root"]/div/main/div/div/div/div[1]/div/form/div[2]/div[2]/label
//*[@id="auto-id-1588643780950"]
//*[@id="auto-id-1588643781000"]
//*[@id="root"]/div/main/div/div/div/div[1]/div/form/button
//*[@id="root"]/div/main/div/div/div/div[1]/div/form/div[2]/div[2]/div
//*[@id="root"]/div/main/div/div/div/div[1]/div/form/div[2]/div[2]