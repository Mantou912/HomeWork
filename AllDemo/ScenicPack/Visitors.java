package HomeWork.AllDemo.ScenicPack;

import java.util.Scanner;

public class Visitors {
    Scanner input = new Scanner(System.in);
    String name;
    int age;

    public Visitors() {
        System.out.print("请输入姓名: ");
        name = input.next();
        System.out.print("请输入年龄: ");
        age = input.nextInt();
    }

    public void show() {
        if (age > 18) {
            System.out.println(name + "的年龄为：" + age + "门票价格为：20元");
        } else {
            System.out.println(name + "的年龄为：" + age + ",门票免费");
        }
    }
}
