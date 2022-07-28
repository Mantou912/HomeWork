package HomeWork.AllDemo._2727Pack.Company;

public class HourlyEmployee extends Employee {
    private double hourSalary;

    public HourlyEmployee(String name, int month, double hourSalary, int hours) {
        super(name, month);
        this.hourSalary = hourSalary;
        Hours = hours;
    }

    private int Hours;

    public double getHourSalary() {
        return hourSalary;
    }

    public void setHourSalary(double hourSalary) {
        this.hourSalary = hourSalary;
    }

    public int getHours() {
        return Hours;
    }

    public void setHours(int hours) {
        Hours = hours;
    }

    public double getSalary(int Month) {
        if (getHours() > 160) {
            return 160 * getHourSalary() + (getHours() - 160) * 1.5 * getHourSalary() + super.getSalary(Month);
        } else {
            return getHours() * getHourSalary() + super.getSalary(Month);
        }
    }
}
