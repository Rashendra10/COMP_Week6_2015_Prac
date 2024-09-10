public class BankAccountDemo_22137233 {
    public static void main(String[] args) {
        // Create a BankAccount with an initial balance and account holder's name
        BankAccount_22137233 firstAccount = new BankAccount_22137233(1000.0, "Alice Johnson");

        // Show account details
        System.out.println("First Account Info:");
        System.out.println("Account Number: " + firstAccount.getAccountNumber());
        System.out.println("Account Holder: " + firstAccount.getAccountHolderName());
        System.out.println("Initial Balance: $" + firstAccount.getBalance());

        // Perform deposit operation
        firstAccount.deposit(400.0);
        System.out.println("After depositing $400: $" + firstAccount.getBalance());

        // Perform withdrawal operation
        firstAccount.withdraw(150.0);
        System.out.println("After withdrawing $150: $" + firstAccount.getBalance());

        // Create another BankAccount with only an initial balance
        BankAccount_22137233 secondAccount = new BankAccount_22137233(600.0);

        // Display second account's details
        System.out.println("\nSecond Account Info:");
        System.out.println("Account Number: " + secondAccount.getAccountNumber());
        System.out.println("Account Holder: " + secondAccount.getAccountHolderName());
        System.out.println("Initial Balance: $" + secondAccount.getBalance());

        //withdrawing more than the balance
        secondAccount.withdraw(700.0);
        System.out.println("After attempting to withdraw $700: $" + secondAccount.getBalance());
    }
}
