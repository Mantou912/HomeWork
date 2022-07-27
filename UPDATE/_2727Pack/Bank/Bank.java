package HomeWork.UPDATE._2727Pack.Bank;

public class Bank {
    public Account openAccount(long id, String password, int type) {
        return switch (type) {
            case 1 -> new SavingAccount(1512056.05, "Lm815828", 0.04);
            case 2 -> new CreditAccount(1564945, "Lm828815", 545645646);
            default -> null;
        };
    }

    public double deposit(Account account, double amount) {
        account.setBalance(amount + account.getBalance());
        return account.getBalance();
    }

    public double withdraw(Account account, double amount) {
        if (account instanceof SavingAccount savingAccount) {
            if (account.getBalance() < amount) {
                System.out.println("½ð¶î²»×ã£¡");
            } else {
                account.setBalance(account.getBalance() - amount);
                return account.getBalance();
            }
        } else {
            CreditAccount creditAccount = (CreditAccount) account;
            creditAccount.setBalance(creditAccount.getBalance() + amount);
            return creditAccount.getCreditLine() - creditAccount.getBalance();
        }
        return 0;
    }
}
