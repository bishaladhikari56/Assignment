package Assignment1;

import java.util.Scanner;

public class AsciCode15
{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number from 0 to 128");
        int num=input.nextInt();
        System.out.printf("The ascii value of %d is %s\n",num,(char)num);
    }
}
