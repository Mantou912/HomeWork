package HomeWork.AllDemo._2727Pack.Graphics;

public class Square extends Rectangle {

    public Square(double length) {
        super(length, length);
    }

    public double area() {
        return getLength() * getWidth();
    }

    @Override
    public double girth() {
        return 2 * (getLength() + getWidth());
    }
}
