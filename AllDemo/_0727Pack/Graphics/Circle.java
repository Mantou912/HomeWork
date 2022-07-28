package HomeWork.AllDemo._0727Pack.Graphics;

public class Circle extends Shape {
    final static double PI = 3.141;

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI * getRadius() * getRadius();
    }

    @Override
    public double girth() {
        return PI * getRadius() * 2;
    }
}
