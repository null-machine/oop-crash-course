
// classes can inherit traits from others
// allows for hierarchial project structures
class Ivysaur extends Pokemon {
	
	// the health variable is inherited
	
	// a new constructor has been added
	// `super` accesses the class this inherits from
	public Ivysaur(int health) {
		super(health, "Grass");
	}
	
	// the attack method has been overridden
	public void attack() {
		System.out.println("Ivysaur used razor leaf!");
	}
}
