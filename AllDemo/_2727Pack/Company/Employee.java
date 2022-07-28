package HomeWork.AllDemo._2727Pack.Company;

public class Employee {
    private String Name;
    private int Month;

    public Employee(String name, int month) {
        Name = name;
        Month = month;
    }

    public String getName() {
        return Name;
    }

    public int getMonth() {
        return Month;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setMonth(int month) {
        Month = month;
    }

    public double getSalary(int month) {
        if (month == Month)
            return 100;
        return 0;
    }
}
