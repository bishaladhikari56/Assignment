package Assignment1;

import java.util.Scanner;

public class Information12
{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("please enter your name");
        String name=input.nextLine();
        System.out.println("please enter your roll No");
        int roll=input.nextInt();
        System.out.println("please enter your nationality");
        String nationality=input.next();
        details(name,roll,nationality);
    }
    public static void details(String name, int roll, String nationality)
    {
        System.out.println(name+" with roll number "+roll+" is "+nationality+".\n");
    }
}
