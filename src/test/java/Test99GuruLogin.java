import com.codecool.page.Guru99HomePage;

import com.codecool.page.Guru99Login;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;

import org.testng.annotations.Test;

public class Test99GuruLogin {

    //String driverPath = "/home/bghbenja/Project/PythonWS/TEST/chromedriver_linux64/chromedriver";
    String driverPath = "/home/bghbenja/Project/PythonWS/TEST/geckodriver-v0.32.0-linux64/geckodriver";

    WebDriver driver;

    Guru99Login objLogin;

    Guru99HomePage objHomePage;

    @BeforeTest

    public void setup() {

        System.setProperty("webdriver.gecko.driver", driverPath);

        //driver = new ChromeDriver();
        driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://demo.guru99.com/V4/");

    }

    @Test(priority = 0)

    public void test_Home_Page_Appear_Correct() {

        objLogin = new Guru99Login(driver);

        String loginPageTitle = objLogin.getLoginTitle();

        Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));

        objLogin.loginToGuru99("mgr123", "mgr123");

        objHomePage = new Guru99HomePage(driver);

        Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mrg123"));
    }
}
