import java.util.Arrays;

//Bubble Sort Assignment
// Author: Brisben,Blake
// Date:   Oct 11, 2019
// Class:  CS163 or CS164
// Email:  blakebri@rams.colostate.edu

public class BubbleSort {
	public static void main(String[] args)
	{
		int[] in = {1,6,4,9,0,3,2};
		System.out.println(Arrays.toString(bubbleSort(in)));
	}
	
	public static int[] bubbleSort(int[] input)
	{
		int[] ret = input;
		int temp = input[0];
		for (int i = 0; i < input.length; i++)
		{
			for(int j = 0; j < input.length-i - 1; j++)
			{
				if (input[j] > input[j+1])
				{
					temp = ret[j];
					ret[j] = ret[j+1];
					ret[j+1] = temp;
				}
			}
		}
		return input;
	}
}
