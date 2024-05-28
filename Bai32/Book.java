package huongdoituong.Bai32;

public class Book {
    private String nameBook;
    private Author author;
    private double price;
    private int qty;

    public Book(String nameBook, double price, int qty, Author author) {
        this.nameBook = nameBook;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getNameBook() {
        return nameBook;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void display() {
        System.out.println("--------------------");
        System.out.println("Book Details : ");
        System.out.println("Name : " + this.nameBook);
        System.out.println("Price : " + Math.round(this.price)); // Làm tròn giá bán
        System.out.println("Quantity : " + this.qty);
        System.out.println("Author Information : ");
        System.out.println(author);
        System.out.println("--------------------");
    }
}
