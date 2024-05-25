package huongdoituong.Bai18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class NhanVien {
    private static int counter = 1;
    private String maNV;
    private String hoTen;
    private String gioiTinh;
    private String ngaySinh;
    private String diaChi;
    private String maSoThue;
    private String ngayKyHopDong;

    public NhanVien() {
        this.maNV = String.format("%05d", counter++);
    }

    private String chuanHoaNgay(String ngay) {
        String[] parts = ngay.split("[/\\-]");
        if (parts[0].length() == 1) parts[0] = "0" + parts[0];
        if (parts[1].length() == 1) parts[1] = "0" + parts[1];
        return parts[0] + "/" + parts[1] + "/" + parts[2];
    }

    public void nhap(Scanner sc) {
        this.hoTen = sc.nextLine();
        this.gioiTinh = sc.nextLine();
        this.ngaySinh = chuanHoaNgay(sc.nextLine());
        this.diaChi = sc.nextLine();
        this.maSoThue = sc.nextLine();
        this.ngayKyHopDong = chuanHoaNgay(sc.nextLine());
    }

    @Override
    public String toString() {
        return maNV + " " + hoTen + " " + gioiTinh + " " + ngaySinh + " " + diaChi + " " + maSoThue + " " + ngayKyHopDong;
    }
}