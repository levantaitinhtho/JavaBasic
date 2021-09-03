package bankmanagement;

// chứa thông tin của account
//final : interest: float = 0.035
//        +  ID : long
//        + accountName: String
//        + amount: double
//
//        Constructor( 2), Constructor: So tai khoan, ten tai khoan . Amount = 50000
//        Get/Set
//        toString: String
//


import java.util.Objects;

public class Account {
    public static final float INTEREST = 0.035f;

    private long ID;
    private String accountName;
    private double amount;

    public Account(long ID, String accountName, double amount) {
        this.ID = ID;
        this.accountName = accountName;
        this.amount = amount;
    }

    public Account() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return ID == account.ID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID);
    }

    public Account(long ID, String accountName) {
        this.accountName = accountName;
        this.ID = ID;
        this.amount = 50000;
    }
    public void addMoney(double amountMoney) {
        this.amount  += amountMoney;
    }

    public void withdraw(double amountWithdraw) {
            this.amount -= amountWithdraw;
    }

    public void expires() {
        this.amount = this.amount + this.amount * INTEREST;
    }

    public void transfer(double amount, Account account ) {
        this.amount = this.amount - amount;
        double newAmount = account.getAmount() + amount;
        account.setAmount(newAmount);
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String toString() {
        return "[ID: " + ID + ", accountName: "  + accountName + ", amount: " + amount + "]";

    }
}
