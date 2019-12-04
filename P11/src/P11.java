import java.util.ArrayList;

//P11 Assignment
// Author: Brisben,Blake
// Date:   Dec 2, 2019
// Class:  CS163 or CS164
// Email:  blakebri@rams.colostate.edu

public class P11 implements IP11
{

	private void printStripes(int n)
	{
		
		if(n == 0)
		{
			System.out.print("");
		}
		else
		{
			System.out.print("-");
			printStripes(n-1);
		}
	}
	
	private void printStars(int n)
	{
		if(n == 0)
		{
			System.out.print("");
		}
		else
		{
			System.out.print("*");
			printStars(n-1);
		}
	}
	
	private void printPattern(int stars, int stripes)
	{
		if(stars <= stripes)
		{
			printStars(stars);
			printStripes(stripes-stars);
			System.out.println();
			printPattern(++stars,stripes);
		}
	}
	
	@Override
	public void printPattern(int n)
	{
		
		printPattern(0,n);
		
	}

	private int convertNum(int[] num, int atIndex, int lastIndex, int result)
	{
		if(atIndex >= 0)
		{
			result = result + (num[atIndex] * (int) Math.pow(10, Math.abs(atIndex - lastIndex)));
			return convertNum(num, atIndex - 1, lastIndex, result);
		}
		else
		{
			return result;
		}
	}
	
	@Override
	public int convertNum(int[] num) {
		// TODO Auto-generated method stub
		int result = 0;
		int last = num.length-1;
		int i = last;
		
		result = convertNum(num, i, last, result);
		
		
		return result;
	}
	
	private ArrayList<String> intersection( ArrayList<String> AL1, ArrayList<String> AL2, int index, ArrayList<String> ret)
	{
		if(index == AL1.size() || index == AL2.size())
		{
			return ret;
		}
		else
		{
			if(AL2.contains(AL1.get(index)))
			{
				ret.add(AL1.get(index));
			}
			
			return intersection(AL1, AL2, index + 1, ret);
		}
		
		
		
	}

	@Override
	public ArrayList<String> intersection(ArrayList<String> AL1, ArrayList<String> AL2) {
		// TODO Auto-generated method stub
		
		ArrayList<String> ret = new ArrayList<String>();
		
		return intersection(AL1, AL2, 0, ret);
	}
	public static void main(String[] args) {
		P11 p11 = new P11();
		
		int[] nums = {1,2,3,6};
		
		p11.printPattern(3);
		
		System.out.println(p11.convertNum(nums));
		
		
		ArrayList<String> AL1 = new ArrayList<String>();
		ArrayList<String> AL2 = new ArrayList<String>();
		AL1.add("a"); AL1.add("b"); AL1.add("c");
		AL2.add("b"); AL2.add("c"); AL2.add("d"); AL2.add("e");
		ArrayList<String> intersect = p11.intersection(AL1,AL2);
		System.out.println(AL1 + " intersect " + AL2 + " = " + intersect);
	}
}
