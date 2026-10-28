
package com.mycompany.bttuan3;

import java.util.Scanner;

public class BT_Tuan3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap gia sach: ");
        double gia = sc.nextDouble();

        System.out.print("Nhap so luong: ");
        int soLuong = sc.nextInt();

        System.out.print("Nhap nam xuat ban: ");
        int nam = sc.nextInt();

        // Bai 1
        if (gia > 0 && soLuong >= 0 && nam > 0 && nam <= 2026)
            System.out.println("Sach hop le");
        else
            System.out.println("Sach khong hop le");

        // Bai 2
        if (gia <= 0)
            System.out.println("Gia khong hop le");
        else if (gia < 50000)
            System.out.println("Sach gia thap");
        else if (gia <= 100000)
            System.out.println("Sach gia trung binh");
        else if (gia <= 200000)
            System.out.println("Sach gia cao");
        else
            System.out.println("Sach gia dac biet");

        // Bai 3
        if (soLuong < 0)
            System.out.println("So luong khong hop le");
        else if (soLuong == 0)
            System.out.println("Het sach");
        else if (soLuong <= 5)
            System.out.println("Sap het");
        else if (soLuong <= 20)
            System.out.println("Con it");
        else
            System.out.println("Con nhieu");

        // Bai 4
        System.out.println("1. Sach giao khoa");
        System.out.println("2. Sach tham khao");
        System.out.println("3. Sach chuyen nganh");
        System.out.println("4. Sach khac");
        System.out.print("Chon loai sach: ");
        int loai = sc.nextInt();

        switch (loai) {
            case 1:
                System.out.println("Sach giao khoa");
                break;
            case 2:
                System.out.println("Sach tham khao");
                break;
            case 3:
                System.out.println("Sach chuyen nganh");
                break;
            case 4:
                System.out.println("Sach khac");
                break;
            default:
                System.out.println("Lua chon khong hop le");
        }

        sc.close();
    }
}
