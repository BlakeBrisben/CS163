import java.awt.Component;
import java.util.ArrayList;
import java.util.Arrays;

/* Insert your name here */

public class Cloud {
	private ArrayList<Point> points;	
    private boolean debug = false;
	

	/**
	 * Given Constructor
	 */
	public Cloud(){
		points = new ArrayList<Point>();
	}

	public void setDebug(Boolean debug){
		this.debug = debug;	
	}
	

	//TODO Implement Cloud.isEmpty
	/**
	 * @return whether cloud is empty or not
	 */
	public boolean isEmpty(){
		if(points.size() == 0)
			return true;
		else
			return false;
	}


	//TODO Implement Cloud.size
	/**
	 * @return number of points in the cloud
	 */
	public int size(){
		return points.size();
	}

	
	//TODO Implement Cloud.hasPoint
	/**
	 * 
	 * @param p a Point
	 * @return whether p in the cloud
	 */
	public boolean hasPoint(Point p){
		return points.contains(new Point(p.getX(), p.getY()));
	}

	//TODO Implement Cloud.addPoint
	/**
	 * 
	 * @param p
	 * if p not in points, add p ***at the end*** of points (to keep same order)

	 */
	public void addPoint(Point p){
		points.add(p);
	}

	//Given Cloud.toString
	public String toString(){
		return points.toString();
	}

	//TODO Implement Cloud.extremes
	/**
	 * 
	 * @return an array of doubles: left, right, top, and bottom of points, 
	 *         null for empty cloud
	 */
	public double[] extremes(){
		if(points.isEmpty())
			return null;
		
		
		double minX = points.get(0).getX(), minY = points.get(0).getY(), maxX = points.get(0).getX(), maxY = points.get(0).getY();
		
		for(int i = 0; i < points.size(); i++)
		{
			//System.out.println(points.get(i).getX() < minX);
			if(points.get(i).getX() > maxX)
				maxX = points.get(i).getX();
			if(points.get(i).getY() > maxY)
				maxY = points.get(i).getY();
			if(points.get(i).getX() < minX)
				minX = points.get(i).getX();
			if(points.get(i).getY() < minY)
				minY = points.get(i).getY();
		}
		
		double[] retArray = {minX, maxX, maxY, minY};
		return retArray;
	}
	
	//TODO Implement Cloud.centerP
	/**
	 * 
	 * @return: if (cloud not empty) create and return the center point
	 *          else null;
	 */
	public Point centerP(){
		if(points.isEmpty())
			return null;
		
		double xSum = 0, ySum = 0;
		
		for(int i = 0; i < points.size(); i++)
		{
			xSum += points.get(i).getX();
			ySum += points.get(i).getY();
		}
		
		double cX = xSum/points.size();
		double cY = ySum/points.size();
		
		Point retPoint = new Point(cX, cY);
		
		return retPoint;

	}


	//TODO Implement Cloud.minDist
	/**
	 * 
	 * @return minimal distance between 2 points in the cloud
	 *         0.0 for a cloud with less than 2 points
	 */
	public double minDist(){
		if(points.size() < 2)
			return 0;
		
		double minDist = points.get(0).euclidDist(points.get(1));
		
		
		for(int i = 0; i < points.size(); i++)
		{
			for(int j = 0; j < points.size(); j++)
			{
				if(i != j)
				{
					
					if(points.get(i).euclidDist(points.get(j)) < minDist)
						minDist = points.get(i).euclidDist(points.get(j));
						
				}
			}
		}
		return minDist;
	}

	//TODO Implement Cloud.crop
	/**
	 * 
	 * @param p1 
	 * @param p2
	 * 
	 * all Points outside the rectangle, line or point spanned
	 * by p1 and p2 are removed
	 *  
	 */
	public void crop(Point p1, Point p2){
		
		double minX, maxX, minY, maxY;
		
		ArrayList<Integer> cropped = new ArrayList<Integer>();
		
		if (p1.getX() == p2.getX())
		{
			maxX = p1.getX();
			minX = maxX;
		}
		else if(p1.getX() > p2.getX())
		{
			maxX = p1.getX();
			minX = p2.getX();
		}
		else
		{
			maxX = p2.getX();
			minX = p1.getX();
		}
		
		if (p1.getY() == p2.getY())
		{
			maxY = p1.getY();
			minY = maxY;
		}
		else if(p1.getY() > p2.getY())
		{
			maxY = p1.getY();
			minY = p2.getY();
		}
		else
		{
			maxY = p2.getY();
			minY = p1.getY();
		}
		
		for(int i = 0; i < points.size(); i++)
		{
			if(!((points.get(i).getX() <= maxX && points.get(i).getX() >= minX) && (points.get(i).getY() <= maxY && points.get(i).getY() >= minY)))
			{
				cropped.add(i);
			}
		}
		
		for(int i = 0; i < cropped.size(); i++)
		{
			points.remove(cropped.get(i) - i);
		}
 	}
 
	

	/**
	 * @param args:no args
	 */
	public static void main(String[] args) {

		Cloud cloud = new Cloud();
		
		cloud.setDebug(false);
		System.out.println("cloud.debug OFF");
		System.out.println("cloud: " + cloud);
		
		if(!cloud.isEmpty())
			System.out.println("Error: cloud should be empty!");
		
		if(cloud.extremes()!=null)
			System.out.println("Error: extremes should be null!");
		
		if(cloud.minDist()!=0.0)
			System.out.println("Error: minDist should return 0.0!");

			
		Point p31 = new Point(0.01,0.99);
		cloud.addPoint(p31);
		
		Point p22 = new Point(1.0,-.25);
		cloud.addPoint(p22);
			
		Point p42 = new Point(0.5,.5);
		cloud.addPoint(p42);
		
		Point p33 = new Point(-.25,1.0);
		cloud.addPoint(p33);

		System.out.println("cloud 1: " + cloud);
		
		System.out.println("center point in cloud: " + cloud.centerP());

		System.out.println("cloud: " + cloud);
		System.out.println("cloud 2: " + cloud);
		

		Point p77 = new Point(7,7);
		if (cloud.hasPoint(p77))
			System.out.println("Error: point " + p77 + " should not be in cloud!");
		else
			System.out.println("OK: point " + p77 + " is not in cloud");

		double[] extrs = cloud.extremes();
		if(extrs!=null){
			System.out.println("left: " + extrs[0]);
		    System.out.println("right: " + extrs[1]);
		    System.out.println("top: " + extrs[2]);
		    System.out.println("bottom: " + extrs[3]);
		}
		double minD = cloud.minDist();			
		System.out.printf("min dist in cloud: %5.3f \n", minD);				
		
		System.out.println("Test cloud with 1 point");
		Cloud cloud1 = new Cloud();
		Point p = new Point();
		cloud1.addPoint(p);
	    minD = cloud1.minDist();
		System.out.printf("min dist in cloud1: %5.3f \n",  minD);
		
		Cloud cropCloud = new Cloud();
		
		for(int i = 0; i < 10; i++)
		{
			cropCloud.addPoint(new Point(i,i));
		}
		
		cropCloud.crop(new Point(3,3), new Point(8,8));
		
		System.out.println(cropCloud.toString());

	}

}
