package huongdoituong.Bai21;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soLuongHocSinh = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng xuống dòng mới

        List<Student> danhSachHocSinh = new ArrayList<>();

        for (int i = 0; i < soLuongHocSinh; i++) {
            String hoTen = scanner.nextLine();
            String[] diemMonHocStr = scanner.nextLine().split(" ");
            double[] diemMonHoc = new double[diemMonHocStr.length];
            for (int j = 0; j < diemMonHocStr.length; j++) {
                diemMonHoc[j] = Double.parseDouble(diemMonHocStr[j]);
            }
            danhSachHocSinh.add(new Student(hoTen, diemMonHoc));
        }

        // Sắp xếp danh sách học sinh theo điểm trung bình giảm dần
        danhSachHocSinh.sort((hs1, hs2) -> {
            double diemTrungBinh1 = hs1.tinhDiemTrungBinh();
            double diemTrungBinh2 = hs2.tinhDiemTrungBinh();
            if (diemTrungBinh1 != diemTrungBinh2) {
                return Double.compare(diemTrungBinh2, diemTrungBinh1);
            } else {
                return hs1.maHocSinh.compareTo(hs2.maHocSinh);
            }
        });

        // In ra danh sách học sinh đã sắp xếp
        for (Student hocSinh : danhSachHocSinh) {
            System.out.println(hocSinh);
        }
    }
}
