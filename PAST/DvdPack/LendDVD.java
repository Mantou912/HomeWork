package HomeWork.PAST.DvdPack;

import java.util.Scanner;

public class LendDVD {
    public void lend(Library library) {
        Scanner input = new Scanner(System.in);
        System.out.println("-->借出DVD");
        System.out.println("请输入您要借的DVD序号");
        int flag = -1;
        do {
            int judge = input.nextInt();
            if (judge > library.flag) {
                System.out.println("没有该DVD，请重新输入");
                continue;
            } else if (!library.Status[judge - 1]) {
                System.out.println("该DVD已被借出");
            } else {
                System.out.println("请输入借出日期");
                flag = input.nextInt();
                if (flag > 31 || flag < 1) {
                    System.out.println("日期不规范，请重新输入");
                } else {
                    library.Date[judge - 1] = flag;
                    library.Status[judge - 1] = false;
                    library.Time[judge - 1]++;
                }
            }
        } while (flag > 31 || flag < 1);
    }
}

