package Assignment1;

import java.util.Scanner;

public class allPrime28
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter the number to check if it is prime.");
        int no=input.nextInt();
        System.out.printf("It is %b that The number %d is prime\n",isPrime(no),no);
        System.out.println("Please enter the number up to which you want to find prime numbers.");
        int max=input.nextInt();
        boolean prime=true;
        //Empty String
        String primeNumbers="";
        //Start loop1 to check max
        for(int i=1; i < max;i++)
        {
            prime=firstNthPrime(i);
            if(prime)
            {
                primeNumbers= primeNumbers + i+" ";
            }
        }
        System.out.println("Prime numbers from 1 to "+max+" are: ");
        //Print prime numbers from 1 to max;
        System.out.println(primeNumbers);

        System.out.println("\n****************************************");

        System.out.println("Please enter the starting number of prime.");
        int start=input.nextInt();
        System.out.println("Please enter the ending number of prime.");
        int end=input.nextInt();
        String primeNum="";
        boolean primes=true;
        //Start loop1 to check max
        for(int i=start; i < end;i++)
        {
            primes=allPrimeBetween(start,end);
            if(primes)
            {
                primeNum= primeNum + i+" ";
            }
        }
        System.out.println("Prime numbers from "+start+" to "+max+" are: ");
        //Print prime numbers from 1 to max;
        System.out.println(primeNum);

    }
    public static boolean isPrime(int num)
    {
       if(num <=1)
           return false;
       int rem;
       for(int i=2; i <=num/2;i++)
       {
           rem=num%i;
           if(rem==0)
           {
               return false;
           }
       }
        return true;

    }
    public static boolean firstNthPrime(int numToCheck)
    {
        int rem;
        for(int i=2; i<=numToCheck/2;i++)
        {
            rem=numToCheck %i;
            //If remainder is 0 than numberToCheck is not prime and break loop. Else continue loop
            if(rem==0)
            {
                return false;
            }
        }
        return true;
    }
    public static boolean allPrimeBetween(int start, int end) {
        int rem;
        for (int i = 2; i <= end / 2; i++) {
            rem = end % i;
            //If remainder is 0 than numberToCheck is not prime and break loop. Else continue loop
            if (rem == 0) {
                return false;
            }
        }
        return true;
    }

}
