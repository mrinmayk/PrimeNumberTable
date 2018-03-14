import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PrimeNumberTable
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   int N=10;    // First 10 prime numbers
	   int[] arr = new int[N+1]; /* To store the prime numbers and a 1 in [0][0] for aiding in multiplication for  in an array*/
	   arr[0]=1;    
	   int count=0; 
	   int num=2;
	   while(count!=N)// while count!= number of prime numbers entered keep searching.. 
	   {
	       boolean prime=true;// to determine whether the number is prime or not
           for (int i=2;i<=Math.sqrt(num);i++)// most efficient is to check if number has any factor other than 1 starting from 1 to its square root
	       {
	           if (num%i==0)
	           {
	              prime=false;// if number divides any other number its not a prime so set prime to false and break the loop.
	                break;
	           }
	       }
	       if (prime)
	       {
	           count++;
	           arr[count]=num;// store that num in the arr array
	       }
	       num++; //see if next number is prime or not.
	   }
	   System.out.printf("%5s"," ");           // Display 5 empty spaces on top left of table
	   
	   for(int i=1;i<N+1;i++)
    	       System.out.printf("%5d",arr[i]);    // Printing the top row of table i.e. the list of the prime numbers
	   
	   for(int i=1;i<N+1;i++)
       {
		   System.out.println("\n");
           for(int j=0;j<N+1;j++)
                System.out.printf("%5d",arr[i]*arr[j]);// Multiple each prime by 1 (i.e. print itself) followed by other primes and display in a single row
       }
	}
}