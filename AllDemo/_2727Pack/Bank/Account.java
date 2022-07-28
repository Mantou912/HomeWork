package HomeWork.AllDemo._2727Pack.Bank;

public class Account {
    static private long ID = 100001;
    private final long Id;
    private double Balance;
    private String PassWord;

    public Account(double balance, String passWord) {
        Id = ID++;
        Balance = balance;
        PassWord = passWord;
    }


    public long getId() {
        return Id;
    }

    public double getBalance() {
        return Balance;
    }

    public String getPassWord() {
        return null;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public void setPassWord(String passWord) {

        if (passWord.length() != 6)
            System.out.print("–¬√‹¬Î∏Ò Ω¥ÌŒÛ£°");
        else {
            PassWord = passWord;
        }

    }
}
