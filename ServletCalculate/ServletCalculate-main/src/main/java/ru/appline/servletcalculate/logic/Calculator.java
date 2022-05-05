package ru.appline.servletcalculate.logic;

public class Calculator {
    private int a;

    private int b;

    private char math;

    public Calculator(int a, int b, char math) {
        this.a = a;
        this.b = b;
        this.math = math;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public char getMath() {
        return math;
    }

    public void setMath(char math) {
        this.math = math;
    }

}
