package HomeWork.UPDATE._0726Pack.CAR;

import java.util.Objects;
import java.util.Scanner;

public class Car {
    Scanner scanner = new Scanner(System.in);
    private String Color;
    private String Type;

    public Car() {
        System.out.print("请输入Car颜色： ");
        Color = scanner.next();
        System.out.print("请输入Car型号： ");
        Type = scanner.next();
    }

    public Car(String color, String type) {
        Color = color;
        Type = type;
    }

    public String getColor() {
        return Color;
    }

    public String getType() {
        return Type;
    }

    public void setColor(String color) {
        Color = color;
    }

    public void setType(String type) {
        Type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Color='" + Color + '\'' +
                ", Type='" + Type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(Color, car.Color) && Objects.equals(Type, car.Type);
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("Yellow", "Tesla");
        System.out.println(car1.equals(car2));
    }
}
