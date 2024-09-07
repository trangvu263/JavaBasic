package day1;

public class DataTypesAndVariables {
    public static void main(String[] args) {
        doEx1();
        doEx2();
        doEx3();
        doEx4();
        doEx6();
        doEx7();
    }

    //Ex1
    private static void doEx1() {
        System.out.println("Hello Word");
    }

    //Ex2
    private static void doEx2() {
        System.out.println("++++++\n" +
                "\n" +
                "@@@@@@\n" +
                "\n" +
                "******\n" +
                "\n" +
                "######\n");
    }

        //Ex3
    private static void doEx3() {
        int a;
        float b;
        float c;
            a = 10;
            b = 10.3F;
            c = 3.14785F;
            System.out.println("a = " + a +
                    "\n" +
                    "b = " + b +
                    "\n" +
                    "c = " + c);
        }

        //Ex4
        private static void doEx4() {
            boolean boo = true;
            boo = false;
            System.out.println("boolean is " + boo);
        }

        //Ex5
        public static void main1(String[] args) {
            System.out.println("ToolsQA");
        }

    public static void main2(String[] args) {
        System.out.println("ToolsQA");
    }

    public static void main3(String[] args) {
        int value = 18;
        System.out.println("The value of the integer variable is : " + value);
    }

    public static void main4(String[] args) {
        int valueInt  = 18;
        double valueDob = 10.10;
        boolean valueBool = true;
    }

    //Ex6
        private static double cDegree;
        private static double fDegree;
        private static void doEx6() {
            fDegree = 212;
            cDegree = (fDegree-32)/1.8;
            System.out.println(fDegree + " F Degree is equal to " + cDegree + "C Degree");
        }

    //Ex7
        private static double inch;
        private static double meter;
        private static void doEx7() {
            inch = 1000;
            meter = inch*0.0254;
            System.out.println("1000 inch is " + meter + " meters");
        }


}

