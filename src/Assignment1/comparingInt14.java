package Assignment1;

import javax.swing.*;
import java.util.Scanner;

public class comparingInt14
{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the first number\n");
        int num1=input.nextInt();
        System.out.println("Please enter the second number\n");
        int num2=input.nextInt();
        equals(num1,num2);
    }
    public static void equals(int a, int b) {
        if (a == b) {
            System.out.println("The two entered numbers are equal\n");
        } else if (a < b) {
            System.out.printf("The number %d is smaller than number %d ", a, b);
        } else {
            System.out.printf("The number %d is greater than number %d ", a, b);
        }
    }

}
