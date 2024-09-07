package day2;

import java.text.DecimalFormat;

public class OperarorsHomework {

    public static void main(String[] args) {
        doEx1();
        doEx2(2500, 5, 56, 23);
        int[] numbers = {25, 5};
        doEx3(numbers);
        doEx4(123456);
    }

        //Ex1: tiny
     private static void doEx1() {
            int x = 20;
            String sup = (x < 15) ? "small" : (x < 22) ? "tiny" : "huge";
            System.out.println("Ex1 = " + sup);
        }

     //Ex2
    private static void doEx2(double meter, double hrs, double mins, double secs) {
        double speedInMeterSecond;
        double speedInKmHr;
        double speedInMileHr;
        double expectedSpeedInMeterSecond;
        double expectedSpeedInKmHr;
        double expectedSpeedInMileHr;

        speedInMeterSecond = meter/(hrs*3600 + mins*60 +secs);
        speedInKmHr = (meter/1000)/(hrs + mins/60 + secs/3600);
        speedInMileHr = (meter/1609)/(hrs + mins/60 + secs/3600);

        DecimalFormat df = new DecimalFormat("#.########");
        String a = df.format(speedInMeterSecond);
        String b = df.format(speedInKmHr);
        String c = df.format(speedInMileHr);

        expectedSpeedInMeterSecond = Double.valueOf(a);
        expectedSpeedInKmHr = Double.valueOf(b);
        expectedSpeedInMileHr = Double.valueOf(c);

        System.out.println("Your speed in meters/second is " + expectedSpeedInMeterSecond +
                "\n" +
                "Your speed in km/h is " + expectedSpeedInKmHr +
                "\n" +
                "Your speed in miles/h is " + expectedSpeedInMileHr);
    }

    //Ex3
    private static void doEx3(int[] numbers) {
        int numberLength = numbers.length;

        double sum = 0;
        double avr = 0;
        int product = 1;
        for (int i = 0; i < numberLength; i++) {
            sum += numbers[i]; //Calculate sum
            avr = sum/numberLength; //Calculate average
            product *= numbers[i]; //Calculate product
        }

        int difference = numbers[0];
        for (int p = 1; p < numberLength; p++) {
            difference -= numbers[p]; //Calculate difference
            }

        int max = numbers[0];
        for (int t = 1; t < numberLength; t++) {
            if (numbers[t] >= max) {
                max = numbers[t]; //Find max number
            }
        }

        int min = numbers[0];
        for (int v = 1; v < numberLength; v++) {
            if (numbers[v] < min) {
                min = numbers[v]; // Find min number
            }
        }

        System.out.println("Sum = " + sum +
                "\n" +
                "Average = " + avr +
                "\n" +
                "Product = " + product +
                "\n" +
                "Difference = " + difference +
                "\n" +
                "Max = " + max +
                "\n" +
                "Min = " + min);
    }

    //Ex4
    private static void doEx4(int number) {
        String a = Integer.toString(number);
        int numberLength = a.length();
        int i;
        String b;

        for(i = 0; i < numberLength; i++) {
            b = a.substring(i, i+1);
            System.out.print(b + " ");
        }
    }
}


