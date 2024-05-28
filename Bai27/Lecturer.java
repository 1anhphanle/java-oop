package huongdoituong.Bai27;

public class Lecturer {
    private String maGV;
    private String hoTen;
    private String boMon;

    public Lecturer(String maGV, String hoTen, String boMon) {
        this.maGV = maGV;
        this.hoTen = hoTen;
        this.boMon = boMon;
    }

    public String getMaGV() {
        return maGV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getBoMon() {
        return boMon;
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

    public String getBoMonTat() {
        String[] arr = boMon.split("\\s+");
        StringBuilder sb = new StringBuilder("");
        for (String x : arr) {
            sb.append(Character.toUpperCase(x.charAt(0)));
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return maGV + " " + chuanHoaTen() + " " + getBoMonTat();
    }
}