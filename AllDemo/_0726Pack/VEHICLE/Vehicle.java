package HomeWork.AllDemo._0726Pack.VEHICLE;

public class Vehicle {
    int wheels;
    double weight;

    public Vehicle(int wheels, double weight) {
        this.wheels = wheels;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "wheels=" + wheels +
                ", weight=" + weight +
                '}';
    }
}
