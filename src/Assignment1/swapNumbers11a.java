package Assignment1;

import jdk.swing.interop.SwingInterOpUtils;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.net.SocketTimeoutException;
import java.util.Scanner;

public class swapNumbers11a
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number for value of a");
        int a= input.nextInt();
        System.out.println("Please enter the first number for value of b");
        int b= input.nextInt();

        int temp=a;
        int temp1=b;
        b=temp;

        a=temp1;
        System.out.println("The value of a after swapping is: "+a);
        System.out.println("The value of b after swapping is: "+b);
    }

}
