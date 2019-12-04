public class Animal {
	
	private String name;
	private int topSpeed;		
	//create the getters and setters for the instance variables
        //there is a shortcut by hovering over the variable names
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// For the setter associated with topSpeed make sure the values are between 0 and 70
    // Print "Invalid Speed" if it is not within these values and leave
    // the speed unchanged.
	public int getTopSpeed() {
		return topSpeed;
	}
	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}
		
	
	
	//create a constructor that takes in a String for the name and an int for the topSpeed
	//use only the setters initialize the instance variables
	
	public Animal(String name, int topSpeed)
	{
		setName(name);
		setTopSpeed(topSpeed);
	}

	
	public String toString()
	{
		return "Name: " + name + "\tTop Speed: " + topSpeed;
	}

        //create an equals(Object other) method that returns True if the two Animal objects have 
	//top speeds that are within 2 mph of each other
	
	public boolean equals(Object other)
	{
		if (other instanceof Animal)
		{
			Animal newAn = (Animal) other;
			
			if (Math.abs(topSpeed - newAn.topSpeed) <= 2)
				return true;
			else
				return false;
		}
		else
			return false;
	}
	// Create a toString method
	// Formatting of the returned String should follow this example:
	// Name: elephant     Top Speed: 25
	
}
