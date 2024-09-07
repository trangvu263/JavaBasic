package day5_Kenh14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
    public WebDriver driver;
    public void openWeb() {
        //open browser
        System.setProperty("webdriver.chrome.driver", "/Users/thinhnv/Documents/AutomationProject202408/01Tools/chromedriver");
        driver = new ChromeDriver();

        //open page: http://shop.demoqa.com
        driver.get("https://kenh14.vn/");
    }
}
