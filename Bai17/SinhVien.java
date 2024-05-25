package huongdoituong.Bai17;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class SinhVien {
    private static int counter = 1;
    private String maSV;
    private String hoTen;
    private String lop;
    private String ngaySinh;
    private double gpa;

    public SinhVien(String hoTen, String lop, String ngaySinh, double gpa) {
        this.maSV = String.format("SV%03d", counter++);
        this.hoTen = chuanHoaTen(hoTen);
        this.lop = lop;
        this.ngaySinh = chuanHoaNgaySinh(ngaySinh);
        this.gpa = gpa;
    }

    private String chuanHoaTen(String hoTen) {
        String[] words = hoTen.toLowerCase().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1)).append(" ");
        }
        return sb.toString().trim();
    }

    private String chuanHoaNgaySinh(String ngaySinh) {
        String[] parts = ngaySinh.split("[/\\-]");
        if (parts[0].length() == 1) parts[0] = "0" + parts[0];
        if (parts[1].length() == 1) parts[1] = "0" + parts[1];
        return parts[0] + "/" + parts[1] + "/" + parts[2];
    }

    public String getMaSV() {
        return maSV;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.00");
        return maSV + " " + hoTen + " " + lop + " " + ngaySinh + " " + df.format(gpa);
    }
}