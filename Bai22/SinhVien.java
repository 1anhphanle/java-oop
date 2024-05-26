package huongdoituong.Bai22;

public class SinhVien {
    private String maSV;
    private String hoTen;
    private String lop;
    private String email;

    public SinhVien(String maSV, String hoTen, String lop, String email) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getLop() {
        return lop;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return maSV + " " + hoTen + " " + lop + " " + email;
    }
}

