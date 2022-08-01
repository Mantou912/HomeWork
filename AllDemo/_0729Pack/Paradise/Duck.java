package HomeWork.AllDemo._0729Pack.Paradise;

import java.util.Scanner;

public class Duck extends Animal implements Terrestrial {
    Scanner scanner = new Scanner(System.in);
    private int LegNum;

    public int getLegNum() {
        return LegNum;
    }

    public void setLegNum(int legNum) {
        LegNum = legNum;
    }

    public Duck(String name, int legNum) {
        super(name);
        LegNum = legNum;
    }

    public void Shout() {
        System.out.println("GaGa~~~");
    }

    public void ChangeInfo() throws Exception {
        System.out.print("������Ѽ�ӵ����֣�   ");
        super.setName(scanner.next());
        System.out.print("������Ѽ�ӵ�������   ");
        int LegNum = scanner.nextInt();
        if (LegNum != 2)
            throw new Exception("Ѽ��ֻ��������");
        else
            setLegNum(LegNum);
    }

}
