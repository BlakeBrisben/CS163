//InertSort Assignment
// Author: Brisben,Blake
// Date:   Nov 1, 2019
// Class:  CS163 or CS164
// Email:  blakebri@rams.colostate.edu

import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSort {
	
	public static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		int working;
		
		System.out.print("Give number of inputs: ");
		int n = in.nextInt();

		ArrayList<Integer> ints = new ArrayList<Integer>(n);
		
		System.out.println(ints.size());
		
		
		
		
		for(int i = 0; i < n; i++)
		{
			System.out.println(ints.size());
			working = input();
			
			for(int j = 0; j < n; j++)
			{
				if (j == i-2)
				{
					ints.add(working);
					System.out.println(ints.toString());
				}
				else if(ints.get(i) > working)
				{
					ints.add(j, working);
					System.out.println(ints.toString());
				}
			}
		}
		
		System.out.println(ints.toString());
	}
	
	
	public static int input()
	{
		System.out.print("Enter an integer ");
		int retVal = in.nextInt();
		return retVal;
		
	}
}
