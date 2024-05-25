package huongdoituong.Bai18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine(); // Consume the remaining newline

        List<NhanVien> danhSachNhanVien = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            NhanVien nv = new NhanVien();
            nv.nhap(sc);
            danhSachNhanVien.add(nv);
        }

        for (NhanVien nv : danhSachNhanVien) {
            System.out.println(nv);
        }
    }
}
