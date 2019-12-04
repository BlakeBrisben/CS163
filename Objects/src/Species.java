public class Species {	

    // Put the instance variable here.
	Species animal;
	String name;
	double pop;
	double grRate;
    // ....

    // Create a Species constructor that takes in a String for its name, an int for
    // its population, and an int for its growth rate per year as a percent.
	public Species(String name, double pop, double grRate)
	{
		this.name = name;
		
		if(pop > 1500)
		{
			this.pop = 1500;
		}
		else if(pop < 1)
		{
			this.pop = 1;
		}
		else
		{
			this.pop = pop;
		}
		
		if(grRate > 20)
		{
			this.grRate = 20;
		}
		else if(grRate < 1)
		{
			this.grRate = 1;
		}
		else
		{
			this.grRate = grRate;
		}
	}
    // ....
    
    // mergeSpecies adds the populations of the two species, changes the name
    // of the species to the concatenation of the two names, and the growth
    // rate to the maximum of the two growth rates.

    public void mergeSpecies(Species other) {
        // ....
        pop += other.pop;
        name += other.name;
        if(grRate < other.grRate)
        {
        	grRate = other.grRate;
        }
    }

    public String toString(){
        // ....
        String retString = "Name of species: " + name + "\nPopulation: " + (int) pop + "\nGrowth Rate: " + grRate;
        return retString;
    }

    // Increases the population according to the growth rate of the species, i.e.
    // updates the population instance variable by adding to it the growth rate/100 times the current population.
    
    public void grow() {
        // ....
        pop =  pop + pop*(grRate/100);
    }

    // Returns the population of the species in x years according to its growth rate.

    public int populationInXYears(int x){
        // ....
        for(int i = 0; i < x; i++)
        {
        	grow();
        }
        int fpop = (int) pop;
        pop = fpop;
        return fpop;
    }

	
	  public static void main(String[] args) {
	  
	  // Put simple code here to test the Species class. It is always a good idea to include
		  // a main method in any class you define.
	  
	  Species a = new Species("Frog", 100, 10); System.out.println(a);
	  
	  a.grow(); System.out.println(a);
	  
	  System.out.println("a.populationInXYears(10) returns " +
	  a.populationInXYears(10));
	  
	  Species b = new Species("Rabbit", 10, 23); a.mergeSpecies(b);
	  System.out.println("a.mergeSpecies(b) is " + a);
	  
	  }
	 
}
