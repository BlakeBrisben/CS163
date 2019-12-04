//P8 Assignment
// Author: Brisben,Blake
// Date:   Oct 21, 2019
// Class:  CS163 or CS164
// Email:  blakebri@rams.colostate.edu

import java.util.Arrays;

public class Transforms implements ImageInterface
{
	PictureLibrary pic;
	int imageWidth = 0, imageHeight = 0;
	int imageData[][];
	
	public Transforms()
	{
		pic = new PictureLibrary();
	}

	@Override
	public void readImage(String inFile) {
		// TODO Auto-generated method stub
		try
		{
			pic.readPGM(inFile);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		imageWidth = pic.getWidth();
		imageHeight = pic.getHeight();
		imageData = pic.getData();
	}

	@Override
	public void writeImage(String outFile) {
		// TODO Auto-generated method stub
		pic.setData(imageData);
		
		try
		{
			pic.writePGM(outFile);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

	@Override
	public int[][] imageData() {
		// TODO Auto-generated method stub
		return imageData;
	}

	@Override
	public void decode() {
		for(int i = 0; i < imageHeight; i++)
		{
			for(int j = 0; j < imageWidth; j++)
			{
				imageData[i][j] = ((15-(imageData[i][j]/16))*16)+(imageData[i][j]%16);
			}
		}
	}

	@Override
	public void swap() {
		// TODO Auto-generated method stub
		for(int i = 0; i < imageHeight; i++)
		{
			for(int j = 0; j < imageWidth; j++)
			{
				int upper = imageData[i][j] & 0b11000000;
				int lower = imageData[i][j] & 0b00000011;
				int mid = imageData[i][j] & 0b00111100;
				
				imageData[i][j] = (lower << 6)|mid|(upper >> 6);
			}
		}
	}

	@Override
	public void mirror() {
		// TODO Auto-generated method stub
		int[] temp = new int[imageWidth];
		for(int i = 0; i < imageHeight/2; i++)
		{
			temp = imageData[i];
			imageData[i] = imageData[imageHeight - i - 1];
			imageData[imageHeight - i - 1] = temp;
		}
	}

	@Override
	public void exchange() {
		// TODO Auto-generated method stub
		
		int[][] temp = new int[300][150];
		
		for(int i = 10; i < 310; i++)
		{
			for(int j = 10; j < 160; j++)
			{
				temp[i-10][j-10] = imageData[i][300 + j];
				imageData[i][300+j] = imageData[i][j];
			}
		}
		for(int i = 10; i < 310; i++)
		{
			for(int j = 10; j < 160; j++)
			{
				imageData[i][j] = temp[i-10][j-10];
			}
		}
	}
}
