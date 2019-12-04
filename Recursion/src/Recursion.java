//Recursion Assignment
// Author: Brisben,Blake
// Date:   Nov 20, 2019
// Class:  CS163 or CS164
// Email:  blakebri@rams.colostate.edu

public class Recursion implements IR17{

	@Override
	public int pracSeq1(int n) {
		if(n == 1)
		{
			return n;
		}
		else
		{
			return 2 * pracSeq1(n-1);
		}
	}

	@Override
	public int sequence2(int n) {
		// TODO Auto-generated method stub
		
		if (n < 3)
		{
			return n;
		}
		else
		{
			return sequence2(n-1) + sequence2(n-2) + sequence2(n-3);
		}
	}

	@Override
	public int sequence3(int n) {
		if (n < 2)
		{
			return n;
		}
		else
		{
			return (2 * sequence3(n-1)) + (3 * sequence3(n-2));
		}
	}
	
	public static void main(String[] args) {
		
		Recursion rec = new Recursion();
		System.out.println("pracSeq1(int x):");
		System.out.println("Answer: " + rec.pracSeq1(6) + "   Expecting: 32");
		System.out.println("Answer: " + rec.pracSeq1(8) + "   Expecting: 128\n");

		System.out.println("sequence2(int x):");
		System.out.println("Answer: " + rec.sequence2(5) + "   Expecting: 11");
		System.out.println("Answer: " + rec.sequence2(6) + "   Expecting: 20\n");

		System.out.println("sequence3:");
		System.out.println("Answer: " + rec.sequence3(3) + "   Expecting: 7");
		System.out.println("Answer: " + rec.sequence3(4) + "   Expecting: 20");
		System.out.println("Answer: " + rec.sequence3(7) + "   Expecting: 547\n");
	}

}
