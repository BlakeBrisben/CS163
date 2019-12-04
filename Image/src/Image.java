//Image Assignment
// Author: Brisben,Blake
// Date:   Oct 17, 2019
// Class:  CS163 or CS164
// Email:  blakebri@rams.colostate.edu

public class Image implements RecitationInterface {

	PictureLibrary pic;
	int imageWidth = 0, imageHeight = 0;
	int [][] imageData;
	
	
	public Image()
	{
		PictureLibrary image = new PictureLibrary();
		
	}
	
	@Override
	public void readImage(String inFile) {
		// TODO Auto-generated method stub
		
		try
		{
			pic.readPGM(inFile);
			imageWidth = pic.getWidth();
			imageHeight = pic.getHeight();
			imageData = pic.getData();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
	}

	@Override
	public void writeImage(String outFile) {
		// TODO Auto-generated method stub
		try {
			pic.setData(imageData);
			pic.writePGM(outFile);
		}
		catch (Exception e)
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
	public void negateImage() {
		// TODO Auto-generated method stub
		for(int i = 0; i < imageWidth; i++)
		{
			for(int j = 0; j < imageHeight; j++)
			{
				imageData[i][j] -= pic.MAXVAL;
			}
		}
	}

	@Override
	public void increaseContrast() {
		// TODO Auto-generated method stub
		for(int i = 0; i < imageWidth; i++)
		{
			for(int j = 0; j < imageHeight; j++)
			{
				if(imageData[i][j] <= 127 && imageData[i][j] >= 0)
				{
					if (imageData[i][j] - 16 < 0) 
					{
						imageData[i][j] = 0;
					}
					else
					{
						imageData[i][j] += 16;
					}
				}
				else
				{
					if (imageData[i][j] + 16 > pic.MAXVAL) 
					{
						imageData[i][j] = pic.MAXVAL;
					}
					else
					{
						imageData[i][j] -= 16;
					}
				}
			}
		}
	}

	@Override
	public void decreaseContrast() {
		// TODO Auto-generated method stub
		for(int i = 0; i < imageWidth; i++)
		{
			for(int j = 0; j < imageHeight; j++)
			{
				if (imageData[i][j] <= 127 && imageData[i][j] >= 0 )
				{
					imageData[i][j] += 16;
				}
				else
				{
					imageData[i][j] -= 16;
				}
			}
		}
	}

}
