package tech.lucasfeitosa.filetracking.model;

public class EasyTracking {

    private short x;
    private int t;
    private int padY = 0;
    private int padRS =0;
    private int padQR= 0;
    private int padC = 0;
    private int k = 0;
    private int n = 0;
    private int y = 0;
    private int c = 0;
    private int bytesQR = 0;

    public EasyTracking(short x) {
        this.x = x;
        calculateVariables();
    }

    private void calculateVariables() {


        int mod2 = (2 * getY()) % 16;
        if (mod2 != 0) {
            padRS = 16 - mod2;
            k = (2 * getY() + 16 - mod2) / 16;

        } else {
            k = 2 * getY() / 16;
        }

        n = 3 * getK();

        t = (getN() - getK()) / 2;


        if ((4 * getY()) % 8 != 0) {
            padC = (8 * (getN() - getK())) % (4 * getY());
            c = (4 * getY() + padC) / 8;

        } else {
            c = 4 * getY() / 8;
        }

        if ((6 * getY()) % 8 != 0) {
            padQR = 8 - (6 * getY()) % 8;
            bytesQR = (6 * getY() + 8 - (6 * getY()) % 8) / 8 + 32 + 2;

        } else {
            bytesQR = 6 * getY() / 8 + 32 + 2;
        }

    }


    public short getX() {
        return x;
    }

    public int getT() {
        return t;
    }

    public int getPadY() {
        return padY;
    }

    public int getPadRS() {
        return padRS;
    }

    public int getPadQR() {
        return padQR;
    }

    public int getPadC() {
        return padC;
    }

    public int getK() {
        return k;
    }

    public int getN() {
        return n;
    }

    public int getY() {
        return y;
    }

    public int getC() {
        return c;
    }

    public int getBytesQR() {
        return bytesQR;
    }
}
