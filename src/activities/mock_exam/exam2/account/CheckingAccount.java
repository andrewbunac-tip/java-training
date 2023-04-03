package activities.mock_exam.exam2.account;

public class CheckingAccount extends Account{
    private double minimumBalance;

    public CheckingAccount(String accountNumber, double balance, double minimumBalance) {
        super(accountNumber, balance);
        this.minimumBalance = minimumBalance;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

}
