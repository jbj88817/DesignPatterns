package us.bojie.design.pattern.structural.bridge;

public class SavingAccount implements Account {
    public Account openAccount() {
        System.out.println("Opening saving account");
        return new SavingAccount();
    }

    public void showAccountType() {
        System.out.println("This is a saving account");
    }
}
