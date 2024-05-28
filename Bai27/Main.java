package huongdoituong.Bai27;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // Đọc bỏ dòng trống

        ArrayList<Lecturer> lecturers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String hoTen = sc.nextLine();
            String boMon = sc.nextLine();
            lecturers.add(new Lecturer(String.format("GV%02d", i + 1), hoTen, boMon));
        }

        Collections.sort(lecturers, new Comparator<Lecturer>() {
            @Override
            public int compare(Lecturer l1, Lecturer l2) {
                // Sắp xếp theo tên giảng viên (từ cuối cùng trong họ tên)
                String tenL1 = l1.getHoTen().split("\\s+")[l1.getHoTen().split("\\s+").length - 1];
                String tenL2 = l2.getHoTen().split("\\s+")[l2.getHoTen().split("\\s+").length - 1];
                int compareTen = tenL1.compareTo(tenL2);
                if (compareTen != 0) {
                    return compareTen;
                } else {
                    // Nếu cùng tên thì sắp xếp theo mã giảng viên
                    return l1.getMaGV().compareTo(l2.getMaGV());
                }
            }
        });

        for (Lecturer lecturer : lecturers) {
            System.out.println(lecturer);
        }
    }
}
