package HomeWork.AllDemo._0725Pack;

import java.util.Scanner;

public class Worker {
    Scanner scanner = new Scanner(System.in);
    String Name;    //��������
    int Age;        //��������
    double Salary;  //���˹���
    Address addr;

    public Worker() {
        System.out.print("�����빤�������� ");
        this.Name = scanner.next();
        System.out.print("�����빤�����䣺 ");
        this.Age = scanner.nextInt();
        System.out.print("�����빤�˹��ʣ� ");
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
        System.out.print("�����빤�˹���ʱ���� ");
        double Hours = scanner.nextDouble();
        System.out.println("�ѹ���" + Hours + "Сʱ!");
    }

    public void work(int hours) {
        System.out.println("�ѹ���" + hours + "Сʱ!");
    }
}
