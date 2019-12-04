import java.util.Scanner;

//Comparisons Assignment
// Author: Brisben,Blake
// Date:   Sep 12, 2019
// Class:  CS163 or CS164
// Email:  blakebri@rams.colostate.edu

public class Comparisons {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		boolean boolean0 = true;
		boolean boolean1 = false;
		
		
		System.out.println("Boolean0 is " + boolean0);
		System.out.println("Boolean1 is " + boolean1);
		
		boolean equals = 11==33;
		boolean notEquals = 22!=44;
		boolean greaterThan = 15>25;
		boolean lessThan = -11<13;
		
		System.out.println("(11 == 33) is " + equals);
		System.out.println("(22 != 44) is " + notEquals);
		System.out.println("(15 > 25) is " + greaterThan);
		System.out.println(" (-11 < 13) is " + lessThan);
		
		System.out.print("Enter First Integer: ");
		int integer0 = in.nextInt();
		
		System.out.print("Enter Second Integer: ");
		int integer1 = in.nextInt();
		
		if (integer0 > integer1)
			System.out.println("First integer is larger than the second.");
		else if (integer1 > integer0)
		{
			System.out.println("Second integer is larger than the first.");
		}
		else
		{
			System.out.println("Both integers are equal.");
		}
		
		
		System.out.print("Enter a State: ");
		String myString = in.next();
		
		switch (myString)
		{
		case "Alabama":
		case "Florida":
			System.out.println("Southern State");
			break;
		case "Colorado":
		case "Utah":
			System.out.println("Western State");
			break;
		case "Michigan":
		case "Wisconsin":
			System.out.println("Northern State");
			break;
		case "Delaware":
		case "Maine":
			System.out.println("Eastern State");
			break;
		default:
			System.out.println("Not sure where that is. Must be in the Midwest.");
			break;
				
			
			
		
		}
		
		
		
		
		
	}
}
