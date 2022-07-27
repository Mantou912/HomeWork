package HomeWork.UPDATE._2727Pack.Bank;

public class CreditAccount extends Account {
    private double CreditLine;

    public CreditAccount(long id, double balance, String passWord, double creditLine) {
        super(id, balance, passWord);
        CreditLine = creditLine;
    }

    public double getCreditLine() {
        return CreditLine;
    }

    public void setCreditLine(double creditLine) {
        CreditLine = creditLine;
    }
}
