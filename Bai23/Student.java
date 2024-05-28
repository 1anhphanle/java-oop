package huongdoituong.Bai23;

public class Student {
    private String maSV;
    private String hoTen;
    private String lop;
    private String email;

    public Student(String maSV, String hoTen, String lop, String email) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
    }

    public String getMaSV() {
        return maSV;
    }

    @Override
    public String toString() {
        return maSV + " " + hoTen + " " + lop + " " + email;
    }
}