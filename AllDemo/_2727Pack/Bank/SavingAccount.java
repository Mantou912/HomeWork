package HomeWork.AllDemo._2727Pack.Bank;

import java.util.Scanner;

public class SavingAccount extends Account {
    Scanner scanner = new Scanner(System.in);
    private double InterestRate;

    public SavingAccount(double balance, String passWord, double interestRate) {
        super(balance, passWord);
        InterestRate = interestRate;
    }

    public double getInterestRate() {
        return InterestRate;
    }

    public void setInterestRate(double interestRate) {
        while (interestRate <= 0 || interestRate >= 0.1) {
            System.out.print("请重新输入利率（0~0.1）：");
            interestRate = scanner.nextDouble();
        }
        InterestRate = interestRate;
    }
}
