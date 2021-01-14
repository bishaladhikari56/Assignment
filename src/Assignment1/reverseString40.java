package Assignment1;

import java.util.Scanner;

public class reverseString40
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a string to to reverse");
        String s=input.next();
        String rev="";
        for(int i=0;i <s.length();i++)
        {
            rev=s.charAt(i)+rev;
        }
        System.out.printf("The reverse String is %s",rev);
    }
}
