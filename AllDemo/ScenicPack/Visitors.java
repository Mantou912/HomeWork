package HomeWork.AllDemo.ScenicPack;

import java.util.Scanner;

public class Visitors {
    Scanner input = new Scanner(System.in);
    String name;
    int age;

    public Visitors() {
        System.out.print("����������: ");
        name = input.next();
        System.out.print("����������: ");
        age = input.nextInt();
    }

    public void show() {
        if (age > 18) {
            System.out.println(name + "������Ϊ��" + age + "��Ʊ�۸�Ϊ��20Ԫ");
        } else {
            System.out.println(name + "������Ϊ��" + age + ",��Ʊ���");
        }
    }
}
