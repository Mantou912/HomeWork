package HomeWork.AllDemo.AccountPack;

public class Customer {
    String name;
    int Id;
    int Tel;
    String address;

    Account account = new Account();

    public Customer() {

        name = "张麻子";
        Id = 100011;
        Tel = 1100123;
        address = "China";
        account.cid = 11111222;
        account.balance = 521225.2;

    }

    public String say() {
        String sum = "";
        sum = "姓名: " + name + "\t身份账号: " + Id + "\t电话: " + Tel + "\t地址: " + address + "\t余额：" + account.balance;
        return sum;
    }
}
