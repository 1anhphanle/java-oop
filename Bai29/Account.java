package huongdoituong.Bai29;

public class Account {
    private String id;
    private String customerId;
    private String soTaiKhoan;
    private String PIN;
    private int soDu;

    public Account(String id, String customerId, String soTaiKhoan, String PIN, int soDu) {
        this.id = id;
        this.customerId = customerId;
        this.soTaiKhoan = soTaiKhoan;
        this.PIN = PIN;
        this.soDu = soDu;
    }

    public void deposit(int tien) {
        this.soDu += tien;
    }

    public void withdraw(int tien) {
        if (this.soDu - 50000 >= tien) {
            this.soDu -= tien;
        }
    }

    public int getSoDu() {
        return this.soDu;
    }

    public static int findPos(Account[] a, String soTaiKhoan) {
        for (int i = 0; i < a.length; i++) {
            if (a[i].soTaiKhoan.equals(soTaiKhoan)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return "ID : " + this.id + "\nCusID : " + this.customerId + "\nNumber : " + this.soTaiKhoan +
                "\nPIN : " + this.PIN + "\nBalance : " + this.soDu + "VND\n-------------------";
    }
}
