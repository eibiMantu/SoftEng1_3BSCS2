public class savingsAccount implements bankAccount {
    private String accountNumber;
    private String accountName;
    private double balance;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = String.valueOf(accountNumber);
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String showAccountType() {
        return "Savings Account";
    }

    @Override
    public double getInterestRate() {
        return 0.01;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public String showBenefits() {
        return "Standard Savings Account";
    }

    @Override
    public double computeBalanceWithInterest() {
        return balance + (balance * getInterestRate());
    }

    @Override
    public String showInfo() {
        return "Account number: " + accountNumber + "\n" +
               "Account name: " + accountName + "\n" +
               "Balance: " + balance;
    }
}