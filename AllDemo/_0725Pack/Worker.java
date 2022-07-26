package HomeWork.AllDemo._0725Pack;

import java.util.Scanner;

public class Worker {
    Scanner scanner = new Scanner(System.in);
    String Name;    //工人姓名
    int Age;        //工人年龄
    double Salary;  //工人工资
    Address addr;

    public Worker() {
        System.out.print("请输入工人姓名： ");
        this.Name = scanner.next();
        System.out.print("请输入工人年龄： ");
        this.Age = scanner.nextInt();
        System.out.print("请输入工人工资： ");
        this.Salary = scanner.nextDouble();
        addr = new Address();
    }

    public Worker(Scanner scanner, String name, int age, double salary, Address addr) {
        this.scanner = scanner;
        Name = name;
        Age = age;
        Salary = salary;
        this.addr = addr;
    }

    public Worker(String Name, int Age, double Salary) {
        this.Name = Name;
        this.Age = Age;
        this.Salary = Salary;
        addr = new Address();
    }

    public void work() {
        System.out.print("请输入工人工作时长： ");
        double Hours = scanner.nextDouble();
        System.out.println("已工作" + Hours + "小时!");
    }

    public void work(int hours) {
        System.out.println("已工作" + hours + "小时!");
    }
}
