/**
 * Created by paul on 14/02/2017.
 */

class Account
{
    private String name;

    private long amount;

    Account(String name, long amount)
    {
        this.name = name;
        setAmount(amount);
    }

    // super("savings", amount);
    void deposit(long amount)
    {
        this.amount += amount;
    }

    String getName()
    {
        return name;
    }

    long getAmount()
    {
        return amount;
    }

    void setAmount(long amount)
    {
        this.amount = amount;
    }
}

class SavingsAccount extends Account
{
    SavingsAccount(long amount)
    {
        super("savings", amount);    // why "savings"?  temp to David
    }
}


class CheckingAccount extends Account
{
    CheckingAccount(long amount)
    {
        super("checking", amount);
    }

    void withdraw(long amount)
    {
        setAmount(getAmount() - amount);
    }
}

public class Main
{
    public static void main(String[] args)
    {
        SavingsAccount sa = new SavingsAccount(10000);
        System.out.println("account name: " + sa.getName());
        System.out.println("initial amount: " + sa.getAmount());
        sa.deposit(5000);
        System.out.println("new amount after deposit: " + sa.getAmount());

        CheckingAccount ca = new CheckingAccount(20000);
        System.out.println("account name: " + ca.getName());
        System.out.println("initial amount: " + ca.getAmount());
        ca.deposit(6000);
        System.out.println("new amount after deposit: " + ca.getAmount());
        ca.withdraw(3000);
        System.out.println("new amount after withdrawal: " + ca.getAmount());
    }
}