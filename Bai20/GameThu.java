package huongdoituong.Bai20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class GameThu {
    private String username;
    private String password;
    private String ten;
    private int gioVao;
    private int phutVao;
    private int gioRa;
    private int phutRa;

    public GameThu(String username, String password, String ten, int gioVao, int phutVao, int gioRa, int phutRa) {
        this.username = username;
        this.password = password;
        this.ten = ten;
        this.gioVao = gioVao;
        this.phutVao = phutVao;
        this.gioRa = gioRa;
        this.phutRa = phutRa;
    }

    public String getUsername() {
        return username;
    }

    public String getTen() {
        return ten;
    }

    public int tinhThoiGianChoi() {
        int gioChoi = gioRa - gioVao;
        int phutChoi = phutRa - phutVao;
        if (phutChoi < 0) {
            gioChoi--;
            phutChoi += 60;
        }
        return gioChoi * 60 + phutChoi;
    }

    @Override
    public String toString() {
        int thoiGianChoi = tinhThoiGianChoi();
        int gio = thoiGianChoi / 60;
        int phut = thoiGianChoi % 60;
        return String.format("%s %s %s %d gio %d phut", username, password, ten, gio, phut);
    }
}
