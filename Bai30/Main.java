package huongdoituong.Bai30;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int power = Integer.parseInt(sc.nextLine().substring(8));
        int blood = Integer.parseInt(sc.nextLine().substring(8));
        boolean alive = sc.nextLine().equals("ALIVE");

        NhanVat nv = new NhanVat(power, blood, alive);

        int suKien = sc.nextInt();
        sc.nextLine(); // Đọc bỏ dòng trống

        for (int i = 0; i < suKien; i++) {
            String s = sc.nextLine();
            if (s.equals("pea")) {
                nv.pea();
            } else if (s.equals("mushroom")) {
                nv.mushroom();
            } else if (s.charAt(0) == 's') { // Soldier
                int power1 = Integer.parseInt(s.substring(8));
                nv.soldier(power1);
            } else { // Witch
                int power1 = Integer.parseInt(s.substring(6));
                nv.witch(power1);
            }
            System.out.print(nv);
        }
    }
}