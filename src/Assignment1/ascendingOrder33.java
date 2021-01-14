package Assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class ascendingOrder33
{
    public static void main(String[] args)
    {
        int [] myArray= {4,2,8,3,6};
        int temp=0;

        //Displaying elements of original array:
        System.out.println("Elements of original array:");
        for(int i=0; i <myArray.length;i++)
        {
            System.out.print(myArray[i]+ " ");
        }
        //sort the array in ascending order
        for(int i=0; i <myArray.length;i++)
        {
            for (int j=i+1; j<myArray.length;j++)
            {
                if(myArray[i]>myArray[j])
                {
                    temp=myArray[i];
                    myArray[i]=myArray[j];
                    myArray[j]=temp;
                }
            }
        }
        System.out.println();
        //Displaying elements of array after sorting
        System.out.println("Elements of array sorted in ascending order: ");
        for(int i=0; i <myArray.length;i++)
        {
            System.out.print(myArray[i]+" ");
        }
        System.out.println("\nSorted array using Arrays.sort is:");
        Arrays.sort(myArray);
        System.out.printf("%s",Arrays.toString(myArray));
    }
}
