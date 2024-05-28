package huongdoituong.Bai32;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // Đọc bỏ dòng trống

        ArrayList<Book> books = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            sc.nextLine(); // Đọc bỏ dòng trống
            String tenSach = sc.nextLine();
            double gia = sc.nextDouble();
            int cnt = sc.nextInt();
            sc.nextLine(); // Đọc bỏ dòng trống
            String tenTacGia = sc.nextLine();
            String email = sc.nextLine();
            char gt = sc.nextLine().charAt(0);

            Author tg = new Author(tenTacGia, email, gt);
            Book tmp = new Book(tenSach, gia, cnt, tg);
            books.add(tmp);
        }

        // Sắp xếp sách theo giá bán giảm dần, nếu cùng giá thì sắp xếp theo tên sách tăng dần
        Collections.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                if (b1.getPrice() != b2.getPrice()) {
                    return Double.compare(b2.getPrice(), b1.getPrice()); // Sắp xếp theo giá giảm dần
                } else {
                    return b1.getNameBook().compareTo(b2.getNameBook()); // Sắp xếp theo tên tăng dần
                }
            }
        });

        for (Book book : books) {
            book.display();
        }
    }
}
