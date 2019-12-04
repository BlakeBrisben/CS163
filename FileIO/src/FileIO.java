import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

//FileIO Assignment
// Author: Brisben,Blake
// Date:   Nov 5, 2019
// Class:  CS163 or CS164
// Email:  blakebri@rams.colostate.edu

public class FileIO {
	
	public void readFile(String inputFile)
	{
		File f = new File(inputFile);
		try
		{
			Scanner inF = new Scanner(f);
			while(inF.hasNext())
			{
				if(inF.hasNextInt())
				{
					System.out.println("Int: " + inF.nextInt());
				}
				else if(inF.hasNextDouble())
				{
					System.out.println("Double: " + inF.nextDouble());
				}
				else
				{
					System.out.println("String: " + inF.next());
				}
				
				System.out.println();
			}
			inF.close();
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		
		{
			
		}
		
	}
	
	
	public void writeFile(String outputFile)
	{
		try
		{
			Scanner inF = new Scanner(System.in);
			
			PrintWriter p = new PrintWriter("./output.txt");
			String in = null;
			
			while(true)
			{
				in = inF.next();
				if(in.toLowerCase().equals("stop"))
					break;
				else
					p.println(in);
			}
				
			
			p.close();
			
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) 
	{
		FileIO f = new FileIO();
		f.readFile(args[0]);
		
		//f.writeFile(args[1]);
	}
}
