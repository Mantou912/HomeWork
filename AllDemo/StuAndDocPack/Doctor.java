package HomeWork.AllDemo.StuAndDocPack;

import java.util.Scanner;

public class Doctor {
    Scanner input = new Scanner(System.in);
    String name;
    String direction;
    int age;
    String course;

    public Doctor() {
        name = "����ʦ";
        direction = "�����";
        course = "ʹ��JAVA�����������߼�";
        age = 5;
    }
    public String say() {
        String sum = "";
        sum = "����: " + name + "\tרҵ����: " + direction + "\t���ڿγ�: " + course + "\t���䣺 " + age;
        return sum;
    }
}
