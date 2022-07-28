package HomeWork.AllDemo._2727Pack.Company;

public class MainTest {
    public static void main(String[] args) {
        MainTest mainTest = new MainTest();
        Employee[] employees = new Employee[4];
        employees[0] = new SalesEmployee("Taylor", 2, 100000, 0.5);
        employees[1] = new BasePlusSalesEmployee("Juliette", 3, 1000, 0.9, 6000);
        employees[2] = new HourlyEmployee("Elizabeth", 4, 100, 240);
        employees[3] = new SalariedEmployee("Charlie", 5, 9000);

        for (Employee employee : employees) {
            mainTest.printShape(employee, 10);
        }

    }

    public void printShape(Employee employee, int month) {
        System.out.println("当月工资为： " + employee.getSalary(month));
    }
}
