package huongdoituong.Bai13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Time> times = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int hours = sc.nextInt();
            int minutes = sc.nextInt();
            int seconds = sc.nextInt();
            times.add(new Time(hours, minutes, seconds));
        }

        Collections.sort(times);

        for (Time time : times) {
            System.out.println(time);
        }
    }
}
