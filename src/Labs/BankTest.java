package Labs;

public class BankTest
{
    public static void main(String[] args)
    {
        BankAccount ba= new BankAccount("Bishal",5000);
        System.out.println(ba.toString());
        ba.withdraw(500);
        System.out.println(ba.toString());
        ba.deposit(1000);
        System.out.println(ba.toString());
        BankAccount bb= new BankAccount("Adhikari",600);
        System.out.println(bb.toString());
        bb.withdraw(550,2);
        System.out.println(bb.toString());
        BankAccount bc= new BankAccount("Surendra");
        System.out.println(bc.toString());
        bc.withdraw(500);
        System.out.println(bc.toString());
        bc.deposit(5000,5);
        System.out.println(bc.toString());
    }
}
