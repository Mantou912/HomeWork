package HomeWork.PAST.StudentPack;

import java.util.Scanner;

public class Student {
    String name;
    String gender;
    int age;
    int id;
    double score;

    public Student() {
        Scanner input = new Scanner(System.in);
        System.out.print("������������ ");
        name = input.next();
        System.out.print("�������Ա� ");
        gender = input.next();
        System.out.print("���������䣺 ");
        age = input.nextInt();
        System.out.print("������ID�� ");
        id = input.nextInt();
        System.out.print("������÷֣� ");
        score = input.nextDouble();

    }

    public String say() {
        String sum = "";
        sum = "����: " + name + "\t�Ա�: " + gender + "\t����: " + age + "\tID: " + id + "\tScore�� " + score;
        return sum;
    }
}
