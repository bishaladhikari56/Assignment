package Assignment1;

import java.io.*;
import java.util.*;

public class DuplicateWord45
{
    public static void main(String[] args) throws IOException
    {
        //ArrayList<String> al= new ArrayList<>();
        Set<String> set= new HashSet<>();
        Set<String> dup= new HashSet<>();
        Scanner input= new Scanner(System.in);
        System.out.printf("Enter the input file name\n");
        String inputFileName=input.next();
        File inputFile=new File(inputFileName);
        if(!inputFile.exists())
        {
            System.out.printf("The file %s cannot be found",inputFileName);
            System.exit(0);
        }
        Scanner inputReader= new Scanner(inputFile);
        String words="";
        String duplicates="";
        while(inputReader.hasNext())
        {
            words += inputReader.nextLine()+"\n";
        }
        System.out.println("The original file is: ");
        System.out.print(words);
        System.out.println("==============================");
        String [] arr=words.split("\s|,");
       /* for(int i=0; i <arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }*/

        for(String wor:arr)
        {
            if(!set.add(wor))
            {
                duplicates+=wor+" ";
                dup.add(wor);
            }
            set.add(wor);
        }
        System.out.println("Duplicate words are: ");
        System.out.println(duplicates);
        System.out.println("==============================");
        System.out.println("Printing the duplicate words only once using hashset");
        Iterator<String> itr= dup.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }
       // System.out.println(dup);
       /* System.out.println("==============================");
        Iterator<String> itr1= set.iterator();
        while(itr1.hasNext())
        {
            System.out.print(itr1.next()+" ");
        }*/
        //System.out.println(set);
    }
}
