package day3;

public class Method {
    public static void main(String[] args) {
        int[] arr = {1,8,88};
        doEx2(arr);
//        doEx1(18);
    }

//    private static void magicSum() {
//    }


    //Ex2
    private static boolean contain8;
    private static boolean isEight(int number) {
        String str = String.valueOf(number);  // Convert the number to a string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '8') {
                return true;
            }
        }
        return false;
    }

    private static void doEx2(int[] number) {
        int sum = 0;
        for(int i = 0; i < number.length; i++){
               if(isEight(number[i])) {
                   sum = sum + number[i];
                    }
                }
        System.out.println("The magic sum is:" + sum);
            }

//    Ex1
    private static boolean isOdd(int number) {
        return number % 2 != 0;
    }

    private static void doEx1(int number) {
        if (isOdd(number)) {
            System.out.println(number + " is odd");
        }
        else {
            System.out.println(number + " is even");
        }
    }
}
