package huongdoituong.Bai15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine(); // consume the remaining newline

        List<SinhVien> sinhVienList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String hoTen = sc.nextLine();
            String lop = sc.nextLine();
            String ngaySinh = sc.nextLine();
            double gpa = Double.parseDouble(sc.nextLine());
            sinhVienList.add(new SinhVien(hoTen, lop, ngaySinh, gpa));
        }

        for (SinhVien sv : sinhVienList) {
            System.out.println(sv);
        }
    }
}
