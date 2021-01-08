package Assignment1;

public class Area5
{
    public static void main(String[]args)
    {
        System.out.printf("The area of rectangle is: %.2f\n",areaRectangle(10,5));
        System.out.printf("The area of Triangle is: %.2f\n",areaTriangle(10,5));
        System.out.printf("The area of rectangle is: %.2f\n",areaCircle(10));


    }
    public static double areaTriangle(double b, double h)
    {
        double areaT= 0.5*b*h;
        return areaT;
    }
    public static double areaRectangle(double l, double b)
    {
        double areaR= b*l;
        return areaR;
    } public static double areaCircle(double r)
    {
        double areaC= Math.PI*r*r;
        return areaC;
    }
}
