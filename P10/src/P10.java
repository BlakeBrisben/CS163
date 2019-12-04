import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;
import java.util.Arrays;

//P10 Assignment
// Author: Brisben,Blake
// Date:   Nov 18, 2019
// Class:  CS163 or CS164
// Email:  blakebri@rams.colostate.edu

public class P10 implements Interface
{

	@Override
	public Temperature[] readTemperatures(String filename) {
		File file = new File(filename);		
		try
		{
			Scanner tempIn = new Scanner(file);
			
			int size = tempIn.nextInt();
			Temperature[] allTemps = new Temperature[size];
			for(int i = 0; i < size; i++)
			{
				allTemps[i] = new Temperature(tempIn.next(), tempIn.next(), tempIn.nextDouble(), tempIn.nextDouble());
			}
			
			return allTemps;
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
			
		}	
		
		
		
	}

	@Override
	public double findMinimum(Date start, Date end, Temperature[] data) {
		int startIndex = 0, endIndex = 0;
		
		while(!data[startIndex].date.equals(start))
		{
			startIndex++;
		}
		
		endIndex = startIndex++;
		while(!data[endIndex].date.equals(end) && endIndex < data.length - 1)
		{
			endIndex++;
		}
		
		double minTemp = data[startIndex].temperature;
		
		for(int i = startIndex+1; i <= endIndex-1; i++)
		{
			if(data[i].temperature < minTemp)
				minTemp = data[i].temperature;
		}
		
		return minTemp;
	}

	@Override
	public double findMaximum(Date start, Date end, Temperature[] data) {
		int startIndex = 0, endIndex = 0;
		
		while(!data[startIndex].date.equals(start))
		{
			startIndex++;
		}
		
		endIndex = startIndex++;
		while(!data[endIndex].date.equals(end) && endIndex < data.length - 1)
		{
			endIndex++;
		}
		
		double maxTemp = data[startIndex].temperature;
		
		for(int i = startIndex+1; i <= endIndex-1; i++)
		{
			if(data[i].temperature > maxTemp)
				maxTemp = data[i].temperature;
		}
		
		return maxTemp;
	}

	@Override
	public double findAverage(Date start, Date end, Temperature[] data) {
		int startIndex = 0, endIndex = 0;
		
		while(!data[startIndex].date.equals(start))
		{
			startIndex++;
		}
		
		endIndex = startIndex++;
		while(!data[endIndex].date.equals(end) && endIndex < data.length -1)
		{
			endIndex++;
		}
		
		double average = 0;
		
		for(int i = startIndex; i <= endIndex-1; i++)
		{
			average += data[i].temperature;
		}
		
		return average/(endIndex-startIndex);
	}

	@Override
	public double findHighest(Date start, Date end, Temperature[] data) {
		int startIndex = 0, endIndex = 0;
		
		while(!data[startIndex].date.equals(start))
		{
			startIndex++;
		}
		
		endIndex = startIndex++;
		while(!data[endIndex].date.equals(end) && endIndex < data.length-1)
		{
			endIndex++;
		}
		
		double maxWind = data[startIndex].windspeed;
		
		for(int i = startIndex+1; i <= endIndex-1; i++)
		{
			if(data[i].windspeed > maxWind)
				maxWind = data[i].windspeed;
		}
		
		return maxWind;
	}
	
	public static void main(String[] args) 
	{
		
		// Instantiate student code
	    P10 p10 = new P10();
	    
	    // Test readTemperatures
	    Temperature[] data = p10.readTemperatures(args[0]);
	    
	    // Test findMinimum
	    Date start = Temperature.createDate("04-Jul-2008", "06:00");
	    Date end = Temperature.createDate("17-Aug-2010", "23:00");
	    System.out.println("Verifying findMinimum method:");
	    System.out.println("Start date: " + start.toString());
	    System.out.println("End date: " + end.toString());
	    System.out.printf("Minimum = %.1f degrees\n", p10.findMinimum(start, end, data));

	    // Test findMaximum 
	    start = Temperature.createDate("19-Sep-2011", "07:00");
	    end = Temperature.createDate("23-Mar-2015", "13:00");
	    System.out.println("Verifying findMaximum method:");
	    System.out.println("Start date: " + start.toString());
	    System.out.println("End date: " + end.toString());
	    System.out.printf("Maximum = %.1f degrees\n", p10.findMaximum(start, end, data));

	    // Test findAverage
	    start = Temperature.createDate("09-Apr-2006", "19:00");
	    end = Temperature.createDate("31-Oct-2013", "10:00");
	    System.out.println("Verifying findAverage method:");
	    System.out.println("Start date: " + start.toString());
	    System.out.println("End date: " + end.toString());
	    System.out.printf("Average = %.1f degrees\n", p10.findAverage(start, end, data));

	    // Test findHighest
	    start = Temperature.createDate("01-Jan-2015", "00:00");
	    end = Temperature.createDate("31-Dec-2015", "23:00");
	    System.out.println("Verifying findHighest method:");
	    System.out.println("Start date: " + start.toString());
	    System.out.println("End date: " + end.toString());
	    System.out.printf("Highest windspeed = %.1f\n", p10.findHighest(start, end, data));
	    
	}

}
