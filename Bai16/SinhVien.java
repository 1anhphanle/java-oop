package huongdoituong.Bai16;

class SinhVien {
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
        this.hoTen = chuanHoaTen(hoTen);
        this.lop = lop;
        this.ngaySinh = chuanHoaNgay(ngaySinh);
        this.gpa = gpa;
    }

    private String chuanHoaTen(String ten) {
        String[] words = ten.toLowerCase().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (word.length() > 0) {
                sb.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1)).append(" ");
            }
        }
        return sb.toString().trim();
    }

    private String chuanHoaNgay(String ngay) {
        String[] parts = ngay.split("/");
        if (parts[0].length() == 1) parts[0] = "0" + parts[0];
        if (parts[1].length() == 1) parts[1] = "0" + parts[1];
        return String.join("/", parts);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %.2f", maSV, hoTen, lop, ngaySinh, gpa);
    }
}
