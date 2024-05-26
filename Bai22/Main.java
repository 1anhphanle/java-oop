package huongdoituong.Bai22;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine(); // Consume the remaining newline

        List<SinhVien> danhSachSinhVien = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String maSV = sc.nextLine();
            String hoTen = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();

            danhSachSinhVien.add(new SinhVien(maSV, hoTen, lop, email));
        }

        // Sắp xếp danh sách sinh viên theo lớp tăng dần, nếu cùng lớp thì sắp xếp theo mã sinh viên tăng dần
        danhSachSinhVien.sort(Comparator.comparing(SinhVien::getLop)
                .thenComparing(SinhVien::getMaSV));

        // In ra danh sách sinh viên đã được sắp xếp
        for (SinhVien sinhVien : danhSachSinhVien) {
            System.out.println(sinhVien);
        }
    }
}

