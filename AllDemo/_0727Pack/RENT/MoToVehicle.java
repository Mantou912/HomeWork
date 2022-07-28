package HomeWork.AllDemo._0727Pack.RENT;

public abstract class MoToVehicle {
    protected String No;
    protected String Brand;
    protected String Color;

    public String getNo() {
        return No;
    }

    public String getBrand() {
        return Brand;
    }

    public String getColor() {
        return Color;
    }

    public double getMiles() {
        return Miles;
    }

    protected double Miles;

    public MoToVehicle(String no, String brand, String color, double miles) {
        No = no;
        Brand = brand;
        Color = color;
        Miles = miles;
    }

    protected int CalcRent(MoToVehicle[] moToVehicles, int days) {
        int totalRent = 0;
        for (MoToVehicle motors : moToVehicles) {
            totalRent += motors.CalcRent(days);
        }
        return totalRent;
    }

    protected abstract int CalcRent(int days);
}
