package activities.mock_exam.exam2.account;

public class CreditAccount extends Account{
    private double creditLimit;

    public CreditAccount(String accountNumber, double balance, double creditLimit) {
        super(accountNumber, balance);
        this.creditLimit = creditLimit;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

}
