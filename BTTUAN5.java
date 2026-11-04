import java.util.ArrayList;
import java.util.Scanner;

public class BTTUAN5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Bai 1: Mang so luong 5 cuon sach
        int[] soLuong = new int[5];
        int tong = 0, max = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Nhap so luong sach thu " + (i + 1) + ": ");
            soLuong[i] = sc.nextInt();
            tong += soLuong[i];

            if (i == 0 || soLuong[i] > max) {
                max = soLuong[i];
            }
        }

        System.out.println("\nDanh sach so luong sach:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Sach " + (i + 1) + ": " + soLuong[i]);
        }

        System.out.println("Tong so luong: " + tong);
        System.out.println("So luong lon nhat: " + max);

        // Bai 2, 3, 4: Quan ly sach bang ArrayList
        ArrayList<String> maSach = new ArrayList<>();
        ArrayList<String> tenSach = new ArrayList<>();
        ArrayList<Integer> soLuongSach = new ArrayList<>();
        ArrayList<Double> donGia = new ArrayList<>();

        int chon;

        do {
            System.out.println("\n===== MENU QUAN LY SACH =====");
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi sach");
            System.out.println("3. Tim sach");
            System.out.println("4. Xoa sach");
            System.out.println("5. Sua sach");
            System.out.println("6. Tinh tong so luong");
            System.out.println("7. Tinh tong gia tri");
            System.out.println("8. Thoat");
            System.out.print("Chon: ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1:
                    System.out.print("Nhap ma sach: ");
                    String ma = sc.nextLine();

                    System.out.print("Nhap ten sach: ");
                    String ten = sc.nextLine();

                    System.out.print("Nhap so luong: ");
                    int sl = sc.nextInt();

                    System.out.print("Nhap don gia: ");
                    double gia = sc.nextDouble();
                    sc.nextLine();

                    maSach.add(ma);
                    tenSach.add(ten);
                    soLuongSach.add(sl);
                    donGia.add(gia);

                    System.out.println("Them sach thanh cong!");
                    break;

                case 2:
                    if (maSach.isEmpty()) {
                        System.out.println("Danh sach rong!");
                    } else {
                        for (int i = 0; i < maSach.size(); i++) {
                            System.out.println("\nSach thu " + (i + 1));
                            System.out.println("Ma sach: " + maSach.get(i));
                            System.out.println("Ten sach: " + tenSach.get(i));
                            System.out.println("So luong: " + soLuongSach.get(i));
                            System.out.println("Don gia: " + donGia.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Nhap ma sach can tim: ");
                    ma = sc.nextLine();

                    int vt = maSach.indexOf(ma);

                    if (vt != -1) {
                        System.out.println("Ma sach: " + maSach.get(vt));
                        System.out.println("Ten sach: " + tenSach.get(vt));
                        System.out.println("So luong: " + soLuongSach.get(vt));
                        System.out.println("Don gia: " + donGia.get(vt));
                    } else {
                        System.out.println("Khong tim thay sach!");
                    }
                    break;

                case 4:
                    System.out.print("Nhap ma sach can xoa: ");
                    ma = sc.nextLine();

                    vt = maSach.indexOf(ma);

                    if (vt != -1) {
                        maSach.remove(vt);
                        tenSach.remove(vt);
                        soLuongSach.remove(vt);
                        donGia.remove(vt);
                        System.out.println("Xoa sach thanh cong!");
                    } else {
                        System.out.println("Khong tim thay sach!");
                    }
                    break;

                case 5:
                    System.out.print("Nhap ma sach can sua: ");
                    ma = sc.nextLine();

                    vt = maSach.indexOf(ma);

                    if (vt != -1) {
                        System.out.print("Nhap ten sach moi: ");
                        tenSach.set(vt, sc.nextLine());

                        System.out.print("Nhap so luong moi: ");
                        soLuongSach.set(vt, sc.nextInt());

                        System.out.print("Nhap don gia moi: ");
                        donGia.set(vt, sc.nextDouble());
                        sc.nextLine();

                        System.out.println("Sua sach thanh cong!");
                    } else {
                        System.out.println("Khong tim thay sach!");
                    }
                    break;

                case 6:
                    tong = 0;

                    for (int i = 0; i < soLuongSach.size(); i++) {
                        tong += soLuongSach.get(i);
                    }

                    System.out.println("Tong so luong sach: " + tong);
                    break;

                case 7:
                    double tongGiaTri = 0;

                    for (int i = 0; i < soLuongSach.size(); i++) {
                        tongGiaTri += soLuongSach.get(i) * donGia.get(i);
                    }

                    System.out.println("Tong gia tri sach: " + tongGiaTri);
                    break;

                case 8:
                    System.out.println("Thoat chuong trinh!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (chon != 8);

        sc.close();
    }
}
