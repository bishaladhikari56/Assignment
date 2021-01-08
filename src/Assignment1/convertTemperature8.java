package Assignment1;

import java.util.Scanner;

public class convertTemperature8
{
    public static void main(String[]args)
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Please eneter the degree celcius you want to convert to farheinte");
        double cel=input.nextDouble();
        System.out.printf("%.2f degree cel is %.2f degree farhenite\n",cel,CelToFarh(cel));
        System.out.println("Please eneter the degree Farhenite you want to convert to celcius");
        double farh=input.nextDouble();
        System.out.printf("%.2f degree Farhenite is %.2f degree Celcius\n",farh,FahrenheitToCel(farh));
    }
    public static double FahrenheitToCel(double Fahr)
    {
        double celcius= (32*Fahr-32)*(5/9);
        return celcius;
    }
    public static double CelToFarh(double cel)
    {
        return (cel*1.8)+32;
    }
}
