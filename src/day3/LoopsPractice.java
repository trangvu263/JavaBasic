package day3;

import java.util.ArrayList;

public class LoopsPractice {
    public static void main(String[] args) {
        inVitri();
//        inViTriDungWhile();
//        inViTriDungDoWhile();
    }

    private static void inViTriDungDoWhile() {
        ArrayList<String> l = new ArrayList<String>();
        l.add("Lan");
        l.add("Huệ");
        l.add("Hương");
        l.add("Nhung");
        l.add("Hương");
        int viTri = 0;
        do {
            if (l.get(viTri).contains("Hương")) {
                System.out.println("Tim thay phan tu o vi tri " +  viTri);
            }
            viTri++;
        } while (viTri < l.size());
    }

    private static void inVitri() {
        ArrayList<String> l = new ArrayList<String>();
        l.add("Lan");
        l.add("Huệ");
        l.add("Hương");
        l.add("Nhung");
        l.add("Hương");
        int viTri = 0;
        for (String x : l) {
            if(x.contains("Hương")) {
                System.out.println("Tim thay phan tu o vi tri " +  viTri);
//                break;
            }
            viTri++;
        }
    }

    //Ex2 2. For each/ArrayListBài 2: danh sách l = {Lan, Huệ, Hương, NHung}
    //Tìm tên chứa chữ "Hương", nếu thấy, in ra vị trí phần tử.

    private static void inViTriDungWhile() {
        ArrayList<String> l = new ArrayList<String>();
        l.add("Lan");
        l.add("Huệ");
        l.add("Hương");
        l.add("Nhung");
        l.add("Hương");
        int viTri = 0;
        while (viTri < l.size()) {
            if (l.get(viTri).contains("Hương")) {
                System.out.println("Tim thay phan tu o vi tri " +  viTri);
            }
            viTri++;
        }
    }

}
