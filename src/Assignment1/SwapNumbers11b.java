package Assignment1;

import java.util.Scanner;

public class SwapNumbers11b
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number for value of a");
        int a= input.nextInt();
        System.out.println("Please enter the first number for value of b");
        int b= input.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;


        System.out.println("The value of a after swapping is: "+a);
        System.out.println("The value of b after swapping is: "+b);
    }
}
