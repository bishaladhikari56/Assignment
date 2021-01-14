package Assignment1;

import java.util.Scanner;

public class isPalindrome38
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a string to check if it is palindrome");
        String s=input.next();
        isPalindrome(s);
        String rev=isPalindrome(s);
        if(rev.equals(s))
        {
            System.out.printf("The given String %s is Palindrome\n",s);
        }
        else
            System.out.printf("The given String %s is not a Palindrome\n",s);
    }
    public static String isPalindrome(String s)
    {
        String rev="";
        for(int i=0;i <s.length();i++)
        {
            rev=s.charAt(i)+rev;
        }
        return rev;
    }
}
