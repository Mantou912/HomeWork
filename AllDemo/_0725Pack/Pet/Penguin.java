package HomeWork.AllDemo._0725Pack.Pet;

import java.util.Scanner;

public class Penguin {
    Scanner scanner = new Scanner(System.in);
    String Name;
    String Sex;
    int Health;
    int Love;

    public Penguin(String Name) {
        this.Name = Name;
        System.out.print("��ѡ�������Ա�:��1��Q ��    2��Q �ã�" + "\t");
        int chs = scanner.nextInt();
        if (chs == 1) {
            Sex = "��";
        } else {
            Sex = "��";
        }

        Health = 100;
        Love = 20;
        print();
    }

    public void print() {
        System.out.println("������԰ף�");
        System.out.println("�ҵ����ֽ�" + Name + ", ����ֵΪ" + Health + ", �����˵����ܶ���" + Love + ", �Ա���" + Sex);
    }
}
