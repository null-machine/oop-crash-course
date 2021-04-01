
// classes are templates that define and create objects
class Pikachu {
	
	public static int attackCount;
	
	// class variables
	public int health;
	public String type;
	
	// methods
	public void attack() {
		System.out.println("Pikachu used thunderbolt!");
		attackCount++;
	}
	
	// classes don't have to have a main method
	// generally, a main is only used once as a starting point
}
