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
        System.out.print("������è�ӵ����֣�   ");
        super.setName(scanner.next());
        System.out.print("������è�ӵ�������   ");
        int LegNum = scanner.nextInt();
        if (LegNum != 2)
            throw new Exception("è��ֻ��4����");
        else
            setLegNum(LegNum);
    }
}
