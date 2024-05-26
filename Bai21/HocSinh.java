package huongdoituong.Bai21;

class HocSinh {
    private static int nextID = 1;

    private int maHS;
    private String hoTen;
    private double[] diemMonHoc;

    public HocSinh(String hoTen, double[] diemMonHoc) {
        this.maHS = nextID++;
        this.hoTen = hoTen;
        this.diemMonHoc = diemMonHoc;
    }

    public int getMaHS() {
        return maHS;
    }

    public String getHoTen() {
        return hoTen;
    }

    public double tinhDiemTrungBinh() {
        double tongDiem = 0;
        for (double diem : diemMonHoc) {
            tongDiem += diem;
        }
        return tongDiem / diemMonHoc.length;
    }

    public String xepLoai() {
        double diemTB = tinhDiemTrungBinh();
        if (diemTB >= 9.0) {
            return "XUAT SAC";
        } else if (diemTB >= 8.0) {
            return "GIOI";
        } else if (diemTB >= 7.0) {
            return "KHA";
        } else if (diemTB >= 5.0) {
            return "TB";
        } else {
            return "YEU";
        }
    }

    @Override
    public String toString() {
        return String.format("HS%02d %s %.1f %s", maHS, hoTen, tinhDiemTrungBinh(), xepLoai());
    }
}