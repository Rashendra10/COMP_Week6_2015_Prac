public class BankAccount_22137233 {
    private double balance;
    private String accountNumber;
    private String accountHolderName;
    private double monthDeposits;
    private double monthWithdrawals;

    public BankAccount_22137233(double initialBalance, String accountHolderName) {
        validateBalance(initialBalance);
        this.balance = initialBalance;
        this.accountNumber = generateAccountNumber();
        this.accountHolderName = accountHolderName;
        this.monthDeposits = 0;
        this.monthWithdrawals = 0;
    }

    public BankAccount_22137233(double initialBalance) {
        this(initialBalance, null);
    }

    private void validateBalance(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            monthDeposits += amount; // Track monthly deposits
        } else {
            System.out.println("Invalid deposit amount. Must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            monthWithdrawals += amount; // Track monthly withdrawals
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getMonthDeposits() {
        return monthDeposits;
    }

    public double getMonthWithdrawals() {
        return monthWithdrawals;
    }

    private String generateAccountNumber() {
        return "ACC" + (int) (Math.random() * 1000000);
    }

    public boolean qualifiesForBonus() {
        return balance > 1000 && monthDeposits >= 200 && monthWithdrawals == 0;
    }

    public void resetMonthTransactions() {
        monthDeposits = 0;
        monthWithdrawals = 0;
    }
}
