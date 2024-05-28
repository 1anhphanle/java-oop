package huongdoituong.Bai31;

public class Team {
    private String maDoiBong;
    private String tenDoiBong;
    private int soTranDaDau;
    private int hieuSoBanThangThua;
    private int diemSo;

    public Team(String maDoiBong, String tenDoiBong, int soTranDaDau, int hieuSoBanThangThua, int diemSo) {
        this.maDoiBong = maDoiBong;
        this.tenDoiBong = tenDoiBong;
        this.soTranDaDau = soTranDaDau;
        this.hieuSoBanThangThua = hieuSoBanThangThua;
        this.diemSo = diemSo;
    }

    public void updateMatch(int banThang, int banThua) {
        this.soTranDaDau++;
        this.hieuSoBanThangThua += banThang - banThua;
        if (banThang > banThua) {
            this.diemSo += 3;
        } else if (banThang == banThua) {
            this.diemSo += 1;
        }
    }

    public String getMaDoiBong() {
        return maDoiBong;
    }

    public int getDiemSo() {
        return diemSo;
    }

    public int getHieuSoBanThangThua() {
        return hieuSoBanThangThua;
    }

    @Override
    public String toString() {
        return "#" + (soTranDaDau + 1) + " " + maDoiBong + " " + tenDoiBong + " " + soTranDaDau + " " +
                hieuSoBanThangThua + " " + diemSo;
    }
}