package huongdoituong.Bai26;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // Đọc bỏ dòng trống

        ArrayList<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String maSV = sc.nextLine();
            String hoTen = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            students.add(new Student(maSV, hoTen, lop, email));
        }

        int q = sc.nextInt();
        sc.nextLine(); // Đọc bỏ dòng trống

        for (int i = 0; i < q; i++) {
            String nganhCanTim = sc.nextLine();
            String tenNganh = "";
            switch (nganhCanTim) {
                case "CNTT":
                    tenNganh = "CONG NGHE THONG TIN";
                    break;
                case "DTVT":
                    tenNganh = "DIEN TU VA VIEN THONG";
                    break;
                // Thêm các trường hợp ngành học khác tương tự
            }
            System.out.println("DANH SACH SINH VIEN NGANH " + tenNganh + " :");
            for (Student student : students) {
                if (student.getNganh().equals(nganhCanTim)) {
                    System.out.println(student);
                }
            }
        }
    }
}