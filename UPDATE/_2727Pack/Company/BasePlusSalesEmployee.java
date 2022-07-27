package HomeWork.UPDATE._2727Pack.Company;

public class BasePlusSalesEmployee extends SalesEmployee {
    private double baseSalary;

    public BasePlusSalesEmployee(String name, int month, double sales, double rate, double baseSalary) {
        super(name, month, sales, rate);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getSalary(int Month) {
        return getSales() * getRate() + super.getSalary(Month) + getBaseSalary();
    }
}
