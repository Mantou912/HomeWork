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
        System.out.print("请输入姓名： ");
        name = input.next();
        System.out.print("请输入性别： ");
        gender = input.next();
        System.out.print("请输入年龄： ");
        age = input.nextInt();
        System.out.print("请输入ID： ");
        id = input.nextInt();
        System.out.print("请输入得分： ");
        score = input.nextDouble();

    }

    public String say() {
        String sum = "";
        sum = "姓名: " + name + "\t性别: " + gender + "\t年龄: " + age + "\tID: " + id + "\tScore： " + score;
        return sum;
    }
}
