//Recursion again Assignment
// Author: Brisben,Blake
// Date:   Nov 21, 2019
// Class:  CS163 or CS164
// Email:  blakebri@rams.colostate.edu

public class RecursionAgain implements IR18 {

	@Override
	public String starString(int x) {
		
		if( x == 0)
		{
			
			return "";
		}
		else
		{
			return "*" + starString(x-1);
		}
	}

	@Override
	public void starPattern(int x) {
		// TODO Auto-generated method stub
		
		if(x == 0)
		{
			System.out.print("");
		}
		else
		{
			System.out.println(starString(x));
			starPattern(x-1);
		}
		
	}

	@Override
	public boolean palindrome(String word) {
		if(word.length() == 1)
		{
			return true;
		}
		else if(word.length() == 2)
		{
			if(word.charAt(0) == word.charAt(1))
			{				
				return true;
			}
		}
		else if(word.length() == 3)
		{
			if(word.charAt(0) == word.charAt(2))
				return true;
		}
		else
		{
			return palindrome(word.substring(1, word.length() - 1));
					
		}
		return false;

	}
	
	public static void main(String args[]){
		RecursionAgain rec = new RecursionAgain();
		
		//System.out.println(rec.starString(5));
		rec.starPattern(7);

		
		System.out.println();
		System.out.println ("\'x\' is a palindrome?: " + rec.palindrome("x"));
		System.out.println("\'car\' is a palindrome?: " + rec.palindrome("car"));
		System.out.println("\'racecar\' is a palindrome?: " + rec.palindrome("racecar"));
		System.out.println("\'hannah\' is a palindrome?: " + rec.palindrome("hannah"));
		System.out.println("\'banana\' is a palindrome?: " + rec.palindrome("banana") + "\n");
		
	}

}
