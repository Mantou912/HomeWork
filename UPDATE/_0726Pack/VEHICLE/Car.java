package HomeWork.UPDATE._0726Pack.VEHICLE;

public class Car extends Vehicle {
    int loader;

    public Car(int wheels, double weight, int loader) {
        super(wheels, weight);
        this.loader = loader;
    }

    @Override
    public String toString() {
        return "Car{" +
                "loader=" + loader +
                ", wheels=" + wheels +
                ", weight=" + weight +
                '}';
    }
}
