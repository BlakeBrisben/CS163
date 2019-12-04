//Primes Assignment
// Author: Brisben,Blake
// Date:   Sep 27, 2019
// Class:  CS163 or CS164
// Email:  blakebri@rams.colostate.edu

public class Primes {
	public static void main(String [] args)
	{
		boolean prime = true;
		for(int i = 2; i <= 100; i++)
		{
			prime = true;
			for(int j = 2; j < i/2 + 1; j++)
			{
				if (i % j == 0)
				{
					j = i/2 + 1;
					prime = false;
				}
			}
			
			if (prime)
				System.out.print(i + ", ");
		}
	}
}
