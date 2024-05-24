package huongdoituong.Bai14;

public class MatHang implements Comparable<MatHang> {
    private static int counter = 1;
    private String maMatHang;
    private String tenMatHang;
    private String donViTinh;
    private int giaMua;
    private int giaBan;

    public MatHang(String tenMatHang, String donViTinh, int giaMua, int giaBan) {
        this.maMatHang = String.format("MH%04d", counter++);
        this.tenMatHang = tenMatHang;
        this.donViTinh = donViTinh;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public int getLoiNhuan() {
        return giaBan - giaMua;
    }

    @Override
    public int compareTo(MatHang other) {
        int profitComparison = Integer.compare(other.getLoiNhuan(), this.getLoiNhuan());
        if (profitComparison != 0) {
            return profitComparison;
        }
        return this.maMatHang.compareTo(other.maMatHang);
    }

    @Override
    public String toString() {
        return maMatHang + " " + tenMatHang + " " + donViTinh + " " + giaMua + " " + giaBan + " " + getLoiNhuan();
    }
}
