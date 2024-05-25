package huongdoituong.Bai20;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine(); // Consume the remaining newline

        List<GameThu> danhSachGameThu = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String username = sc.nextLine();
            String password = sc.nextLine();
            String ten = sc.nextLine();
            String[] gioVaoParts = sc.nextLine().split(":");
            int gioVao = Integer.parseInt(gioVaoParts[0]);
            int phutVao = Integer.parseInt(gioVaoParts[1]);
            String[] gioRaParts = sc.nextLine().split(":");
            int gioRa = Integer.parseInt(gioRaParts[0]);
            int phutRa = Integer.parseInt(gioRaParts[1]);

            danhSachGameThu.add(new GameThu(username, password, ten, gioVao, phutVao, gioRa, phutRa));
        }

        // Sắp xếp danh sách game thủ theo thời gian chơi giảm dần
        danhSachGameThu.sort(Comparator.comparingInt(GameThu::tinhThoiGianChoi).reversed()
                .thenComparing(GameThu::getUsername));

        // In ra danh sách game thủ đã được sắp xếp
        for (GameThu gameThu : danhSachGameThu) {
            System.out.println(gameThu);
        }
    }
}