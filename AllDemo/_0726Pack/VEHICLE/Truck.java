package HomeWork.AllDemo._0726Pack.VEHICLE;

public class Truck extends Vehicle {
    double payload;

    public Truck(int wheels, double weight, double payload) {
        super(wheels, weight);
        this.payload = payload;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "payload=" + payload +
                ", wheels=" + wheels +
                ", weight=" + weight +
                '}';
    }
}
