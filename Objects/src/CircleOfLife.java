public class CircleOfLife {

    public static void main(String args[]) {

        // Create a new Species object here, passing in the appropriate arguments
    	Species ladybug = new Species("ladybug", 5, 10);
    	Species shark = new Species("shark", 300, 20);
		
        // Print out the species' growth rate
    	System.out.println("Growth Rate: " + ladybug.grRate);
    	System.out.println("Growth Rate: " + shark.grRate);

        // Use the species' toString here
    	System.out.println(ladybug);
    	System.out.println(shark);
    	
        // Call populationInXYears here
    	System.out.println(ladybug.populationInXYears(10));
    	System.out.println(shark.populationInXYears(10));
    	
        // Create a new Species object here, passing in the appropriate arguments
        // using a very large number for the population (e.g. 100000000)
    	Species ant = new Species("ant", 10000000, 21);

        // Print out the species' population to make sure it is set to 1500
    	System.out.println(ant);
    	
        // Call populationInXYears here, feel free to hardcode in the int to be passed to the method
    	System.out.println(ant.populationInXYears(10));

        // Call mergeSpecies here. Test that mergeSpecies is doing what you expected it to
		ladybug.mergeSpecies(shark);
		System.out.println(ladybug);
    	
    }
}
