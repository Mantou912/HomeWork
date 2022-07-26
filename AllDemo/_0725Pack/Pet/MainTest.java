package HomeWork.AllDemo._0725Pack.Pet;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("欢迎来到宠物店！");
        System.out.print("请输入要领养的宠物名字：" + "\t");
        String Name = scanner.next();
        System.out.print("请选择要领养的宠物类型：（1、狗狗   2、企鹅）");

        int chs = scanner.nextInt();
        if (chs == 1) {
            Dog dog = new Dog(Name);
        } else {
            Penguin penguin = new Penguin(Name);
        }
    }
}
