package day3;

import java.util.ArrayList;
import java.util.Arrays;

public class Loops {
    public static void main(String[] args) {
        doEx10("Mirror");
//        checkBoard();
//        squareBoard();
//        HarmonicSum();
//        doEx6();
//        doEx5();
//        doEx4();
//        doEx3();
//        doEx2();
//        doEx1("11,3,5,8,9");

    }

    private static void doEx10(String a) {
        //Way 1
        String n;
        int count = 0;
        int viTri = 0;
//        for (int i = 0; i < a.length(); i++) {
//            n = a.substring(i, i + 1);
//            if (n.equals("r")) {
//                count++;
//                System.out.println("Vi tri cua r là " + i);
//            }
//        }
//        if (count == 0)
//            System.out.println("Khong tim thay r");

        //Way 2
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < a.length(); i++) {
            n = a.substring(i, i+1);
            list.add(n);
        }
        //Way 2
//        for (int viTri = 0; viTri < list.size(); viTri++) {
//            if (list.get(viTri).equals("r")) {
//                count++;
//                System.out.println("Vi tri cua r la " + viTri);
//            }
//        }

//        //Way 3
//        for (String m : list) {
//            list.get(viTri).equals("r");
//            viTri++;
//        }
//        if (count == 0) {
//            System.out.println("Khong ton tai r");
//        }

        //Way4
        while (viTri < list.size()) {
            if (list.get(viTri).equals("r")) {
                count++;
                System.out.println("Vi tri cua r la " + viTri);
            }
            viTri++;
        }
        if (count != 0) {
            System.out.println("Khong ton tai r");
        }
    }

    private static void checkBoard() {
        for (int i = 0 ; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i % 2 == 0) {
                    System.out.print("# ");
                }
                else {
                    System.out.print(" #");
                }
            }
            System.out.println();
        }
    }

    private static void squareBoard() {
         for (int i = 0; i < 5; i++) {
             for (int j = 0; j < 5; j++) {
                 System.out.print("# ");
             }
             System.out.println();
         }
    }

    private static void HarmonicSum() {
        double sum = 0;
        int sumFromLeft = 0;
        int sumFromRight = 0;

        for (int i = 1; i <= 50000; i++) {
            sumFromLeft += 1/i;
        }

        for (int j = 50000; j <= 50000 && j != 0; j--) {
            sumFromRight += 1/j;
        }

        sum = (double) sumFromLeft - (double) sumFromRight;
        System.out.println(sum);
    }

    private static void doEx6() {
        int[] a = new int[100];
        int sum = 0;
        int count = 0;
        double avg = 0;

        for(int i = 1; i <= a.length; i++) {
            sum += i * i;
            count++;
            avg = (double) sum / (double) count;
        }
        System.out.println("The average is " + avg);
    }

    private static void doEx5() {
        int[] a = new int[100];
        int sum = 0;
        int count = 0;
        double avg = 0;

        for(int i = 1; i <= a.length; i++) {
            if(i % 7 == 0) {
                sum += i;
                count++;
                avg = (double) sum / (double) count;
            }
        }
        System.out.println("The average of numbers divisible by 7 is " + avg);
    }

    private static void doEx4() {
        int[] a = new int[100];
        int sum = 0;
        double avg = 0;
        int count = 0;

        for(int n = 0; n <= a.length; n++) {
            if(n % 2 != 0) {
                sum += n;
                count++;
                avg = (double) sum / (double) count;
            }
        }
        System.out.println("The average of odd number is " + avg);
    }

    private static void doEx3() {
        int start = 111;
        int end = 8899;
        int[] a = new int[end - start + 1];

        int sum = 0;
        int count = 0;
        double avg = 0;

        int sum1 = 0;
        int count1 = 0;
        double avg1 = 0;

        //Way1
        for(int i = 111; i <= 8899; i++) {
            sum += i;
            count ++;
            avg = (double) sum/ (double) count;
        }

        //Way2
        for(int j = 0; j <= a.length; j++) {
            sum1 += j + 111;
            count1 ++;
            avg1 = (double) sum1 / (double) count1;
        }
        System.out.println("The sum is " + sum);
        System.out.println("The count is " + count);
        System.out.println("The average is " + avg);

        System.out.println("The sum1 is " + sum1);
        System.out.println("The count1 is " + count1);
        System.out.println("The average1 is " + avg1);
    }

    //Ex2
    private static void doEx2() {
        int[] a = new int[100];
        int sum = 0;
        double avg = 0;

        for (int i = 0; i <= a.length; i++) {
            sum += i;
            avg = (double) sum/ (double) a.length;
        }
        System.out.println("The sum is " + sum);
        System.out.println("The average is " + avg);
    }

    //Ex1
    public static void doEx1(String a) {
        // Split the string by commas
        String[] stringArray = a.split(",");

        for (String str : stringArray) {
            System.out.print(str + " ");
        }
    }
}
