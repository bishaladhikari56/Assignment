package Assignment1;

import java.util.Scanner;

public class Fibonacci30
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter the number up to which you want to find the series.");
        int n=input.nextInt();
        fibonacci(10);
    }
    public static void fibonacci(int n)
    {
        int f1=0; int f2=1;
        if(n <1)
            return;
        System.out.print(f1+ " ");
        for(int i=1; i < n;i++)
        {
            System.out.print(f2+ " ");
            int next=f1+f2;
            f1=f2;
            f2=next;
        }
    }
}
