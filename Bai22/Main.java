package huongdoituong.Bai22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soLuongSinhVien = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng xuống dòng mới

        List<SinhVien> danhSachSinhVien = new ArrayList<>();

        for (int i = 0; i < soLuongSinhVien; i++) {
            String maSV = scanner.nextLine();
            String hoTen = scanner.nextLine();
            String lop = scanner.nextLine();
            String email = scanner.nextLine();
            danhSachSinhVien.add(new SinhVien(maSV, hoTen, lop, email));
        }

        // Sắp xếp danh sách sinh viên theo lớp tăng dần (thứ tự từ điển)
        danhSachSinhVien.sort(Comparator.comparing(sv -> sv.lop));

        // In ra danh sách sinh viên đã sắp xếp theo lớp
        for (SinhVien sv : danhSachSinhVien) {
            System.out.println(sv);
        }
    }
}
