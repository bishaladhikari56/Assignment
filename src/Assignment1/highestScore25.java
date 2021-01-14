package Assignment1;

import java.util.Scanner;

public class highestScore25
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter the number of students");
        int no=input.nextInt();
        int highest=0;
        String highName="";
        for(int i=0; i <no;i++)
        {
            System.out.println("Please enter the name of students");
            String name=input.next();
            System.out.println("Please enter the number obtained by students");
            int num=input.nextInt();
            if(num>highest)
            {
                highName=name;
                highest=num;
            }
        }
        System.out.printf("The student with highest marks is %s with total marks of %d\n",highName,highest);

    }
}
