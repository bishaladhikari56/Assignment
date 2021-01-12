package Assignment1;

import java.util.Scanner;

public class Table22
{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter the number you want to know table of");
        int num1=input.nextInt();
        for(int i=0; i <=20;i++)
        {
            System.out.println(num1 + " * " + i + " = " + num1 * i);
        }
    }
}
