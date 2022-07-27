package HomeWork.UPDATE._2727Pack.Company;

public class SalariedEmployee extends Employee {
    private double Salary;

    public SalariedEmployee(String name, int month, double salary) {
        super(name, month);
        Salary = salary;
    }

    public double getSalary(int Month) {
        return Salary + super.getSalary(Month);
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

}
