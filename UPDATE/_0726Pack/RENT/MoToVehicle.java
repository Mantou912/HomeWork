package HomeWork.UPDATE._0726Pack.RENT;

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

    protected abstract void CalcRent(int days);
}
