package huongdoituong.Bai19;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        NhanVien[] danhSachNhanVien = new NhanVien[N];

        for (int i = 0; i < N; i++) {
            NhanVien nv = new NhanVien();
            nv.nhapThongTin(sc);
            danhSachNhanVien[i] = nv;
        }

        Arrays.sort(danhSachNhanVien);

        for (NhanVien nhanVien : danhSachNhanVien) {
            System.out.println(nhanVien);
        }

        sc.close();
    }
}
