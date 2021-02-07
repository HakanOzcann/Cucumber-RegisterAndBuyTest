package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/src/main/resources/geckodriver");
             driver = new ChromeDriver();
        }
    return driver;
    }
public static void closeDriver() {
    if (driver != null) {
        driver = null;
        }
}
}




