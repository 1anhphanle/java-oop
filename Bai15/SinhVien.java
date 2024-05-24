package huongdoituong.Bai15;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SinhVien {
    private static int counter = 1;
    private String maSV;
    private String hoTen;
    private String lop;
    private String ngaySinh;
    private double gpa;

    public SinhVien() {
        this.maSV = String.format("SV%03d", counter++);
        this.hoTen = "";
        this.lop = "";
        this.ngaySinh = "";
        this.gpa = 0.0;
    }

    public SinhVien(String hoTen, String lop, String ngaySinh, double gpa) {
        this();
        this.hoTen = hoTen;
        this.lop = lop;
        this.ngaySinh = chuanHoaNgaySinh(ngaySinh);
        this.gpa = gpa;
    }

    private String chuanHoaNgaySinh(String ngaySinh) {
        String[] parts = ngaySinh.split("[/\\-]");
        if (parts[0].length() == 1) parts[0] = "0" + parts[0];
        if (parts[1].length() == 1) parts[1] = "0" + parts[1];
        return parts[0] + "/" + parts[1] + "/" + parts[2];
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.00");
        return maSV + " " + hoTen + " " + lop + " " + ngaySinh + " " + df.format(gpa);
    }
}