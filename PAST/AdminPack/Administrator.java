package HomeWork.PAST.AdminPack;

import java.util.Scanner;

public class Administrator {
    Scanner input = new Scanner(System.in);
    String name;
    int psw;

    public Administrator() {
        System.out.print("�������û���: ");
        name = input.next();
        System.out.print("���������룺");
        psw = input.nextInt();
        System.out.println("ע��ɹ���\n");
    }

    public void change() {
        System.out.print("�������û���: ");
        String name = input.next();
        boolean flag = false;
        do {
            System.out.print("���������룺");
            int psw = input.nextInt();
            System.out.println();
            if (psw != this.psw) {
                System.out.println("�û��������벻ƥ�䣡��û�и�Ȩ�ޣ�");
            } else {
                flag = true;
            }
        } while (!flag);

        System.out.println("�����������룺");
        this.psw = input.nextInt();
        System.out.println("�޸�����ɹ���������Ϊ��" + psw);
    }
}
