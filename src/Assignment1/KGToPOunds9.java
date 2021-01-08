package Assignment1;

import java.util.Scanner;

public class KGToPOunds9
{
    public static void main(String[]args)
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter the weight in kg to convert to pound");
        double kg=input.nextDouble();
        System.out.printf("%.2f kg is %.2f lbs\n",kg,KgToPound(kg));
        System.out.println("Please enter the weight in lbs to convert to kg");
        double lbs=input.nextDouble();
        System.out.printf("%.2f lbs is %.2f kg\n",lbs,PoundToKg(lbs));
    }
    public static double KgToPound(double kg)
    {
        return 2.20*kg;
    }
    public static double PoundToKg(double lbs)
    {
        return lbs*0.454;
    }
}
