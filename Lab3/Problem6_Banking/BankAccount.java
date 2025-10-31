public class BankAccount {
    private static int totalAccounts = 0;

    private int accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(int accountNumber, String holderName, double openingBalance){
        // TODO: initialize fields, increment totalAccounts
        // throw new UnsupportedOperationException("TODO");
                if(openingBalance < 0) throw new IllegalArgumentException("Opening balance cannot be negative");
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = openingBalance;
        totalAccounts++;

    }

    public void deposit(double amount){
        // TODO: positive only
        // throw new UnsupportedOperationException("TODO");
        if(amount < 0) throw new IllegalArgumentException("Deposit must be positive");
        balance += amount;
    }

    public boolean withdraw(double amount){
        // TODO: positive and <= balance
        // throw new UnsupportedOperationException("TODO");
        if(amount < 0) throw new IllegalArgumentException("Withdrawal must be positive");
        if(amount > balance) return false;
        balance -= amount;
        return true;
    }

    public boolean transferTo(BankAccount other, double amount){
        // TODO: withdraw from this and deposit to other atomically
        // throw new UnsupportedOperationException("TODO");
        if(amount < 0) throw new IllegalArgumentException("Transfer must be positive");
        if(this.withdraw(amount)){
            other.deposit(amount);
            return true;
        }
        return false;
    }

    public static int getTotalAccounts(){ return totalAccounts; }
    public double getBalance(){ return balance; }
}
