package Assignment1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestStudent44
{
    public static void main(String[] args) throws FileNotFoundException
    {
        ArrayList<Student44> list= new ArrayList<>();
        Map<String,String> map=new HashMap<>();
        Scanner input= new Scanner(System.in);
        System.out.printf("Please enter the file name you want to read the students details from:\n");
        String inputFileName=input.next();
        File inputFile=new File(inputFileName);
        if(!inputFile.exists())
        {
            System.out.printf("The inputFile %s cannot be found\n",inputFileName);
            System.exit(0);
        }
        Scanner inputReader= new Scanner(inputFile);
        String name;
        String address;
        while(inputReader.hasNext())
        {
            String [] arr=inputReader.nextLine().split(",");
            name=arr[0];
            address=arr[1];
            list.add(new Student44(name,address));
            map.put(arr[0],arr[1]);
        }

       System.out.println("Please enter the file name to print student details\n");
        String outputFileName=input.next();
        File outputFile=new File(outputFileName);
        //FileWriter outputFile= new FileWriter(outputFileName,true);
        PrintWriter outputWriter= new PrintWriter(outputFile);
        outputWriter.println("Using arraylist on file\n");
        System.out.println("Using arraylist on console\n");
        for(Student44 std: list)
        {
            System.out.println(std);
            outputWriter.println(std);
        }
        System.out.println("===============================================");
        System.out.println("Printing using hashmap");
        System.out.println(map);
        System.out.println("===============================================");
        System.out.println("Enter the name of student you want to know the address of");
        Scanner input1= new Scanner(System.in);
        String stdName=input1.nextLine();
        //input.next();
        System.out.println("===============================================");
        searchAddress(map,stdName);
        outputWriter.close();

    }
    public static void searchAddress(Map<String,String> map, String name)
    {
        String val=(String)map.get(name);
        System.out.printf("The address of %s is: %s",name,val);
    }
}
