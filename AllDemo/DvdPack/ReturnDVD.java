package HomeWork.AllDemo.DvdPack;

import java.util.Scanner;

public class ReturnDVD {
    public void returnD(Library library) {
        Scanner input = new Scanner(System.in);
        System.out.println("-->归还DVD");
        System.out.println("请输入归还的DVD序号");
        int flag = input.nextInt();
        if (flag > library.flag) {
            System.out.println("您归还的DVD不属于本系统");
        } else if (library.Status[flag - 1]) {
            System.out.println("当前DVD在系统中，请勿重复归还");
        } else {
            System.out.println("请输入归还日期");
            int judge;
            boolean ff = false;
            do {
                judge = input.nextInt();
                if (judge > 31 || judge < library.Date[flag - 1]) {
                    System.out.println("输入日期不规范，请重新输入");
                } else {
                    judge -= library.Date[flag - 1];
                    library.Status[flag - 1] = true;
                    System.out.println("请支付" + judge + "元");
                    ff = true;
                }
            } while (!ff);
            System.out.println("归还成功！");
        }
    }
}