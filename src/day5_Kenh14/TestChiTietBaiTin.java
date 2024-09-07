package day5_Kenh14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestChiTietBaiTin extends TestBase {
    public static void main(String[] args) {
        TestChiTietBaiTin testChiTiet = new TestChiTietBaiTin();
        testChiTiet.doTC1();
    }
    private void doTC1() {
        //open browser
        openWeb();

        String expectedResult = driver.findElement(By.xpath("//div[@class='klwfn-left fl']//h2/a")).getText();
        //click vao 1 tin
        driver.findElement(By.xpath("//div[@class='klwfn-left fl']//h2/a")).click();

        //verify title correct
        String actualResult = driver.getTitle();

        if(expectedResult.equalsIgnoreCase(actualResult)) {
            System.out.println("Test case passsed");
        } else {
            System.out.println("Test case failed");
        }
    }
//    private void doTC2() {
//
//        String expectedResult = driver.findElement(By.xpath("//div[@class='klwfn-left fl']//h2/a")).getText();
//        //click vao 1 tin
//        driver.findElement(By.xpath("//div[@class='klwfn-left fl']//h2/a")).click();
//
//        //click Home icon
//        driver.findElement(By.xpath("//li/a[@title='Trang chủ']")).click();
//        String expectedResult = ""
//    }

}

//