import java.util.Scanner;

//P3 Assignment
// Author: Brisben,Blake
// Date:   Sep 6, 2019
// Class:  CS163 or CS164
// Email:  blakebri@rams.colostate.edu

public class P3 implements P3IF{
	
	public static void main(String[] args) {
		double alphaAcid, ounces, weight, lovibond, volume;
		
		double HBUs, SRM;
		
		Scanner in = new Scanner(System.in);
		P3 formulas = new P3();
		
		System.out.print("Alpha Acid? ");
		alphaAcid = in.nextDouble();
		
		System.out.print("Ounces? ");
		ounces = in.nextDouble();
		
		HBUs = formulas.hbu(alphaAcid, ounces);
		
		System.out.printf("The HBUs are %.2f.\n", HBUs);
		
		System.out.print("Weight? ");
		weight = in.nextDouble();
		
		System.out.print("Lovibond? ");
		lovibond = in.nextDouble();
		
		System.out.print("Volume? ");
		volume = in.nextDouble();
		
		SRM = formulas.srm(weight, lovibond, volume);
		
		System.out.printf("The SRM value is %.4f.\n", SRM);
		
		in.close();
	}

	@Override
	public double srm(double weight, double lovibond, double volume) {
		double srm = (.3 * weight * lovibond / volume) + 4.7;
		return srm;
	}

	@Override
	public double hbu(double alphaAcid, double ounces) {
		
		double hbu = alphaAcid * ounces;
		
		return hbu;
	}
}
