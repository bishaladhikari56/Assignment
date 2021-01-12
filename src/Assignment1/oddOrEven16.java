package Assignment1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class oddOrEven16
{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter a number\n");
        int num=input.nextInt();
        if(num%2==0)
        {
            System.out.println("The number is even");
        }
        else
        {
            System.out.println("The number is odd");
        }
    }
}
