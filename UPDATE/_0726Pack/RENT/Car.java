package HomeWork.UPDATE._0726Pack.RENT;

final public class Car extends MoToVehicle {
    private String Type;
    private int Rent;

    public void setRent(int rent) {
        Rent = rent;
    }

    public void setType(String type) {
        Type = type;
    }

    public int getRent() {
        return Rent;
    }

    public String getType() {
        return Type;
    }

    public Car(String no, String brand, String color, double miles, String type, int rent) {
        super(no, brand, color, miles);
        setType(type);
        setRent(rent);
    }

    @Override
    public void CalcRent(int days) {
        System.out.println("\n" + "顾客您好！您需要支付的费用是 " + getRent() * days + " 元");
    }
}
