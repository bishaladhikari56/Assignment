package Assignment1;

import java.util.Scanner;

public class SumNth23
{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter the number up to which you want to find sum");
        int num1=input.nextInt();
        System.out.println("The sum using for loop is "+sum(num1));
        System.out.println("The sum using formula is "+sumFormula(num1));
    }
    public static double sum(int n)
    {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        return sum;
    }
    public static double sumFormula(int n)
    {
        int sum=n*(n+1)/2;
        return sum;
    }
}
