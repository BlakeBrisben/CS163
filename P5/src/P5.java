//P5 Assignment
// Author: Brisben,Blake
// Date:   Sep 23, 2019
// Class:  CS163 or CS164
// Email:  blakebri@rams.colostate.edu

import java.util.Scanner;

public class P5 {
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		double grossSalary, interestIncome, capitolGains;
		int exemptions;
		double totalIncome, adjustedIncome, federalTax = 0, stateTax;
		
		System.out.print("Salary: ");
		grossSalary = in.nextDouble();
		
		System.out.print("Exemptions: ");
		exemptions = in.nextInt();
		
		System.out.print("Interest: ");
		interestIncome = in.nextDouble();
		
		System.out.print("Gains: ");
		capitolGains = in.nextDouble();
		
		in.close();
		
		totalIncome = grossSalary + interestIncome + capitolGains - 5000;
		
		if(exemptions > 6)
		{
			exemptions = 6;
		}
		
		adjustedIncome = totalIncome - (exemptions * 1500.00);
		
		
		if(adjustedIncome >= 20000)
		{
			if (adjustedIncome > 35000)
				federalTax += 1950;
			else 
				federalTax += (adjustedIncome-20000) * .13;
		}
		if(adjustedIncome >= 35000 )
		{
			if (adjustedIncome > 50000)
				federalTax += 3450;
			else 
				federalTax += (adjustedIncome-35000) * .23;
		}
		if(adjustedIncome >= 50000)
		{
			federalTax += (adjustedIncome-50000) * .28;
		}
		
		stateTax = adjustedIncome * .065;
		
		
		System.out.printf("Total Income: $%.2f", totalIncome);
		System.out.printf("\nAdjusted Income: $%.2f", adjustedIncome);
		System.out.printf("\nTotal Tax: $%.2f", federalTax);
		System.out.printf("\nState Tax: $%.2f\n", stateTax);
		
		
		
	}
}
