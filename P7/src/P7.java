//P7 Assignment
// Author: Brisben,Blake
// Date:   Oct 9, 2019
// Class:  CS163 or CS164
// Email:  blakebri@rams.colostate.edu

import java.util.Arrays;

public class P7 {
	
	public static void main(String[] args) {

        // Create arrays
        int[] integerArray = createIntegers();
        System.out.println(Arrays.toString(integerArray));
        double[] doubleArray = createDoubles();
        System.out.println(Arrays.toString(doubleArray));
        String[] stringArray = createStrings("Hello There");
        System.out.println(Arrays.toString(stringArray));
        char[] charArray = createChars("Java1234!&");
        System.out.println(Arrays.toString(charArray));

        // Test processing
        System.out.println("Sum of integer array = " + sumArray(integerArray));
        System.out.println("Largest of double array = " + findLargest(doubleArray));
        System.out.println("Frequency of 'e' = " + charFrequency(stringArray, 'e'));
        System.out.println("Translated characters = " + Arrays.toString(translateChars(charArray)));
    }

	
	public static int[] createIntegers()
	{
		int[] retArray = {16, 21, 34, 49, 55, 60, 72, 83, 101};
		return retArray;
	}
	
	public static double[] createDoubles()
	{
		double[] retArray = new double[7];
		
		for (int i = 0; i < 7; i++)
		{
			retArray[i] = Math.pow(10 + i*.5, 2);
		}
		return retArray;
	}
	
	public static String[] createStrings(String input)
	{
		String sub = input.substring(1);
		
		String[] retArray = {input, input.toUpperCase(), input.toLowerCase(), sub};
		
		return retArray;
	}
	
	public static char[] createChars(String input)
	{
		return input.toCharArray();
	}
	
	public static int sumArray(int[] input)
	{
		return Arrays.stream(input).sum();
	}
	
	public static double findLargest(double[] input)
	{
		double max = input[0];
		
		for(int i = 1; i < input.length; i++)
		{
			if (input[i] > max)
				max = input[i];
		}
		
		return max;
	}
	
	public static int charFrequency(String[] input, char find)
	{
		int counter = 0;
		
		for(int i = 0; i < input.length; i++)
		{
			for(int j = 0; j < input[i].length(); j++)
			{
				if (input[i].charAt(j) ==  find)
					counter++;
			}
		}
		
		return counter;
	}
	
	public static int[] translateChars(char[] input)
	{
		int[] out = new int[input.length];
		
		for(int i = 0; i < input.length; i++) 
		{
			out[i] = (int) input[i];
		}
		
		return out;
	}
}
