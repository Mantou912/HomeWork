package HomeWork.UPTODATE;

import java.util.Scanner;

public class Address {
    Scanner scanner = new Scanner(System.in);
    String address;             //µÿ÷∑
    String zipCode;             //” ±‡
    public Address() {
        System.out.print("«Î ‰»Îµÿ÷∑£∫ ");
        this.address = scanner.next();
        System.out.print("«Î ‰»Î” ±‡£∫ ");
        this.zipCode = scanner.next();
    }

    public Address(String address, String zipCode) {
        this.address = address;
        this.zipCode = zipCode;
    }
}
