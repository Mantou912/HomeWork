package HomeWork.AllDemo._0725Pack.Pet;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("��ӭ��������꣡");
        System.out.print("������Ҫ�����ĳ������֣�" + "\t");
        String Name = scanner.next();
        System.out.print("��ѡ��Ҫ�����ĳ������ͣ���1������   2����죩");

        int chs = scanner.nextInt();
        if (chs == 1) {
            Dog dog = new Dog(Name);
        } else {
            Penguin penguin = new Penguin(Name);
        }
    }
}
