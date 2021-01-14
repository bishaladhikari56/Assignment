package Assignment1;

import java.util.Scanner;

public class factorial24
{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter the number you want to find factorial of");
        int num1=input.nextInt();

        long factorial=1;
        for(int i=1; i <=num1; i++)
        {
            factorial=factorial *i;
        }
        System.out.printf("Factorial of %d is %d",num1,factorial);
    }

}
