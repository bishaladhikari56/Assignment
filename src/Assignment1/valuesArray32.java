package Assignment1;

import java.util.Scanner;

public class valuesArray32
{
    public static void main(String[] args)
    {
        int [] myArray= new int[5];
        Scanner input= new Scanner(System.in);
        for(int i=0; i <5;i++)
        {
            System.out.println("Please enter the number to put in the array");
            int n=input.nextInt();
            myArray[i]=n;
        }
        System.out.print("The values of array is: ");
        int sum=0;
        for(int i=0; i <myArray.length;i++)
        {
            System.out.print(+myArray[i]+" ");
            sum+=myArray[i];
        }
        System.out.print("\nThe sum of elements of array is: "+sum);

    }
}
