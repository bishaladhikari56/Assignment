package Assignment1;

import java.util.Scanner;

public class TriangleType19
{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter the first number");
        int num1=input.nextInt();
        System.out.println("Please enter the second number");
        int num2=input.nextInt();
        System.out.println("Please enter the third number");
        int num3=input.nextInt();

        if(num1==num2 &&num2==num3&&num3==num1)
        {
            System.out.println("It is an equilateral triangle");
        }
        else if(num1==num2 || num2==num3||num3==num1)
        {
            System.out.println("It is an Isosceles triangle");
        }
        else
        {
            System.out.println("It is a scalene triangle");
        }
    }
}
