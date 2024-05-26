package huongdoituong.Bai21;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine(); // Consume the remaining newline

        List<HocSinh> danhSachHocSinh = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String hoTen = sc.nextLine();
            double[] diemMonHoc = new double[10];
            String[] diemStr = sc.nextLine().split(" ");
            for (int j = 0; j < diemMonHoc.length; j++) {
                diemMonHoc[j] = Double.parseDouble(diemStr[j]);
            }

            danhSachHocSinh.add(new HocSinh(hoTen, diemMonHoc));
        }

        // Sắp xếp danh sách học sinh theo điểm trung bình giảm dần
        danhSachHocSinh.sort(Comparator.comparingDouble(HocSinh::tinhDiemTrungBinh).reversed()
                .thenComparing(HocSinh::getMaHS));

        // In ra danh sách học sinh đã được sắp xếp
        for (HocSinh hocSinh : danhSachHocSinh) {
            System.out.println(hocSinh);
        }
    }
}