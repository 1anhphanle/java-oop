package huongdoituong.Bai24;

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
            String lopCanTim = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP " + lopCanTim + " :");
            for (Student student : students) {
                if (student.getLop().equals(lopCanTim)) {
                    System.out.println(student);
                }
            }
        }
    }
}
