//RRAA Assignment
// Author: Brisben,Blake
// Date:   Dec 3, 2019
// Class:  CS163 or CS164
// Email:  blakebri@rams.colostate.edu

public class RRAA implements IR19{

	private int sumDigits(int n, int res)
	{
		if(n < 10)
		{
			return res + n;
		}
		else
		{
			res += n % 10;
			return sumDigits(n/10, res);
		}
	}
	
	@Override
	public int sumDigits(int n) {
		return sumDigits(n, 0);
	}

	private int countCannonballs(int n, int res)
	{
		if(n == 1)
		{
			return res + 1;
		}
		else
		{
			res += n*n;
			return countCannonballs(n-1, res);
		}
	}
	
	@Override
	public int countCannonballs(int n) {
		// TODO Auto-generated method stub
		return countCannonballs(n, 0);
	}
	
	private int numDigits(int n, int count)
	{
		if(n < 10 )
		{
			return count + 1;
		}
		else
		{
			count++;
			return numDigits(n/10, count);
		}
	}

	@Override
	public int numDigits(int n) {
		// TODO Auto-generated method stub
		return numDigits(n, 0);
	}
	
	private String backString(String s, String newS)
	{
		if(s.length() < 1)
		{
			return newS + s;
		}
		else
		{
			newS += s.charAt(s.length() - 1);
			s = s.substring(0,s.length()-1);
			return backString(s,newS);
		}
	}

	@Override
	public String backString(String s) {
		// TODO Auto-generated method stub
		return backString(s, "");
	}
	
	public static void main(String[] args) {

		RRAA rec = new RRAA();
		System.out.println("sumDigits(int x):");
		System.out.println("Answer (1234): " + rec.sumDigits(1234) + "   Expecting: 10");
		System.out.println("Answer (7): " + rec.sumDigits (7) + "   Expecting: 7");
		System.out.println("Answer (6789): " + rec.sumDigits (6789));
		System.out.println();
		
		
		System.out.println("countCannonballs (int x):");
		System.out.println("Answer (1): " + rec.countCannonballs(1) + "   Expecting: 1");
		System.out.println("Answer: " + rec.countCannonballs (4) + "   Expecting: 30");
		System.out.println("Answer (10): " + rec.countCannonballs (10));
		System.out.println();
		
		
		System.out.println("numDigits(int x):");
		System.out.println("Answer (1234): " + rec.numDigits(1234) + "   Expecting: 4");
		System.out.println("Answer (7): " + rec.numDigits (7) + "   Expecting: 1");
		System.out.println("Answer (678900): " + rec.numDigits (678900));
		System.out.println();
		
		
		System.out.println("backString(String s):");
		System.out.println("Answer (yes): " + rec.backString("yes"));
		System.out.println("Answer (): " + rec.backString(""));
		System.out.println("Answer (a): " + rec.backString("a"));
		System.out.println("Answer (CS163): " + rec.backString("CS163"));
		
}

}
