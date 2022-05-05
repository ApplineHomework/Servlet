package ru.appline.logic;

public class Compass {
    private Side side;
    private int degree;

    public Compass(Side side, int degree) {
        this.side = side;
        this.degree = degree;
    }

    public Side getSide() {
        return side;
    }

    public void setSide(Side side) {
        this.side = side;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

}
