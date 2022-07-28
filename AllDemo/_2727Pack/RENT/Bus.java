package HomeWork.AllDemo._2727Pack.RENT;

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
    protected int CalcRent(int days) {
        System.out.println("\n" + "�˿����ã�����Ҫ֧���ķ����� " + getRent() * days + " Ԫ");
        return getRent() * days;
    }
}
