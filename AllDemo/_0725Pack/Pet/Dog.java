package HomeWork.AllDemo._0725Pack.Pet;

import java.util.Scanner;

public class Dog {
    Scanner scanner = new Scanner(System.in);
    String Name;
    String Strain;
    int Health;
    int Love;

    public Dog(String Name) {
        this.Name = Name;
        System.out.print("��ѡ�񹷹���Ʒ��:��1����������������Ȯ    2������ѩ����" + "\t");
        int chs = scanner.nextInt();
        if (chs == 1) {
            Strain = "��������������Ȯ";
        } else {
            Strain = "����ѩ����";
        }
        System.out.print("�����빷���Ľ���ֵ" + "\t");
        Health = scanner.nextInt();
        if (!(Health > 0 && Health < 100)) {
            System.out.println("����ֵӦ��0~100��Ĭ��Ϊ60��");
            Health = 60;
        }
        Love = 20;
        print();
    }

    public void print() {
        System.out.println("�ҵ����ֽ�" + Name + ", ����ֵΪ" + Health + ", �����˵����ܶ���" + Love + ", ����һֻ" + Strain);
    }
}
