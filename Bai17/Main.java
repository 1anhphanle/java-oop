package huongdoituong.Bai17;

import java.util.*;

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

        Collections.sort(sinhVienList, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                if (Double.compare(sv2.getGpa(), sv1.getGpa()) == 0) {
                    return sv1.getMaSV().compareTo(sv2.getMaSV());
                }
                return Double.compare(sv2.getGpa(), sv1.getGpa());
            }
        });

        for (SinhVien sv : sinhVienList) {
            System.out.println(sv);
        }
    }
}