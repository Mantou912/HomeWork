package HomeWork.UPDATE._2727Pack.Graphics;

public class MainTest {
    public static void main(String[] args) {
        MainTest mainTest = new MainTest();

        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle(2.5);
        shapes[1] = new Rectangle(10.5, 5.2);
        shapes[2] = new Square(11.7);

        for (Shape shape : shapes
        ) {
            mainTest.printShape(shape);
        }

        System.out.println("面积为；" + mainTest.getShape(2).area());
    }

    public Shape getShape(int i) {
        switch (i) {
            case 0 -> {
                return new Circle(1);
            }
            case 1 -> {
                return new Rectangle(3, 2);
            }
            case 2 -> {
                return new Square(2);
            }
            default -> {
                return null;
            }
        }
    }

    public void printShape(Shape shape) {
        System.out.println("周长为: " + shape.girth() + "\t面积为： " + shape.area());
    }
}
