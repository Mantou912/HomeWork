package HomeWork.AllDemo._0729Pack.Paradise;

import java.util.Scanner;

public class Cat extends Animal implements Terrestrial {
    Scanner scanner = new Scanner(System.in);
    private int LegNum;

    public Cat(String name, int legNum) {
        super(name);
        LegNum = legNum;
    }

    public int getLegNum() {
        return LegNum;
    }

    public void setLegNum(int legNum) {
        LegNum = legNum;
    }

    public void Shout() {
        System.out.println("Mia~~~");
    }

    public void ChangeInfo() throws Exception {
        System.out.print("请输入猫子的名字：   ");
        super.setName(scanner.next());
        System.out.print("请输入猫子的腿数：   ");
        int LegNum = scanner.nextInt();
        if (LegNum != 2)
            throw new Exception("猫子只有4条腿");
        else
            setLegNum(LegNum);
    }
}
