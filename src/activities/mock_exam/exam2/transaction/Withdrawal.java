package activities.mock_exam.exam2.transaction;

import activities.mock_exam.exam2.account.Account;
import java.util.Date;


public class Withdrawal extends Transaction{
    public Withdrawal(Account account, double amount, Date date) {
        super(account, amount, date);
    }

    @Override
    public void execute() {
        double newBalance = getAccount().getBalance() - getAmount();
        if (newBalance < 0) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        getAccount().setBalance(newBalance);
    }

}
