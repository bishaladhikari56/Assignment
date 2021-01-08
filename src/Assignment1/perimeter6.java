package Assignment1;

public class perimeter6
{
    public static void main(String[]args)
    {
        System.out.printf("The perimeter of rectangle is: %.2f\n",perimeterRectangle(10,5));
        System.out.printf("The perimeter of Triangle is: %.2f\n",perimeterTriangle(10,5,4));
        System.out.printf("The perimeter of rectangle is: %.2f\n",perimeterCircle(10));


    }
    public static double perimeterTriangle(double b, double h,double s)
    {
        double perimeterT= b+h+s;
        return perimeterT;
    }
    public static double perimeterRectangle(double l, double b)
    {
        double perimeterR= (2*b)+(2*l);
        return perimeterR;
    } public static double perimeterCircle(double r)
    {
        double perimC= 2*Math.PI*r;
        return perimC;
    }
}
