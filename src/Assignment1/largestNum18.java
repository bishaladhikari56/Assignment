package Assignment1;

import java.util.Scanner;

public class largestNum18
{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter the first number");
        int num1=input.nextInt();
        System.out.println("Please enter the second number");
        int num2=input.nextInt();
        System.out.println("Please enter the third number");
        int num3=input.nextInt();
        max(num1,num2,num3);

    }
    public static void max(int a, int b, int c)
    {
        int max=0;
        if(a > max)
        {
            max=a;
        }
        if(b >max)
        {
            max=b;
        }
        if(c >max)
        {
            max=c;
        }
        System.out.println("the maximum number is "+max);
    }

}
