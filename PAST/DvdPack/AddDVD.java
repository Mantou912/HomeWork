package HomeWork.PAST.DvdPack;

import java.util.Scanner;

public class AddDVD {
    public void add(Library library) {
        Scanner input = new Scanner(System.in);
        if (library.flag != library.full) {
            System.out.println("-->新增DVD");
            System.out.println("请输入DVD名称：");
            library.Name[library.flag] = input.next();
            library.Status[library.flag] = true;
            library.Time[library.flag] = 0;
            System.out.println("新增《" + library.Name[library.flag] + "》成功！");
            library.flag++;
        }
    }
}
