package Assignment1;

import java.util.Scanner;

public class sumNumber27
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter the number to get the sum of its digit");
        int no=input.nextInt();//1234
        System.out.printf("Sum of digits of %d is: %d\n",no,sumDigit(no));
        System.out.printf("product of digits of %d is: %d\n",no,productDigit(no));
    }
    public static int sumDigit(int num)
    {
        int sum=0;
        int input=num;
        while(input !=0)
        {
            int lastDigit=input%10;
            sum=sum+lastDigit;
            input=input/10;
        }
        return sum;
    }
    public static int productDigit(int num)
    {
        int product=1;
        int input=num;
        while(input >0)
        {
            int lastDigit=input%10;
            product=product*lastDigit;
            input=input/10;
        }
        return product;
    }
}
