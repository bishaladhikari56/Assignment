package Assignment1;

import java.util.Scanner;

public class SimpleInterest4
{
    public static void main (String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("Please enter the principal\n");
        double p= input.nextDouble();
        System.out.printf("Please enter the time\n");
        double t= input.nextDouble();
        System.out.printf("Please enter the rate\n");
        double r= input.nextDouble();

        double interest=p*t*r/100;
        System.out.println("the interest is: "+interest);

    }
}
