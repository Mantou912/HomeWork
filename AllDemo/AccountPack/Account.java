package HomeWork.AllDemo.AccountPack;

import java.util.Scanner;

public class Account {
    Scanner input = new Scanner(System.in);
    int cid;
    double balance;

    public String getInfo() {
        String sum = "";
        sum = "���ţ� " + cid + "\t�� " + balance;
        return sum;
    }

    public boolean withdraw() {
        System.out.print("������Ҫȡ������");
        double money = input.nextDouble();
        if (money < 0) {
            return false;
        }
        if (money > balance) {
            return false;
        } else {
            balance -= money;
            return true;
        }
    }

    public boolean save() {
        System.out.print("������Ҫ��Ľ�");
        double money = input.nextDouble();
        if (money < 0) {
            return false;
        }
        balance += money;
        return true;
    }
}
