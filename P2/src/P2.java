//P2 Assignment
// Author: Brisben,Blake
// Date:   Sep 3, 2019
// Class:  CS163 or CS164
// Email:  blakebri@rams.colostate.edu

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		double alphaAcid, ounces, weight, lovibond, volume;
		
		double HBUs, SRM;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Alpha Acid? ");
		alphaAcid = in.nextDouble();
		
		System.out.print("Ounces? ");
		ounces = in.nextDouble();
		
		HBUs = alphaAcid * ounces;
		
		System.out.printf("The HBUs are %.2f.\n", HBUs);
		
		System.out.print("Weight? ");
		weight = in.nextDouble();
		
		System.out.print("Lovibond? ");
		lovibond = in.nextDouble();
		
		System.out.print("Volume? ");
		volume = in.nextDouble();
		
		SRM = (0.3 * weight * lovibond / volume) + 4.7;
		
		System.out.printf("The SRM value is %.4f.\n", SRM);
	
		
		in.close();

	}

}
