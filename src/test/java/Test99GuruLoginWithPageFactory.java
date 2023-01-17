import com.codecool.page.Guru99HomePage;
import com.codecool.pageFactory.Guru99Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class Test99GuruLoginWithPageFactory {

    String driverPath = "";

    WebDriver driver;

    Guru99Login objLogin;

    Guru99HomePage objHomePage;

    @BeforeTest

    public void setup(){

        System.setProperty("webdriver.gecko.driver", driverPath);

        driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://guru99.com/V4/");

    }
}
