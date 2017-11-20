package com.example.alberto.dibujarenunaview;

/**
 * Created by Alberto on 20/11/2017.
 */

public class classLinea {
    int iniX;
    int iniY;
    int finX;
    int finY;

    public classLinea(int iniX, int iniY, int finX, int finY) {
        this.iniX = iniX;
        this.iniY = iniY;
        this.finX = finX;
        this.finY = finY;
    }

    public int getIniX() {
        return iniX;
    }

    public void setIniX(int iniX) {
        this.iniX = iniX;
    }

    public int getIniY() {
        return iniY;
    }

    public void setIniY(int iniY) {
        this.iniY = iniY;
    }

    public int getFinX() {
        return finX;
    }

    public void setFinX(int finX) {
        this.finX = finX;
    }

    public int getFinY() {
        return finY;
    }

    public void setFinY(int finY) {
        this.finY = finY;
    }
}
