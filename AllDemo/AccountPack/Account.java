package HomeWork.AllDemo.AccountPack;

import java.util.Scanner;

public class Account {
    Scanner input = new Scanner(System.in);
    int cid;
    double balance;

    public String getInfo() {
        String sum = "";
        sum = "卡号： " + cid + "\t余额： " + balance;
        return sum;
    }

    public boolean withdraw() {
        System.out.print("请输入要取出的余额：");
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
        System.out.print("请输入要存的金额：");
        double money = input.nextDouble();
        if (money < 0) {
            return false;
        }
        balance += money;
        return true;
    }
}
