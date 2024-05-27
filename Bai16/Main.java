package huongdoituong.Bai16;

import java.util.Scanner;
//anhphanle

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        SinhVien[] danhSachSinhVien = new SinhVien[N];

        for (int i = 0; i < N; i++) {
            String hoTen = sc.nextLine();
            String lop = sc.nextLine();
            String ngaySinh = sc.nextLine();
            float gpa = Float.parseFloat(sc.nextLine());

            SinhVien sv = new SinhVien();
            sv.nhapThongTin(hoTen, lop, ngaySinh, gpa);
            danhSachSinhVien[i] = sv;
        }

        // In ra danh sách sinh viên theo thứ tự nhập vào
        for (SinhVien sinhVien : danhSachSinhVien) {
            System.out.println(sinhVien);
        }

        sc.close();
    }
}
