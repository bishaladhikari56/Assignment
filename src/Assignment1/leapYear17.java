package Assignment1;

import java.util.Scanner;

public class leapYear17
{
    public static void main(String[] args) {
       int year=2021;
       System.out.println(checkLeapYear(year)?"It is Leap Year":"It is not Leap Year");

    }
    public static boolean checkLeapYear(int yr)
    {
        if(yr %400==0)
            return true;
        if(yr %100==0)
            return false;
        if(yr%4==0)
            return true;
        return false;
    }
}
