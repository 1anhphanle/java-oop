package huongdoituong.Bai20;

class GameThu {
    String username;
    String password;
    String ten;
    int gioVao;
    int phutVao;
    int gioRa;
    int phutRa;

    public GameThu(String username, String password, String ten, int gioVao, int phutVao, int gioRa, int phutRa) {
        this.username = username;
        this.password = password;
        this.ten = ten;
        this.gioVao = gioVao;
        this.phutVao = phutVao;
        this.gioRa = gioRa;
        this.phutRa = phutRa;
    }

    public int tinhThoiGian() {
        int thoiGianVao = gioVao * 60 + phutVao;
        int thoiGianRa = gioRa * 60 + phutRa;
        return thoiGianRa - thoiGianVao;
    }

    @Override
    public String toString() {
        int thoiGian = tinhThoiGian();
        int gio = thoiGian / 60;
        int phut = thoiGian % 60;
        return String.format("%02d gio %02d phut", gio, phut);
    }
}