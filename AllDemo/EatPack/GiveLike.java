package HomeWork.AllDemo.EatPack;

import java.util.Scanner;

public class GiveLike {

    Scanner input = new Scanner(System.in);

    public void click(Menu ds) {
        System.out.println("序号\t菜品\t\t\t单价(元)\t点赞数");
        for (int j = 0; j < ds.dishMeg.length; j++) {
            System.out.println((j + 1) + "\t" + ds.dishMeg[j] + "\t" + ds.price[j] + "\t" + ds.zan[j]);
        }
        System.out.print("请选择您要点赞的菜品序号:");
        int flag = input.nextInt();
        ds.zan[flag - 1]++;
        System.out.println("点赞成功！");
        System.out.println("序号\t菜品\t\t\t单价(元)\t点赞数");
        for (int j = 0; j < ds.dishMeg.length; j++) {
            System.out.println((j + 1) + "\t" + ds.dishMeg[j] + "\t" + ds.price[j] + "\t" + ds.zan[j]);
        }
    }
}
