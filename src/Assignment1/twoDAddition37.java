package Assignment1;

public class twoDAddition37
{
    public static void main(String[] args)
    {
        int[][] arr1={{1,2,3},{4,5,6},{7,8,9}};
        int [][]arr2={{4,5,6},{2,7,8},{3,1,9}};

        System.out.println("The original 2d array1 is:\n");
        for(int i=0; i <arr1.length;i++)
        {
            for(int j=0; j <arr1.length;j++)
            {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("The original 2d array2 is:");
        for(int i=0; i <arr2.length;i++)
        {
            for(int j=0; j <arr2.length;j++)
            {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("The addition of arr1 and arr2 gives:");
        for(int i=0; i <arr2.length;i++)
        {
            for(int j=0; j <arr2.length;j++)
            {
                System.out.print(arr2[i][j]+arr1[i][j]+" ");
            }
            System.out.println();
        }
    }
}
