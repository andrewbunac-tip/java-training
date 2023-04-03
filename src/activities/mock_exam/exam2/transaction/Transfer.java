package activities.mock_exam.exam2.transaction;

import activities.mock_exam.exam2.account.Account;
import java.util.Date;


public class Transfer extends Transaction{
    private Account toAccount;

    public Transfer(Account fromAccount, Account toAccount, double amount, Date date) {
        super(fromAccount, amount, date);
        this.toAccount = toAccount;
    }

    public Account getToAccount() {
        return toAccount;
    }

    public void setToAccount(Account toAccount) {
        this.toAccount = toAccount;
    }

    @Override
    public void execute() {
        double newFromBalance = getAccount().getBalance() - getAmount();
        if (newFromBalance < 0) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        getAccount().setBalance(newFromBalance);
        getToAccount().setBalance(getToAccount().getBalance() + getAmount());
    }


}
