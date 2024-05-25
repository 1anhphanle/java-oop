package huongdoituong.Bai19;

import java.util.ArrayList;
import java.util.Comparator;
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

    public void nhap(Scanner sc) {
        this.hoTen = sc.nextLine();
        this.gioiTinh = sc.nextLine();
        this.ngaySinh = sc.nextLine();
        this.diaChi = sc.nextLine();
        this.maSoThue = sc.nextLine();
        this.ngayKyHopDong = sc.nextLine();
    }

    @Override
    public String toString() {
        return maNV + " " + hoTen + " " + gioiTinh + " " + ngaySinh + " " + diaChi + " " + maSoThue + " " + ngayKyHopDong;
    }

    public static Comparator<NhanVien> ngaySinhComparator = (nv1, nv2) -> {
        String[] parts1 = nv1.ngaySinh.split("/");
        String[] parts2 = nv2.ngaySinh.split("/");
        String date1 = parts1[2] + parts1[1] + parts1[0];
        String date2 = parts2[2] + parts2[1] + parts2[0];
        return date2.compareTo(date1);
    };
}