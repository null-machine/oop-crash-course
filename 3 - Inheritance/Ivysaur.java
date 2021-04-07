
// classes can inherit traits from others
// allows for hierarchial project structures

// syntax is `class SubClass extends SuperClass`
class Ivysaur extends Pokemon {
	
	// the health variable is inherited
	
	// `super` can be used to access items from the superclass
	public Ivysaur() {
		super(25, "Grass");
	}
	
	// the attack method has been overridden
	@Override
	public void attack() {
		System.out.println("Ivysaur used razor leaf!");
		attackCount++;
	}
}
