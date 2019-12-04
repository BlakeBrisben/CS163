//Palindrome Assignment
// Author: Brisben,Blake
// Date:   Oct 1, 2019
// Class:  CS163 or CS164
// Email:  blakebri@rams.colostate.edu

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("racecar: " + isPalindrome("racecar"));
		System.out.println("firetruck: " + isPalindrome("firetruck"));
		
	}

	public static boolean isPalindrome(String str)
	{
		char[] backwards = new char[str.length()];
		
		for(int i = 0; i < str.length(); i++ )
		{
			backwards[i] = str.charAt((str.length()-1)-i);
		}
		
		return str.equals(new String(backwards));		
		
	}
	
}
