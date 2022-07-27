package HomeWork.UPDATE._2727Pack.Graphics;

public class Rectangle extends Shape {
    private double Length;
    private double Width;

    public Rectangle(double length, double width) {
        Length = length;
        Width = width;
    }

    public double getLength() {
        return Length;
    }

    public double getWidth() {
        return Width;
    }

    public void setLength(double length) {
        Length = length;
    }

    public void setWidth(double width) {
        Width = width;
    }

    @Override
    public double area() {
        return getLength() * getWidth();
    }

    @Override
    public double girth() {
        return 2 * (getLength() + getWidth());
    }
}
