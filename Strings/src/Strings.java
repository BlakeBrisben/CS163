//Strings Assignment
// Author: Brisben,Blake
// Date:   Sep 23, 2019
// Class:  CS163 or CS164
// Email:  blakebri@rams.colostate.edu

public class Strings {
	public static void main(String [] args)
	{
		String myString = "Java";
		String myString1 = "Programming";
		String myString2 = "Language";
		
		
		System.out.println(myString + " is a " + myString1 + " " + myString2 + ".");
		System.out.println(myString1.length() + myString2.length());
		System.out.println(myString1.charAt(1) + ", " + myString1.charAt(3) + ", " + myString1.charAt(6));
		System.out.println(myString.indexOf('a'));
		System.out.println(myString2.toUpperCase());
		
		String myString3 = new String("Whatever!");
		String myString4 = new String("Whatever!");
		
		System.out.println(myString3 == myString4);
		System.out.println(myString3.equals(myString4));
		
		char c0 = '^', c1 = 'G', c2 = '7';
		
		System.out.println(c0 + "; " + c1 + "; " + c2);
		
		System.out.println((int) c0 + ", " + (int) c1 + ", " + (int) c2);
		
		
	}
}
