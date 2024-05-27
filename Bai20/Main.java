package huongdoituong.Bai20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soLuongGameThu = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng xuống dòng mới

        List<GameThu> danhSachGameThu = new ArrayList<>();

        for (int i = 0; i < soLuongGameThu; i++) {
            String username = scanner.nextLine();
            String password = scanner.nextLine();
            String ten = scanner.nextLine();
            String[] gioVaoStr = scanner.nextLine().split(":");
            int gioVao = Integer.parseInt(gioVaoStr[0]);
            int phutVao = Integer.parseInt(gioVaoStr[1]);
            String[] gioRaStr = scanner.nextLine().split(":");
            int gioRa = Integer.parseInt(gioRaStr[0]);
            int phutRa = Integer.parseInt(gioRaStr[1]);
            danhSachGameThu.add(new GameThu(username, password, ten, gioVao, phutVao, gioRa, phutRa));
        }

        // Sắp xếp danh sách game thủ theo thời gian giảm dần
        danhSachGameThu.sort((gt1, gt2) -> {
            int thoiGian1 = gt1.tinhThoiGian();
            int thoiGian2 = gt2.tinhThoiGian();
            if (thoiGian1 != thoiGian2) {
                return thoiGian2 - thoiGian1;
            } else {
                return gt1.username.compareTo(gt2.username);
            }
        });

        // In ra danh sách game thủ đã sắp xếp
        for (GameThu gameThu : danhSachGameThu) {
            System.out.println(gameThu.username + " " + gameThu.password + " " + gameThu.ten + " " + gameThu);
        }
    }
}