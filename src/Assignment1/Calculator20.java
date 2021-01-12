package Assignment1;

import java.util.Scanner;

public class Calculator20
{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter the first number");
        int num1=input.nextInt();
        System.out.println("Please enter the second number");
        int num2=input.nextInt();
        System.out.println("Please enter the operator");
        String c=input.next();
        double value=calculate(num1,num2,c);
        System.out.println("The calculated value is "+value);

    }
    public static double calculate(int num1,int num2,String c)
    {
        if(c.equals("*"))
        {
            return num1*num2;
        }
        if(c.equals("/"))
        {
            return num1/num2;
        }
        if(c.equals("-"))
        {
            return num1-num2;
        }
        if(c.equals("+"))
        {
            return num1+num2;
        }
        return 0;
    }
}
