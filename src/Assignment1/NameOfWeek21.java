package Assignment1;

import java.util.Scanner;

public class NameOfWeek21
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);

        System.out.println("Please enter the number of day");
        int num1=input.nextInt();

        if(num1==1)
        {
            System.out.println("It is sunday");
        }
        else if(num1==2)
        {
            System.out.println("It is Monday");
        }
        else if(num1==2)
        {
            System.out.println("It is Monday");
        }
        else if(num1==3)
        {
            System.out.println("It is Tuesday");
        }
        else if(num1==4)
        {
            System.out.println("It is Wednesday");
        }
        else if(num1==5)
        {
            System.out.println("It is Thursday");
        }
        else if(num1==6)
        {
            System.out.println("It is Friday");
        }
        else if(num1==7)
        {
            System.out.println("It is Saturday");
        }
        else
            System.out.println("You entered wrong day");

    }
}
