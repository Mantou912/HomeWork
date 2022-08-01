package HomeWork.AllDemo._0729Pack.Paradise;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Animal[] animals = new Animal[3];
        animals[0] = new Cat("狗", 4);
        animals[1] = new Duck("鹅", 2);
        animals[2] = new Dolphin("鲨鱼");
        for (Animal animal : animals
        ) {
            int flag = 0;
            if (animal instanceof Cat)
                flag = 1;
            else if (animal instanceof Duck)
                flag = 2;
            switch (flag) {
                case 0 -> {
                    Dolphin dolphin = (Dolphin) animal;
                    System.out.print("0" + "\t\t");
                }
                case 1 -> {
                    Cat cat = (Cat) animal;
                    System.out.print(cat.getLegNum() + "\t\t");
                }
                case 2 -> {
                    Duck duck = (Duck) animal;
                    System.out.print(duck.getLegNum() + "\t\t");
                }
            }
            System.out.print(animal.getName() + "\t\t");
            animal.Shout();
        }
        System.out.println("是否继续修改数据（0：修改   Else:退出 ）：");
        int flag = scanner.nextInt();
        if (flag == 0) {
            System.out.println("1：猫子 2：鸭子 3：豚子");
            flag = scanner.nextInt();
            switch (flag) {
                case 1 -> {
                    Cat cat = (Cat) animals[0];
                    cat.ChangeInfo();
                }
                case 2 -> {
                    Duck duck = (Duck) animals[1];
                    duck.ChangeInfo();
                }
                case 3 -> {
                    Dolphin Dolphin = (Dolphin) animals[2];
                    Dolphin.ChangeInfo();
                }
            }
        }
    }
}
