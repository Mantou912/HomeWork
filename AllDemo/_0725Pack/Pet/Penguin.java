package HomeWork.AllDemo._0725Pack.Pet;

import java.util.Scanner;

public class Penguin {
    Scanner scanner = new Scanner(System.in);
    String Name;
    String Sex;
    int Health;
    int Love;

    public Penguin(String Name) {
        this.Name = Name;
        System.out.print("请选择企鹅的性别:（1、Q 仔    2、Q 妹）" + "\t");
        int chs = scanner.nextInt();
        if (chs == 1) {
            Sex = "雄";
        } else {
            Sex = "雌";
        }

        Health = 100;
        Love = 20;
        print();
    }

    public void print() {
        System.out.println("宠物的自白：");
        System.out.println("我的名字叫" + Name + ", 健康值为" + Health + ", 和主人的亲密度是" + Love + ", 性别是" + Sex);
    }
}
