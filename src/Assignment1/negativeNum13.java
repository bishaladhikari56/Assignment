package Assignment1;

import java.util.Scanner;

public class negativeNum13
{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter a number\n");
        int num=input.nextInt();
        if(num<0)
        {
            System.out.println("The entered number is: "+num);
        }
    }
}
