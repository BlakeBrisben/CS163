//Loops Assignment
// Author: Brisben,Blake
// Date:   Sep 25, 2019
// Class:  CS163 or CS164
// Email:  blakebri@rams.colostate.edu

/*
 * Q1:
 * 1
 * 2
 * 3
 * 4
 * 5
 * 
 * Q2:
 * 1
 * 2
 * 3
 * 4
 * 5
 * 6
 * 7
 * 8
 * 
 * Q3:
 * 7
 * 6
 * 5
 * 4
 * 3
 * 2
 * 1
 * 0
 * 
 * Q4:
 * No output
 * 
 * Q5:
 * 0
 * 
 */

public class Loops {
	
	public static void main(String [] args)
	{
		// Test reverseString
	    String forward = "Java Programming rules!";
	    System.out.print("Forward string: ");
	    System.out.println(forward);
	    System.out.print("Reverse string: ");
	    reverseString(forward);
	        
	    // Test printAscii
	    System.out.println("ASCII Table");
	    printAscii('!', '9');
	        
	    // Test raiseToPower
	    System.out.printf("3.0 to the 5 = %.3f\n", raiseToPower(3.0, 5));
	    System.out.printf("2.5 to the 2 = %.3f\n", raiseToPower(2.5, 2));
	}
	
	public static void reverseString(String s) {
	    // add code here
		for (int i = s.length()-1; i > -1; i--)
		{
			System.out.print(s.charAt(i));
		}
		System.out.println();
	}

	public static void printAscii(char start, char end) {
	    // add code here
		for(int i = start; i <= end; i++)
		{
			System.out.println(i + ": " + Character.toString((char) i));
		}
	}

	public static double raiseToPower(double number, int exponent) {
	    // add code here
		double finalNum = number;
		for(int i = 1; i < exponent; i++)
		{
			finalNum *= number;
		}
		
		return finalNum;
	}
}
