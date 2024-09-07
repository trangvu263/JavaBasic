package day2;

import org.openqa.selenium.By;

public class DecisionMaking {

    public static void main(String[] args) {
        doEx1Way1(565);
        doEx1Way2(565);
        doEx2(3456789);
        doEx4(1399);
        doEx5(22);
        System.out.println(doEx7("id","a1234"));
    }

    public static void doEx1Way1(int n) {
        ;
        int sum = 0;
        if (n >= 0 && n < 1000) {
            if (n >= 0 && n < 10) {
                sum = n;
            } else if (n >= 10 && n < 100) {
                sum = (n / 10) + n % 10;
            } else {
                sum = (n / 100) + ((n % 100) / 10) + (n % 10);
            }
            System.out.println("The sum of all digits in " + n + " is " + sum);
        }
    }

    public static void doEx1Way2(int n) {
        int sum = 0;
        String convertedNum = Integer.toString(n);
        for(int i = 0; i < convertedNum.length(); i++) {
            char number = convertedNum.charAt(i); //get each char value
            int num = Character.getNumericValue(number); //convert char value to int
            sum = sum + num; //sum of sum =0 with each int num
        }
        System.out.println("The sum of all digits in " + n + " is " + sum);
    }

    //Ex2
    public static void doEx2(int min) {
        int year = 0;
        int hour = 0;
        double tempDay = 0;
        String day = "";

        if (min > 0) {
            year = min / (60 * 24 * 365);
            hour = (min - (year * 60 * 24 * 365))/60;
            tempDay = (double) hour/24;
            if (tempDay >= 1){
                day = String.valueOf((int) tempDay);
            } else {
                day = String.format("%.4f", (double) hour/24);
            }
        } else {
            System.out.println("Invalid input");
            return;
        }
        System.out.println(min + " minutes are approximately " + (int) year + " year(s) " + " and " + day + " day(s) ");
    }

    //Ex4
    private static void doEx4(int n) {
        if(n % 2 == 0 && n != 0) {
            System.out.println("n la so chan");
        } else if(n % 2 != 0 && n != 0) {
            System.out.println("n la so le");
        } else {
            System.out.println("n = 0");
        }
    }

    //Ex5
    private static void doEx5(int n) {
        if(n % 2 != 0 || (n % 2 == 0 && n >= 6 && n <= 20)) {
            System.out.println("Weird");
        }
        else if((n >= 2 && n <= 5) || (n % 2 == 0 && n > 20)) {
            System.out.println("Not Weird");
        }
        else {
            System.out.println("N = 0");
        }
    }

    //Ex7
    private static By doEx7(String locatorType, String locatorValue) {
        By result = null;
        locatorType = locatorType.toLowerCase();
        switch (locatorType) {
            case ("id"):
                result = By.id(locatorValue);
//                WebElement e = driver.findElement(result);
//                System.out.println("By.id(\"" + locatorValue + "\")");// By.id("a1234")
                System.out.println(result); //By.id: a1234
                break;
            case ("name"):
                result = By.name(locatorValue);
                System.out.println(result);
                break;
            case ("linkText"):
                result = By.linkText(locatorValue);
                System.out.println(result);
                break;
            case ("cssSelector"):
                result = By.cssSelector(locatorValue);
                System.out.println(result);
                break;
            case ("partialLinkText"):
                result = By.partialLinkText(locatorValue);
                System.out.println(result);
                break;
            case ("tagName"):
                result = By.tagName(locatorValue);
                System.out.println(result);
                break;
            case ("xpath"):
                result = By.xpath(locatorValue);
                System.out.println(result);
                break;
            default:
                System.out.println("Invalid locator type");
        }
        return result;
    }
}
