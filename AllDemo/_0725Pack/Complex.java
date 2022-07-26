package HomeWork.AllDemo._0725Pack;

import java.util.Scanner;

public class Complex {
    Scanner scanner = new Scanner(System.in);
    double real;
    double im;
    public Complex add(Complex c) {
        real += c.real;
        im += c.im;
        return this;
    }

    public Complex add(double real) {
        this.real += real;
        return this;
    }

    public Complex sub(Complex c) {
        real -= c.real;
        im -= c.im;
        return this;
    }

    public Complex sub(double real) {
        this.real -= real;
        return this;
    }

    public Complex mul(Complex c) {
        real = real * c.real - im * c.im;
        im = real * c.im + im * c.real;
        return this;
    }
}
