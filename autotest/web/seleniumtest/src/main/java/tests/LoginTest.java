package tests;

import org.testng.annotations.Test;
import pages.HomePage;

public class LoginTest extends BaseTest {
    @Test
    public void invalidLoginTest_InvalidUserNameInvalidPassword() {
        HomePage homePage = new HomePage(driver);
        homePage.goToN11()
                .goToLoginPage()
                .loginToZhiHu("email@qq.com", "password")
                .verifyLoginPassword("账号或密码错误");

    }
    @Test
    public void invalidLoginTest_EmptyUsernameAndPassword(){
        HomePage homePage = new HomePage(driver);
        homePage.goToN11()
                .goToLoginPage()
                .loginToZhiHu("","")
                .verifyLoginUserName("请输入手机号或邮箱")
                .verifyLoginPassword("请输入密码");
    }
}