package huongdoituong.Bai17;

import java.util.Arrays;
import java.util.Scanner;

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

        // Sắp xếp danh sách sinh viên theo GPA giảm dần và theo mã sinh viên
        Arrays.sort(danhSachSinhVien);

        // In ra danh sách sinh viên đã sắp xếp
        for (SinhVien sinhVien : danhSachSinhVien) {
            System.out.println(sinhVien);
        }

        sc.close();
    }
}
