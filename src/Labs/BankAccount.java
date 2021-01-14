package Labs;

public class BankAccount
{
    private String accName;
    private static int accNumber=1000;
    private double balance;

    public BankAccount(String name,double initBalance)
    {
        this.accName=name;
       // this.accNumber=accNumber;
        accNumber++;
        this.balance=initBalance;
    }
    public BankAccount(String name)
    {
        this.accName=name;
        this.balance=0.0;
        //this.accNumber=accNumber;
        accNumber++;
    }
    public void withdraw(int bal)
    {
        if(balance <=bal)
        {
            System.out.println("You don't have enough money to withdraw");
        }
        else
        {
            balance=balance-bal;
        }

    }
    public void withdraw(int bal,double fee)
    {
        if(balance <=bal+fee)
        {
            System.out.println("You don't have enough money to withdraw");
        }
        else
        {
            balance=balance-bal-fee;
        }

    }
    public void deposit(int bal)
    {
        balance=balance+bal;
    }
    public void deposit(int bal,double intrst)
    {
        balance=balance+bal+intrst;
    }
    public String getAccName()
    {
        return accName;
    }
    public void setAccName(String accName)
    {
        this.accName = accName;
    }
    public static int getAccNumber()
    {
        return accNumber;
    }
    public static void setAccNumber(int accNumber)
    {
        BankAccount.accNumber = accNumber;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }
    @Override
    public String toString()
    {
        //String str="";
        return String.format("BankAccount name:%s, accountNumber %s, accountBalance $%.2f",accName,accNumber,balance);
    }

}
