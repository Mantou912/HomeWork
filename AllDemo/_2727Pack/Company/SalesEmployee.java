package HomeWork.AllDemo._2727Pack.Company;

public class SalesEmployee extends Employee {
    private double Sales;
    private double Rate;

    public double getSales() {
        return Sales;
    }

    public SalesEmployee(String name, int month, double sales, double rate) {
        super(name, month);
        Sales = sales;
        Rate = rate;
    }

    public void setSales(double sales) {
        Sales = sales;
    }

    public double getRate() {
        return Rate;
    }

    public void setRate(double rate) {
        Rate = rate;
    }

    public double getSalary(int Month) {
        return getSales() * getRate() + super.getSalary(Month);
    }
}
