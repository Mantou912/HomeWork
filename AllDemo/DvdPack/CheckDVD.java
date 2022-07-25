package HomeWork.AllDemo.DvdPack;

import java.util.Scanner;

public class CheckDVD {
    public void check(Library library) {
        Scanner input = new Scanner(System.in);
        System.out.println("-->查看DVD");
        System.out.println("序号\tName\tStatus\tDate\tTime");
        for (int i = 0; i < library.flag; i++) {
            System.out.print(i + 1 + "\t");
            System.out.print(library.Name[i] + "\t");
            if (library.Status[i]) {
                System.out.print("可借  \t");
            } else {
                System.out.print("已借出\t");
            }
            System.out.print(library.Date[i] + "日 \t");
            System.out.print(library.Time[i] + "次 \t\n");
        }
    }
}