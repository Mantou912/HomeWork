package HomeWork.AllDemo.DvdPack;

import java.util.Scanner;

public class DeleteDVD {
    public void delete(Library library) {
        Scanner input = new Scanner(System.in);
        System.out.println("-->删除DVD");
        System.out.print("请输入要删除的DVD序号:");
        int flag = input.nextInt();
        if (flag > library.flag) {
            System.out.println("没有该DVD");
        } else if (!library.Status[flag - 1]) {
            System.out.println("该DVD已借出，不可删除");
        } else {
            for (int i = flag - 1; i < library.flag; i++) {
                library.Name[i] = library.Name[i + 1];
                library.Status[i] = library.Status[i + 1];
                library.Date[i] = library.Date[i + 1];
                library.Time[i] = library.Time[i + 1];
            }
            library.flag--;
            System.out.println("已删除");
        }
    }
}