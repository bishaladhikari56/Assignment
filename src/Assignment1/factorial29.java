package Assignment1;

import java.util.Scanner;

public class factorial29
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter the end number n.");
        int n=input.nextInt();
        System.out.printf("Factorial of %d is: %.2f\n",n,factorial(n));
        double a=0;
        for(int i=1; i <=n;i++)
        {
             a+=i/factorial(i);
        }
        System.out.printf("Value of a is: %.3f \n",a);
    }
    public static double factorial(int n)
    {
        int fact=1;
        for(int i=1; i <= n;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
}
