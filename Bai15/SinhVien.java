package huongdoituong.Bai15;

public class SinhVien {
    private static int idCounter = 1;
    private String maSV;
    private String hoTen;
    private String lop;
    private String ngaySinh;
    private float gpa;

    public SinhVien() {
        this.maSV = String.format("SV%03d", idCounter++);
        this.hoTen = "";
        this.lop = "";
        this.ngaySinh = "";
        this.gpa = 0.0f;
    }

    public void nhapThongTin(String hoTen, String lop, String ngaySinh, float gpa) {
        this.hoTen = hoTen;
        this.lop = lop;
        this.ngaySinh = ngaySinh;
        chuanHoaNgay();
        this.gpa = gpa;
    }

    public void chuanHoaNgay() {
        StringBuilder sb = new StringBuilder(this.ngaySinh);
        if (sb.charAt(1) == '/') sb.insert(0, "0");
        if (sb.charAt(4) == '/') sb.insert(3, "0");
        this.ngaySinh = sb.toString();
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %.2f", maSV, hoTen, lop, ngaySinh, gpa);
    }
}
