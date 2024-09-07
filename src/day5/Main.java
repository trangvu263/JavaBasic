package day5;

public class Main {
    public static void main(String[] args) {
        GVToan giaoVienToan1 = new GVToan();
        GVToan giaoVienToan2 = new GVToan();
        GVToan giaoVienToan3 = new GVToan();

        giaoVienToan1.maGiaoVien = "001";
        giaoVienToan1.hoTen = "Nguyen Van Son";
        giaoVienToan1.gioiTinh = "Nam";
        giaoVienToan1.monDay = "Toan Cao Cap";

        giaoVienToan2.maGiaoVien = "002";
        giaoVienToan2.hoTen = "Nguyen Van Son2";
        giaoVienToan2.gioiTinh = "Nam";
        giaoVienToan2.monDay = "Toan Co Ban";

        giaoVienToan3.maGiaoVien = "003";
        giaoVienToan3.hoTen = "Nguyen Van Son";
        giaoVienToan3.gioiTinh = "Nam";
        giaoVienToan3.monDay = "Toan Co Ban";

        System.out.println("Giao vien toan 1: " + giaoVienToan1.hoTen);
        System.out.println("Giao vien toan 1: " + giaoVienToan1.maGiaoVien);

    }
}
