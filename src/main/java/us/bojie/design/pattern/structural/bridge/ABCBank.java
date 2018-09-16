package us.bojie.design.pattern.structural.bridge;

public class ABCBank extends Bank {
    public ABCBank(Account account) {
        super(account);
    }

    Account openAccount() {
        System.out.println("Opening ABC account");
        account.openAccount();
        return account;
    }
}
