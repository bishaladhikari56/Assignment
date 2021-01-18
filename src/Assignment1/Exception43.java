package Assignment1;

import java.sql.SQLOutput;

public class Exception43
{
    public static void main(String[] args)
    {
        int [] arr= {1,2,3};
        dividedByZero(arr);
        indexOutRange(arr);
    }
    public static void dividedByZero(int []arr)
    {
        int res=0;

        try
        {
            System.out.println("let's loop through the array");
            for(int i=0; i <arr.length;i++)
            {
                res=arr[i]/i;
                System.out.println("Result is: "+res);
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
    }
    public static void indexOutRange(int [] arr)
    {
        try
        {
            System.out.println("lets print the elements of array");
            for(int i=0; i < arr.length;i++)
            {
                System.out.println(arr[i]);
            }
            arr[4]=5;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
}
