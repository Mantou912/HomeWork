package HomeWork.PAST.AdminPack;

import java.util.Scanner;

public class Administrator {
    Scanner input = new Scanner(System.in);
    String name;
    int psw;

    public Administrator() {
        System.out.print("请输入用户名: ");
        name = input.next();
        System.out.print("请输入密码：");
        psw = input.nextInt();
        System.out.println("注册成功！\n");
    }

    public void change() {
        System.out.print("请输入用户名: ");
        String name = input.next();
        boolean flag = false;
        do {
            System.out.print("请输入密码：");
            int psw = input.nextInt();
            System.out.println();
            if (psw != this.psw) {
                System.out.println("用户名与密码不匹配！您没有该权限！");
            } else {
                flag = true;
            }
        } while (!flag);

        System.out.println("请输入新密码：");
        this.psw = input.nextInt();
        System.out.println("修改密码成功，新密码为：" + psw);
    }
}
