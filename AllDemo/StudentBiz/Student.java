package HomeWork.AllDemo.StudentBiz;

import java.util.Scanner;

public class Student {

    static int Number;

    String Name;
    int age;
    double score;

    public Student() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入姓名：");
        Name = scanner.next();
        System.out.print("请输入年龄：");
        age = scanner.nextInt();
        System.out.print("请输入得分：");
        score = scanner.nextDouble();
        Number++;
    }

    public void show() {
        System.out.println(Name + " " + age + " " + score);
    }
}