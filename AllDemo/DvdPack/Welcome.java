package HomeWork.AllDemo.DvdPack;

import java.util.Scanner;

public class Welcome {

    String[] Id = new String[10];
    String[] Pw = new String[10];

    public boolean welcome() {
        Scanner input = new Scanner(System.in);
        System.out.print("«Î ‰»Î’À∫≈£∫");
        String id = input.next();
        String pw;
        boolean flag = false;
        for (int i = 0; i < Id.length; i++) {
            if (id.equals(Id[i])) {
                boolean flag2 = false;
                do {
                    System.out.print("«Î ‰»Î√‹¬Î£∫");
                    pw = input.next();
                    if (pw.equals(Pw[i])) {
                        return true;
                    } else {
                        System.out.print("√‹¬Î¥ÌŒÛ£¨«Î÷ÿ–¬ ‰»Î£∫");
                    }
                } while (!flag2);
            }
        }
        if (!flag) {
            System.out.print("ƒ˙√ª”–’À∫≈£¨«Î ‰»Î“™◊¢≤·µƒ’À∫≈√˚£∫");
            for (int i = 0; i < Id.length; i++) {
                if (Id[i] == null) {
                    Id[i] = input.next();
                    System.out.print(" ‰»Î◊¢≤·÷–’À∫≈µƒ√‹¬Î£¨«Î¿Œº«£∫");
                    Pw[i] = input.next();
                    return true;
                }
            }
        }
        return true;
    }
}