package us.bojie.design.pattern.structural.bridge;

public class DepositAccount implements Account {
    public Account openAccount() {
        System.out.println("Opening deposit account");
        return new DepositAccount();
    }

    public void showAccountType() {
        System.out.println("This is a deposit account");
    }
}
