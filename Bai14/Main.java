package huongdoituong.Bai14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
//anhphanle

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        sc.nextLine();

        List<MatHang> matHangs = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            String tenMatHang = sc.nextLine();
            String donViTinh = sc.nextLine();
            int giaMua = Integer.parseInt(sc.nextLine());
            int giaBan = Integer.parseInt(sc.nextLine());
            matHangs.add(new MatHang(tenMatHang, donViTinh, giaMua, giaBan));
        }

        Collections.sort(matHangs);

        for (MatHang matHang : matHangs) {
            System.out.println(matHang);
        }
    }
}
