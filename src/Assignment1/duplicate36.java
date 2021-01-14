package Assignment1;

public class duplicate36
{
    public static void main(String[] args) {
        int [] arr= {6,8,6,5,4,4,3,2};
        System.out.println("The original array is: ");
        for(int i=0; i <arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nThe duplicate elements in the array are:\n");
        for(int i=0; i <arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.print(arr[j]+" ");
                }
            }
        }
    }
}
