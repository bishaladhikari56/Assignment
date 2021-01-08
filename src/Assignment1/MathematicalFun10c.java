package Assignment1;

import javax.swing.*;
import java.util.Scanner;

public class MathematicalFun10c
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        //String eqn=input.next();
        int a=1, b=-7, c=12;
        findRoots(a,b,c);
        System.out.println("The value of x is: "+calculate(a,b,c));

    }
    public static double calculate(int a,int b, int c)
    {
        return (-b+Math.sqrt(b*b-4*a*c))/2*a;
    }
    //print roots of quadratic
    //equation ax^2+bx+c
    public static void findRoots(int a, int b, int c)
    {
        //If a is 0, then the equation is not quadratic, but linear
        if(a==0)
        {
            System.out.println("Invalid");
            return;
        }
        int d= b*b -4*a*c;
        double sqrtVal=Math.sqrt(Math.abs(d));
        if(d>0)
        {
            System.out.println("Roots are real and different\n");
            System.out.println((double)(-b+sqrtVal)/(2*a)+"\n"+ (double)(-b-sqrtVal)/(2*a));
        }
        else if(d==0)
        {
            System.out.println("Roots are real and same");
            System.out.println(-(double)b/(2*a)+"\n"+-(double)b/(2*a));
        }
        else
        {
            System.out.println("Roots are complex\n");
            System.out.println(-(double)b/(2*a) + " i"+sqrtVal+"\n"+-(double)b/(2*a)+" -i"+sqrtVal);
        }
    }

}
