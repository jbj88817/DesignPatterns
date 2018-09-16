package us.bojie.design.pattern.structural.bridge;

public class ICBCBank extends Bank {
    public ICBCBank(Account account) {
        super(account);
    }

    Account openAccount() {
        System.out.println("Opening ICBC account");
        account.openAccount();
        return account;
    }
}
