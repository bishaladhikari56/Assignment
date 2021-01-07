package Assignment1;

import java.util.Scanner;

public class sumAverage3
{
    public static void main(String[]args)
    {
        Scanner input= new Scanner(System.in);
        System.out.printf("Please enter the first number\n");
        double a= input.nextDouble();
        System.out.printf("Please enter the Second number\n");
        double b= input.nextDouble();
        double sum= a+b;
        double average=sum/2;

        System.out.println("Sum is: "+sum);
        System.out.println("Average is: "+average);


    }
}
