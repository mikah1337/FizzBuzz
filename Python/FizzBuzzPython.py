'''
Write a program that prints the numbers from 1 to 100.
But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”.
For numbers which are multiples of both three and five print “FizzBuzz”.
'''
print('\n'.join(['Fizz'*(x % 3 == 2) + 'Buzz'*(x % 5 == 4) or str(x + 1) for x in range(100)]))

