package HomeWork.AllDemo.DvdPack;

import java.util.Scanner;

public class DVDS {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Welcome welcome = new Welcome();
        boolean flag = welcome.welcome();       //默认为true

        Library library = new Library();        //DVD信息
        StartPage startPage = new StartPage();  //欢迎页
        AddDVD addDVD = new AddDVD();           //1、新增DVD
        CheckDVD checkDVD = new CheckDVD();     //2、查看DVD
        DeleteDVD deleteDVD = new DeleteDVD();  //3、删除DVD
        LendDVD lendDVD = new LendDVD();        //4、借出DVD0
        ReturnDVD returnDVD = new ReturnDVD();  //5、归还DVD
        ExitDVD exitDVD = new ExitDVD();        //6、退出系统

        library.Name[0] = "猩球崛起";
        library.Status[0] = false;
        library.Date[0] = 15;
        library.Time[0] = 5;

        System.out.println("欢迎使用迷你DVD管理器");

        int chs;
        do {
            startPage.Welcome();
            System.out.print("请选择：");
            chs = input.nextInt();
            switch (chs) {
                case 0 -> exitDVD.exit();
                case 1 -> addDVD.add(library);
                case 2 -> checkDVD.check(library);
                case 3 -> deleteDVD.delete(library);
                case 4 -> lendDVD.lend(library);
                case 5 -> returnDVD.returnD(library);
            }
        } while (chs != 0);
    }
}