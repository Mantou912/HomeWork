package HomeWork.AllDemo.AccountPack;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Customer customer = new Customer();

        customer.account.save();

        if (customer.account.withdraw()) {
            System.out.println("�����ɹ�");
            System.out.println(customer.say());
        } else {
            System.out.println("���㣡");
            System.out.println(customer.say());
        }
    }
}
