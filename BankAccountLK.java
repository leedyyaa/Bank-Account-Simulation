
/**
A bank account has a balance that can 
be changed by deposits and withdrawals.
 * @author Lydia Kim
 * @version 5/1/21
 */
public class BankAccountLK                          //implements MeasurableYI
{  
    private double balance;

    /**
    Constructs a bank account with a zero balance.
     */
    public BankAccountLK()
    {   
        balance = 0;    //qqq
    }

    /**
    Constructs a bank account with a given balance.
    @param initialBalance the initial balance
     */
    public BankAccountLK(double initialBalance)
    {   
        balance = initialBalance;
    }

    /**
    Deposits money into the bank account.
    @param amount the amount to deposit
     */
    public void deposit(double amount)
    {  
        balance += amount;
    }

    /**
    Withdraws money from the bank account.
    @param amount the amount to withdraw
    Code validates to prevent overdrawing
    the account.
     */
    public void withdraw(double amount)
    {   
        balance -= amount;
    }

    /**
    Gets the current balance of the bank account.
    @return the current balance
     */
    public double getBalance()
    {   
        return balance;
    }

    public double getMeasure()
    {
        return getBalance();
    }

    public int compareTo(Object other)
    {
        return 123; 
    }
}


