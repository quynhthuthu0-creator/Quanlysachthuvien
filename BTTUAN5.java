import java.util.Scanner;

public class BTTUAN5 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[] ma = new String[100];
            String[] ten = new String[100];
            int[] soLuong = new int[100];
            double[] donGia = new double[100];
            int n, chon;
            // Bài 1: Nhập n sách
            System.out.print("Nhap so sach: ");
            n = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < n; i++) {
                System.out.println("Nhap sach thu " + (i + 1));
                System.out.print("Ma sach: ");
                ma[i] = sc.nextLine();
                
                System.out.print("Ten sach: ");
                ten[i] = sc.nextLine();
                
                System.out.print("So luong: ");
                soLuong[i] = sc.nextInt();
                
                System.out.print("Don gia: ");
                donGia[i] = sc.nextDouble();
                sc.nextLine();
            }   // Bài 2: Tính tổng số lượng và tổng giá trị sách
            int tongSL = 0;
            double tongGT = 0;
            for (int i = 0; i < n; i++) {
                tongSL += soLuong[i];
                tongGT += soLuong[i] * donGia[i];
            }   System.out.println("\nTong so luong sach: " + tongSL);
            System.out.println("Tong gia tri sach: " + tongGT);
            // Bài 3 và 4: Menu và tìm sách theo mã
            do {
                System.out.println("\n===== MENU =====\nMoi ban chon 1 trong 3 chuc nang");
                System.out.println("1. Hien thi danh sach sach");
                System.out.println("2. Tim sach theo ma");
                System.out.println("3. Thoat");
                System.out.print("Chon: ");
                chon = sc.nextInt();
                sc.nextLine();
                
                switch (chon) {
                    case 1:
                        for (int i = 0; i < n; i++) {
                            System.out.println("\nSach thu " + (i + 1));
                            System.out.println("Ma sach: " + ma[i]);
                            System.out.println("Ten sach: " + ten[i]);
                            System.out.println("So luong: " + soLuong[i]);
                            System.out.println("Don gia: " + donGia[i]);
                        }
                        break;
                        
                    case 2:
                        System.out.print("Nhap ma sach can tim: ");
                        String tim = sc.nextLine();
                        
                        int i = 0;
                        while (i < n && !ma[i].equalsIgnoreCase(tim)) {
                            i++;
                        }
                        
                        if (i < n) {
                            System.out.println("\nMa sach: " + ma[i]);
                            System.out.println("Ten sach: " + ten[i]);
                            System.out.println("So luong: " + soLuong[i]);
                            System.out.println("Don gia: " + donGia[i]);
                        } else {
                            System.out.println("Khong tim thay sach!");
                        }
                        break;
                        
                    case 3:
                        System.out.println("Thoat chuong trinh!");
                        break;
                        
                    default:
                        System.out.println("Lua chon khong hop le!");
                }
            } while (chon != 3);
        }
    }
}