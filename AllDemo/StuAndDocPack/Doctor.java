package HomeWork.AllDemo.StuAndDocPack;

import java.util.Scanner;

public class Doctor {
    Scanner input = new Scanner(System.in);
    String name;
    String direction;
    int age;
    String course;

    public Doctor() {
        name = "王老师";
        direction = "计算机";
        course = "使用JAVA语言理解程序逻辑";
        age = 5;
    }
    public String say() {
        String sum = "";
        sum = "姓名: " + name + "\t专业方向: " + direction + "\t教授课程: " + course + "\t教龄： " + age;
        return sum;
    }
}
