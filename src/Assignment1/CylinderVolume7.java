package Assignment1;

import java.util.Scanner;

public class CylinderVolume7
{
    public static void main(String[]args)
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the radius of the cylinder:");
        double radius=input.nextDouble();
        System.out.println("Enter the length of the cylinder:");
        double length=input.nextDouble();
        double volume= Math.PI*radius*radius*length;
        System.out.printf("The volume of the cylinder with %.2f radius and %.2f length is %.2f",radius,length,volume);
    }
}
