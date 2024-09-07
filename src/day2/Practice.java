package day2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
        doEx2();
   }

    public void test() {
        int x = 1;
        System.out.println("x++ = " + x++); //x++ tang nhung chua dc gan lai vao x

        int y =1;
        System.out.println("y++ = " + ++y); //++y tang roi duoc gan lai vao y
    }

    private static void doEx2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input distance in meters: ");
        int distanceInMeters = in.nextInt();
        System.out.println("Input hour: ");
        int hour = in.nextInt();
        System.out.println("Input minutes: ");
        int minutes = in.nextInt();
        System.out.println("Input seconds: ");
        int seconds = in.nextInt();

        int timeInSecond = hour*3600 + minutes*60 + seconds;
        double meterOutofSeconds = (double) distanceInMeters/timeInSecond;
        DecimalFormat df = new DecimalFormat("#.########");
        String expectedMeterOutofSeconds = df.format(meterOutofSeconds);
        double d = Double.valueOf(expectedMeterOutofSeconds);

        System.out.println("Your speed in meters/second is "  + d);

    }
}

