/*
Write a program that prints the numbers from 1 to 100.
But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”.
For numbers which are multiples of both three and five print “FizzBuzz”.
*/

public class FizzBuzz
{
	public static void main(String[] args)
	{
        	for (int i = 1; i <= 100; i++)
			if (i % 3 == 0 && i % 5 == 0) //or i % 15 == 0
                		System.out.println("fizzbuzz");
            		else if (i % 3 == 0)
                		System.out.println("fizz");
            		else if (i % 5 == 0)
                		System.out.println("buzz");
            		else
                		System.out.println(i);
	}
}
