package HomeWork.UPTODATE;

import java.util.Scanner;

public class Address {
    Scanner scanner = new Scanner(System.in);
    String address;             //��ַ
    String zipCode;             //�ʱ�
    public Address() {
        System.out.print("�������ַ�� ");
        this.address = scanner.next();
        System.out.print("�������ʱࣺ ");
        this.zipCode = scanner.next();
    }

    public Address(String address, String zipCode) {
        this.address = address;
        this.zipCode = zipCode;
    }
}
