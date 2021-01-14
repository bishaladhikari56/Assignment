package Assignment1;

public class revereseElement34
{
    public static void main(String[] args) {
        int[] arr={5,6,2,3};
        System.out.println("The original array is: ");
        for(int i=0; i < arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nThe reversed array is: ");
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nThe reversed array Alternately: ");
        reverseArray(arr,0,3);
        for(int i=0;i <arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
    public static void reverseArray(int arr[],int start, int end)
    {
        int temp;
        while(start < end)
        {
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
