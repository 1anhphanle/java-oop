package huongdoituong.Bai18;

import java.util.Scanner;

public class NhanVien {
    private static int idCounter = 1;
    private String maNV;
    private String hoTen;
    private String gioiTinh;
    private String ngaySinh;
    private String diaChi;
    private String maSoThue;
    private String ngayKyHopDong;

    public NhanVien() {
        this.maNV = String.format("%05d", idCounter++);
        this.hoTen = "";
        this.gioiTinh = "";
        this.ngaySinh = "";
        this.diaChi = "";
        this.maSoThue = "";
        this.ngayKyHopDong = "";
    }

    public void nhapThongTin(Scanner sc) {
        this.hoTen = sc.nextLine();
        this.gioiTinh = sc.nextLine();
        this.ngaySinh = chuanHoaNgay(sc.nextLine());
        this.diaChi = sc.nextLine();
        this.maSoThue = sc.nextLine();
        this.ngayKyHopDong = chuanHoaNgay(sc.nextLine());
    }

    private String chuanHoaNgay(String ngay) {
        String[] parts = ngay.split("/");
        if (parts[0].length() == 1) parts[0] = "0" + parts[0];
        if (parts[1].length() == 1) parts[1] = "0" + parts[1];
        return String.join("/", parts);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %s %s %s", maNV, hoTen, gioiTinh, ngaySinh, diaChi, maSoThue, ngayKyHopDong);
    }
}
