package huongdoituong.Bai25;

public class Student {
    private String maSV;
    private String hoTen;
    private String lop;
    private String email;

    public Student(String maSV, String hoTen, String lop, String email) {
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

    public String getKhoa() {
        return maSV.substring(0, 4);
    }

    public String chuanHoaTen() {
        String[] arr = hoTen.split("\\s+");
        StringBuilder sb = new StringBuilder("");
        for (String x : arr) {
            sb.append(Character.toUpperCase(x.charAt(0)));
            for (int i = 1; i < x.length(); i++) {
                sb.append(Character.toLowerCase(x.charAt(i)));
            }
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    @Override
    public String toString() {
        return maSV + " " + chuanHoaTen() + " " + lop + " " + email;
    }
}
