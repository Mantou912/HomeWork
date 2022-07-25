package HomeWork.PAST.EatPack;

import java.util.Scanner;

public class PlaceOrder {
    Scanner input = new Scanner(System.in);

    public void choose(Information[] client, Menu ds) {

        for (int i = 0; i < client.length; i++) {
            if (client[i].name == null) {
                System.out.println("***我要订餐***");
                System.out.print("请输入订餐人姓名：");
                client[i].setName(input.next());

                System.out.println("序号\t菜品\t\t\t单价(元)\t点赞数");
                for (int j = 0; j < ds.dishMeg.length; j++) {
                    System.out.println((j + 1) + "\t" + ds.dishMeg[j] + "\t" + ds.price[j] + "\t" + ds.zan[j]);
                }

                System.out.print("选择菜品编号：");
                int num = input.nextInt();
                while (num >= ds.dishMeg.length) {
                    System.out.println("请选择菜单中已有的菜品编号");
                    num = input.nextInt();
                }

                String dish = ds.dishMeg[num - 1];
                System.out.print("份数：");
                int fen = input.nextInt();
                double pri = ds.price[num - 1] * fen;
                double p = pri > 50 ? 0 : 5;

                System.out.print("送餐时间（10~20点）:");
                int time = input.nextInt();
                while (time < 10 || time > 20) {
                    System.out.print("sorry,不在送餐时间内，重新输入：");
                    time = input.nextInt();
                }
                System.out.print("地址：");
                String address = input.next();
                System.out.println("***订餐成功***");
                System.out.println("您订的是：" + dish + fen + "份" + "\t" + "送餐时间是：" + time + "点\t" + "餐费是：" + pri + "元  送餐费是：" + p + "元  总计：" + (pri + p) + "元");

                client[i].setDishMegs(dish);
                client[i].setTimes(time);
                client[i].setStatus(1);
                client[i].setAddresses(address);
                client[i].setSumPrices(pri + p);
                break;
            } else if (i == client.length - 1) {
                System.out.println("不好意思，餐袋已满");
            }
        }
        System.out.println("************");
    }
}
