package Assignment1;

import java.util.Scanner;

public class shortForm39
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a string to write the short form");
        String s=input.nextLine();
        shortName(s);
        printShort(s);
    }
    public static void shortName(String name)
    {
        if(name.length()==0)
            return;
        //Since toUpperCase() returns int, we do typecasting
        System.out.print(Character.toUpperCase(name.charAt(0)));

        //Traverse rest of the string and print the characters after spaces
        for(int i=1; i <name.length()-1;i++)
        {
            if(name.charAt(i)==' ')
            {
                System.out.print(" "+Character.toUpperCase(name.charAt(i+1)));
            }
        }
    }
    public static void printShort(String name)
    {
        System.out.println();
        String[] str=name.split(" ");
        for(int i=0; i <str.length-1;i++)
        {
            System.out.print(str[i].charAt(0)+". ");
        }
        System.out.println(str[str.length-1]);
    }

}
