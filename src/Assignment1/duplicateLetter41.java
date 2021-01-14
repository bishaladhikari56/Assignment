package Assignment1;

import java.util.Scanner;

public class duplicateLetter41
{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a string to find duplicate words");
        String s=input.nextLine();
        String [] words=s.split(" ");
        s=s.toLowerCase();
        int count;
        System.out.printf("The duplicate words in string %s are:\n",s);
        for(int i=0; i <words.length;i++)
        {
            count=1;
            for(int j=i+1; j<words.length;j++)
            {
                if(words[i].equals(words[j]))
                {
                    count++;
                    //Set words[j] to 0 to avoid visited words
                    words[j]="0";
                }
            }
            //Displays the duplicate word if count is greater than 1
            if(count >1 && words[i] !="0")
            {
                System.out.println(words[i]);
            }
        }
    }
}
