package HomeWork.AllDemo.AccountPack;

public class Customer {
    String name;
    int Id;
    int Tel;
    String address;

    Account account = new Account();

    public Customer() {

        name = "������";
        Id = 100011;
        Tel = 1100123;
        address = "China";
        account.cid = 11111222;
        account.balance = 521225.2;

    }

    public String say() {
        String sum = "";
        sum = "����: " + name + "\t����˺�: " + Id + "\t�绰: " + Tel + "\t��ַ: " + address + "\t��" + account.balance;
        return sum;
    }
}
