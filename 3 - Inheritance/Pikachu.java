
// classes can inherit traits from others
// allows for hierarchial project structures

// syntax is `class SubClass extends SuperClass`
class Pikachu extends Pokemon {
	
	// the health and type variables are inherited
	
	// `super` can be used to access items from the superclass
	public Pikachu() {
		super(20, "Electric");
	}
	
	// the attack method has been overridden
	@Override
	public void attack() {
		System.out.println("Pikachu used thunderbolt!");
		attackCount++;
	}
	
	public void attack(Pokemon target) {
		if (target.TYPE.equals("Electric")) damage *= 0.5;
		target.health -= damage;
	}
}
