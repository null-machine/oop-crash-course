
// classes can inherit traits from others
// allows for hierarchial project structures
class Pikachu extends Pokemon {
	
	// the health and type variables are inherited
	
	// a new constructor has been added
	// `super` accesses the class this inherits from
	public Pikachu() {
		super(20, "Electric");
	}
	
	// the attack method has been overridden
	@Override
	public void attack() {
		System.out.println("Pikachu used thunderbolt!");
		attackCount++;
	}
}
