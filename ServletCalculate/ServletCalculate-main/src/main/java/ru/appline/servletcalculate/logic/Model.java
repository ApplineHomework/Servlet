package ru.appline.servletcalculate.logic;

public class Model {
    private static final Model instance = new Model();

    public static Model getInstance() {
        return instance;
    }

    public double calculate(int a, int b, char math) {
        if (math == '*')
            return a * b;
        else if (math == '/')
            return (double) a / b;
        else if (math == '+')
            return a + b;
        else if (math == '-')
            return a - b;
        else return 0;
    }

}
