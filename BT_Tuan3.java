package com.mycompany.bttuan3;

import java.util.Scanner;

public class BT_Tuan3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ma sach: ");
        String ma = sc.nextLine();

        System.out.print("Ten sach: ");
        String ten = sc.nextLine();

        System.out.print("Tac gia: ");
        String tacGia = sc.nextLine();

        System.out.print("Nam xuat ban: ");
        int nam = Integer.parseInt(sc.nextLine());

        System.out.print("Don gia: ");
        double donGia = Double.parseDouble(sc.nextLine());

        System.out.print("So luong: ");
        int soLuong = Integer.parseInt(sc.nextLine());

        double thanhTien = donGia * soLuong;
        double phiVanChuyen = thanhTien * 0.05;
        double tongTien = thanhTien + phiVanChuyen;

        System.out.println("Thanh tien: " + thanhTien);
        System.out.println("Phi van chuyen: " + phiVanChuyen);
        System.out.println("Tong tien nhap: " + tongTien);
        sc.close();
    }
}