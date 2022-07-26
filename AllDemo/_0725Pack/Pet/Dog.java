package HomeWork.AllDemo._0725Pack.Pet;

import java.util.Scanner;

public class Dog {
    Scanner scanner = new Scanner(System.in);
    String Name;
    String Strain;
    int Health;
    int Love;

    public Dog(String Name) {
        this.Name = Name;
        System.out.print("请选择狗狗的品种:（1、聪明的拉布拉多犬    2、酷酷的雪纳瑞）" + "\t");
        int chs = scanner.nextInt();
        if (chs == 1) {
            Strain = "聪明的拉布拉多犬";
        } else {
            Strain = "酷酷的雪纳瑞";
        }
        System.out.print("请输入狗狗的健康值" + "\t");
        Health = scanner.nextInt();
        if (!(Health > 0 && Health < 100)) {
            System.out.println("健康值应在0~100，默认为60！");
            Health = 60;
        }
        Love = 20;
        print();
    }

    public void print() {
        System.out.println("我的名字叫" + Name + ", 健康值为" + Health + ", 和主人的亲密度是" + Love + ", 我是一只" + Strain);
    }
}
