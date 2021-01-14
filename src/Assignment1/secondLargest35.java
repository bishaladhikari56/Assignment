package Assignment1;

import java.util.Arrays;

public class secondLargest35
{
    public static void main(String[] args) {
        int[] arr={5,6,2,13,16,10};
        System.out.println("The original array is: ");
        for(int i=0; i < arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        secondLargest(arr,arr.length);
    }
    public static void secondLargest(int arr[],int size)
    {
        int first,second;
        if(size <2)
        {
            System.out.printf("Invalid input");
        }
        //sort the array
        Arrays.sort(arr);
        System.out.println("The sorted array is: \n");
        for(int i=0; i < arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        //Start from second last element as the largest element is at last
        for(int i=size-2;i>=0;i--)
        {
            //If the element is not equal to largest element
            if(arr[i]!=arr[size-1])
            {
                System.out.printf("\nThe second largest element is %d\n",arr[i]);
                return;
            }
        }
        System.out.printf("There is no second largest element");
    }
}
