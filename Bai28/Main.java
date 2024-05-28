package huongdoituong.Bai28;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // Đọc bỏ dòng trống

        Account[] accountList = new Account[n];

        for (int i = 0; i < n; i++) {
            String id = sc.nextLine();
            String customerId = sc.nextLine();
            String username = sc.nextLine();
            String password = sc.nextLine();
            accountList[i] = new Account(id, customerId, username, password);
        }

        int q = sc.nextInt();
        sc.nextLine(); // Đọc bỏ dòng trống

        for (int i = 0; i < q; i++) {
            String username = sc.nextLine();
            String password = sc.nextLine();

            boolean check = false;
            for (int j = 0; j < n; j++) {
                if (accountList[j].checkLogin(username, password)) {
                    check = true;
                    break;
                }
            }

            if (check) {
                System.out.println("Login Successful");
            } else {
                System.out.println("Login Failed");
            }
        }
    }
}