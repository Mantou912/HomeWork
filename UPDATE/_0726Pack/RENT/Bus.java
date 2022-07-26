package HomeWork.UPDATE._0726Pack.RENT;

final public class Bus extends MoToVehicle {
    private int SeatCount;
    private int Rent;

    public void setRent(int rent) {
        Rent = rent;
    }

    public void setSeatCount(int seatCount) {
        SeatCount = seatCount;
    }

    public int getSeatCount() {
        return SeatCount;
    }

    public int getRent() {
        return Rent;
    }

    public Bus(String no, String brand, String color, double miles, int seatCount, int rent) {
        super(no, brand, color, miles);
        setSeatCount(seatCount);
        setRent(rent);
    }

    @Override
    protected void CalcRent(int days) {
        System.out.println("\n" + "顾客您好！您需要支付的费用是 " + getRent() * days + " 元");
    }
}
