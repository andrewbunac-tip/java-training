package activities.mock_exam.exam2.transaction;

import activities.mock_exam.exam2.account.Account;
import java.util.Date;



public class Deposit extends Transaction{
    public Deposit(Account account, double amount, Date date) {
        super(account, amount, date);
    }

    @Override
    public void execute() {
        getAccount().setBalance(getAccount().getBalance() + getAmount());
    }

}
