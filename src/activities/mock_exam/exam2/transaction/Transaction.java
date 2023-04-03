package activities.mock_exam.exam2.transaction;

import activities.mock_exam.exam2.account.Account;
import java.util.Date;




public abstract class Transaction {
    private Account account;
    private double amount;
    private Date date;

    public Transaction(Account account, double amount, Date date) {
        this.account = account;
        this.amount = amount;
        this.date = date;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract void execute();

}
