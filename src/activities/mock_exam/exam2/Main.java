package activities.mock_exam.exam2;

import activities.mock_exam.exam2.account.CheckingAccount;
import activities.mock_exam.exam2.account.CreditAccount;
import activities.mock_exam.exam2.account.SavingsAccount;
import activities.mock_exam.exam2.transaction.CreditAccountTransaction;
import activities.mock_exam.exam2.transaction.Deposit;
import activities.mock_exam.exam2.transaction.Transfer;
import activities.mock_exam.exam2.transaction.Withdrawal;
import java.util.Date;



/**
 * In this example, we create instances of CheckingAccount, SavingsAccount, and CreditAccount, and perform various transactions such as deposits, withdrawals, and transfers between accounts. We also create a subclass of Transaction called CreditAccountTransaction to model a credit account transaction that reduces the balance of a credit account. Finally, we print out the balances of each account after the transactions have been executed.
 */
public class Main {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount("123", 1000.0, 100.0);
        SavingsAccount savingsAccount = new SavingsAccount("456", 5000.0, 0.05);
        CreditAccount creditAccount = new CreditAccount("789", 500.0, 1000.0);

        Deposit deposit = new Deposit(checkingAccount, 500.0, new Date());
        deposit.execute();
        System.out.println("Checking account balance after deposit: " + checkingAccount.getBalance());

        Withdrawal withdrawal = new Withdrawal(checkingAccount, 200.0, new Date());
        withdrawal.execute();
        System.out.println("Checking account balance after withdrawal: " + checkingAccount.getBalance());

        Transfer transfer = new Transfer(savingsAccount, checkingAccount, 1000.0, new Date());
        transfer.execute();
        System.out.println("Savings account balance after transfer: " + savingsAccount.getBalance());
        System.out.println("Checking account balance after transfer: " + checkingAccount.getBalance());

        try {
            Withdrawal invalidWithdrawal = new Withdrawal(checkingAccount, 1000.0, new Date());
            invalidWithdrawal.execute();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        CreditAccountTransaction creditAccountTransaction = new CreditAccountTransaction(creditAccount, 200.0, new Date());
        creditAccountTransaction.execute();
        System.out.println("Credit account balance after transaction: " + creditAccount.getBalance());
    }
}
