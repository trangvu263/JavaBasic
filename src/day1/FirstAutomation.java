package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstAutomation {
    public static void main(String[] args) throws InterruptedException {
        //open browser
        System.setProperty("webdriver.chrome.driver", "/Users/thinhnv/Documents/AutomationProject202408/01Tools/chromedriver");
        WebDriver driver = new ChromeDriver();

        //open page: http://shop.demoqa.com
        driver.get("http://demoqa.com");

        //sleep 5s
        Thread.sleep(5000);

        // close browser
        driver.quit();

    }

}
