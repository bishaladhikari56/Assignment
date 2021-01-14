package Assignment1;

import java.util.Scanner;

public class reverseNum26
{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter the number to reverse");
        String no=input.next();
        reverse(no);
        reverse2(no);
        System.out.println(reverseInt(4242));
    }
    public static void reverse(String num)
    {
        String reverse="";
        for(int i=0; i <num.length();i++)
        {
            reverse=num.charAt(i)+reverse;
        }
        System.out.println(reverse);
    }
    public static void reverse2(String num)
    {
        String reverse2="";
        for(int i=num.length()-1;i >=0;i--)
        {
            reverse2=reverse2+num.charAt(i);
        }
        System.out.println("Using alternate method: "+reverse2);
    }
    public static int reverseInt(int num)
    {
        int rev=0;
        while(num >0)
        {
            rev=rev*10+num%10;
            num=num/10;
        }
        return rev;
    }
}
