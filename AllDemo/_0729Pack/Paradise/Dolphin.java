package HomeWork.AllDemo._0729Pack.Paradise;

import java.util.Scanner;

public class Dolphin extends Animal {
    Scanner scanner = new Scanner(System.in);

    public Dolphin(String name) {
        super(name);
    }

    public void Shout() {
        System.out.println("Wu~~~");
    }

    public void ChangeInfo() throws Exception {
        System.out.print("请输入豚子的名字：   ");
        super.setName(scanner.next());
    }
}
