package HomeWork.AllDemo.EatPack;

import java.util.Scanner;

public class MainSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("欢迎使用”吃货联盟订餐系统“");
        StartPage hh = new StartPage();         //起始菜单页面
        ExitSystem ex = new ExitSystem();       //0、退出系统
        PlaceOrder dc = new PlaceOrder();       //1、我要订餐
        CheckOrder ck = new CheckOrder();       //2、查看餐袋
        SignOff qs = new SignOff();             //3、签收订单
        DeleteOrder del = new DeleteOrder();    //4、删除订单
        GiveLike cli = new GiveLike();          //5、我要点赞

        Information[] cl = new Information[4];

        for (int i = 0; i < cl.length; i++) {
            cl[i] = new Information();
        }

        cl[0].setName("123");
        cl[0].setDishMegs("鱼香肉丝");
        cl[0].setNum(1);
        cl[0].setTimes(10);
        cl[0].setAddresses("China");
        cl[0].setStatus(1);                     //0代表已完成，1代表已预定
        cl[0].setSumPrices(120.0);
        Menu ds = new Menu();

        int chs;
        do {
            hh.Welcome();
            System.out.print("请选择：");
            chs = input.nextInt();
            switch (chs) {
                case 0 -> ex.exit();
                case 1 -> dc.choose(cl, ds);
                case 2 -> ck.check(cl);
                case 3 -> qs.confirm(cl);
                case 4 -> del.delete(cl);
                case 5 -> cli.click(ds);
            }
        } while (chs != 0);
    }
}
