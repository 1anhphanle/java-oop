package huongdoituong.Bai23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        // Nhập danh sách sinh viên (mỗi sinh viên 4 dòng)
        while (sc.hasNextLine()) {
            String maSV = sc.nextLine();
            String hoTen = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            students.add(new Student(maSV, hoTen, lop, email));
        }

        // Sắp xếp danh sách sinh viên theo mã SV tăng dần
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getMaSV().compareTo(s2.getMaSV());
            }
        });

        // In ra danh sách sinh viên đã sắp xếp
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
