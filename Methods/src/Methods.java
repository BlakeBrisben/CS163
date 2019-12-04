//Methods Assignment
// Author: Brisben,Blake
// Date:   Sep 10, 2019
// Class:  CS163 or CS164
// Email:  blakebri@rams.colostate.edu

public class Methods {
	
	public static double circleArea(double radius)
	{
		double area = Math.PI * Math.pow(radius, 2);
		return area;
	}
	
	public static double sphereVolume (double radius)
	{
		double volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
		return volume;
	}
	
	public static int round(double userNum)
	{
		return (int) Math.floor(userNum + .5);
	}
	
	public static String pluralize(String userText)
	{
		return userText + "s";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Area of a circle radius 2: " + circleArea(2.0));
		System.out.println("Volume of a sphere with radius 2: " + sphereVolume(2.0));
		System.out.println("The rounded value of 37.4: " + round(37.4));
		System.out.println("The plural of \"robot\": " + pluralize("robot"));

	}

}
