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
        System.out.print("���������ӵ����֣�   ");
        super.setName(scanner.next());
    }
}
