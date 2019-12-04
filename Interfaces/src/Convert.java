//Interfaces Assignment
// Author: Brisben,Blake
// Date:   Sep 12, 2019
// Class:  CS163 or CS164
// Email:  blakebri@rams.colostate.edu

public class Convert implements L6if
{

	@Override
	public double toPounds(double kilograms) 
	{
		// TODO Auto-generated method stub
		return kilograms * 2.20462;
	}

	@Override
	public double toFahrenheit(double celsius)
	{
		// TODO Auto-generated method stub
		return celsius * 9/5 + 32;
	}

	@Override
	public int toASCII(char letter) 
	{
		// TODO Auto-generated method stub
		return (int) letter;
	}

	@Override
	public String webify(String normal)
	{
		// TODO Auto-generated method stub
		return "https://www." + normal + ".com";
	}

	@Override
	public boolean isEven(int num) 
	{
		// TODO Auto-generated method stub
		return num % 2 == 0;
	}
	
}
