package Assignment1;

import java.util.Scanner;

public class MathematicalFun10a
{
    public static void main(String[]args)
    {

        Scanner input= new Scanner(System.in);
        System.out.println("Please enter the value of initial velocity u");
        double u= input.nextDouble();
        System.out.println("Please enter the value of acceleration ");
        double a= input.nextDouble();
        System.out.println("Please enter the value of time t");
        double t= input.nextDouble();

        double s= u*t+0.5*a*t*t;
        System.out.println("The value of speed s is: "+s+" m/s");

    }
}
