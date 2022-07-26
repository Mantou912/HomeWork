package HomeWork.AllDemo._0726Pack.VEHICLE;

public class MainTest {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(8, 3);
        Car car = new Car(4, 2, 4);
        Truck truck = new Truck(12, 10, 20);

        System.out.println(vehicle);
        System.out.println(car);
        System.out.println(truck);
    }
}
