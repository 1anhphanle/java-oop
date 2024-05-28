package huongdoituong.Bai28;

public class Account {
    private String id;
    private String customerId;
    private String username;
    private String password;

    public Account(String id, String customerId, String username, String password) {
        this.id = id;
        this.customerId = customerId;
        this.username = username;
        this.password = password;
    }

    public boolean checkLogin(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
}