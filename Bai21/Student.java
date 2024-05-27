package huongdoituong.Bai21;

class Student {
    static int count = 0;
    String maHocSinh;
    String hoTen;
    double[] diemMonHoc;

    public Student(String hoTen, double[] diemMonHoc) {
        this.maHocSinh = "HS" + String.format("%02d", ++count);
        this.hoTen = hoTen;
        this.diemMonHoc = diemMonHoc;
    }

    public double tinhDiemTrungBinh() {
        double sum = 0;
        for (double diem : diemMonHoc) {
            sum += diem;
        }
        return sum / diemMonHoc.length;
    }

    public String xepLoai() {
        double diemTrungBinh = tinhDiemTrungBinh();
        if (diemTrungBinh >= 9) {
            return "XUAT SAC";
        } else if (diemTrungBinh >= 8) {
            return "GIOI";
        } else if (diemTrungBinh >= 7) {
            return "KHA";
        } else if (diemTrungBinh >= 5) {
            return "TB";
        } else {
            return "YEU";
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s %.1f %s", maHocSinh, hoTen, tinhDiemTrungBinh(), xepLoai());
    }
}