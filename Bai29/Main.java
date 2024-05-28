package huongdoituong.Bai29;

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
            String soTaiKhoan = sc.nextLine();
            String PIN = sc.nextLine();
            int soDu = sc.nextInt();
            accountList[i] = new Account(id, customerId, soTaiKhoan, PIN, soDu);
            sc.nextLine(); // Đọc bỏ dòng trống
        }

        int q = sc.nextInt();
        sc.nextLine(); // Đọc bỏ dòng trống

        for (int i = 0; i < q; i++) {
            String tran = sc.nextLine();

            if (tran.equals("withdraw")) {
                String taiKhoan = sc.next();
                int tien = sc.nextInt();
                int pos = Account.findPos(accountList, taiKhoan);
                if (pos != -1) {
                    accountList[pos].withdraw(tien);
                }
            } else if (tran.equals("deposit")) {
                String taiKhoan = sc.next();
                int tien = sc.nextInt();
                int pos = Account.findPos(accountList, taiKhoan);
                if (pos != -1) {
                    accountList[pos].deposit(tien);
                }
            } else { // tran.equals("transfer")
                String X = sc.next();
                String Y = sc.next();
                int tien = sc.nextInt();
                int pos1 = Account.findPos(accountList, X);
                int pos2 = Account.findPos(accountList, Y);
                if (pos1 != -1 && pos2 != -1 && accountList[pos1].getSoDu() - 50000 >= tien) {
                    accountList[pos1].withdraw(tien);
                    accountList[pos2].deposit(tien);
                }
            }
        }

        for (Account x : accountList) {
            System.out.println(x);
        }
    }
}
