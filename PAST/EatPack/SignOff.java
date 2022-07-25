package HomeWork.PAST.EatPack;

import java.util.Scanner;

public class SignOff {
    public void confirm(Information[] client) {
        Scanner input = new Scanner(System.in);
        System.out.println("***签收订单***");
        System.out.print("请输入需要签收的订单序号：");
        int flag = input.nextInt();
        boolean idFind = false;
        if (client[flag - 1].name != null && client[flag - 1].status == 1) {
            idFind = true;
            client[flag - 1].status = 0;
            System.out.println("***签收完成***");
        } else if (client[flag - 1].name != null && client[flag - 1].status == 0) {
            idFind = true;
            System.out.println("!!已经签收不可重复签收!!");
        }
        if (!idFind) {
            System.out.println("!!不好意思 没找到您需要签收的订单!!");
        }
        System.out.println("************");
    }
}
