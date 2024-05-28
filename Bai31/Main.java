package huongdoituong.Bai31;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Team> teams = new ArrayList<>();

        // Nhập bảng xếp hạng hiện tại
        for (int i = 0; i < 20; i++) {
            sc.nextLine(); // Bỏ qua dòng "#1"
            String maDoiBong = sc.nextLine();
            String tenDoiBong = sc.nextLine();
            String[] stats = sc.nextLine().split("\\s+");
            int soTranDaDau = Integer.parseInt(stats[0]);
            int hieuSoBanThangThua = Integer.parseInt(stats[1]);
            int diemSo = Integer.parseInt(stats[2]);
            teams.add(new Team(maDoiBong, tenDoiBong, soTranDaDau, hieuSoBanThangThua, diemSo));
            sc.nextLine(); // Bỏ qua dòng "------------------"
        }

        // Nhập thông tin các trận đấu trong vòng hiện tại
        for (int i = 0; i < 10; i++) {
            String[] matchInfo = sc.nextLine().split("\\s+");
            String doiX = matchInfo[0];
            String doiT = matchInfo[3];
            int banThangX = Integer.parseInt(matchInfo[1]);
            int banThangT = Integer.parseInt(matchInfo[2]);

            for (Team team : teams) {
                if (team.getMaDoiBong().equals(doiX)) {
                    team.updateMatch(banThangX, banThangT);
                } else if (team.getMaDoiBong().equals(doiT)) {
                    team.updateMatch(banThangT, banThangX);
                }
            }
        }

        // Sắp xếp bảng xếp hạng theo điểm số, hiệu số bàn thắng thua, mã đội bóng
        Collections.sort(teams, new Comparator<Team>() {
            @Override
            public int compare(Team t1, Team t2) {
                if (t1.getDiemSo() != t2.getDiemSo()) {
                    return t2.getDiemSo() - t1.getDiemSo();
                } else if (t1.getHieuSoBanThangThua() != t2.getHieuSoBanThangThua()) {
                    return t2.getHieuSoBanThangThua() - t1.getHieuSoBanThangThua();
                } else {
                    return t1.getMaDoiBong().compareTo(t2.getMaDoiBong());
                }
            }
        });

        // In bảng xếp hạng sau khi cập nhật
        for (Team team : teams) {
            System.out.println(team);
            System.out.println("------------------");
        }
    }
}
