import java.util.Arrays;

//ArrayPractice Assignment
// Author: Brisben,Blake
// Date:   Oct 8, 2019
// Class:  CS163 or CS164
// Email:  blakebri@rams.colostate.edu

public class ArrayPractice {
	public static void main(String[] args) {
		double[] grades = {81.2, 92.5, 48.9, 78.8, 45.5};
		int[] numbers = {12, 42, 33, 67, 92, 58, 33};
		String[] arguements = new String[9];
		
		
		System.out.println(grades.length);
		System.out.println(numbers.length);
		System.out.println(arguements.length);
		
		System.out.println(grades[0]);
		System.out.println(grades[2]);
		System.out.println(numbers[numbers.length-1]);
		
		grades[grades.length-2] = 90.5;
		numbers[2] = 99;
		
		for(int i = 0; i < 6; i++)
		{
			arguements[i] = "Java";
		}
		
		for(int i = 6; i < arguements.length; i++)
		{
			arguements[i] = "C++";
		}
		
		for(int i = 0; i < grades.length; i++)
		{
			System.out.print(grades[i] + ", ");
		}
		
		System.out.println();
		
		for(int i = 0; i < numbers.length; i++)
		{
			System.out.print(numbers[i] + " ");
		}
		
		System.out.println();
		
		for(int i = 0; i < arguements.length; i++)
		{
			System.out.print(arguements[i] + "_");
		}
		
		System.out.println();
		
		System.out.println(Arrays.toString(grades));
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(arguements));
		
		System.out.printf("Array Average: %.3f", arrayAverage(grades));
	}
	
	public static double arrayAverage(double[] nums)
	{
		return Arrays.stream(nums).sum()/nums.length;
	}
}
