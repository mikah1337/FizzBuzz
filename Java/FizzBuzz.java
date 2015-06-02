/*
Write a program that prints the numbers from 1 to 100.
But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”.
For numbers which are multiples of both three and five print “FizzBuzz”.
*/

public class FizzBuzz{
	public static void main(String[] args){
		String fb = "FizzBuzz";
		for(int i = 0; i < 100; i++, System.out.println(i % 3 == 0 && i % 5 == 0 ? fb : i % 3 == 0 ? fb.substring(0,4) : i % 5 == 0 ? fb.substring(4,fb.length()) : i));
	}
}
