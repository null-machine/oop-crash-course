
// abstract means that only this class' inheritors can be constructed
abstract class Pokemon {
	
	/*
	private - only instances can access
	protected - only inheritors can access
	public - everything can access
	*/
	
	// health isn't public because it should never be set directly
	private int health;
	
	// type isn't public because it never changes
	private String type;
	
	// this constructor becomes protected because the constructors in its inheritors are better
	// e.g. if this was left in, you could instantiate a fire type pikachu
	protected Pokemon(int health, String type) {
		this.health = health;
		this.type = type;
	}
	
	// public get access for health is allowed
	public int getHealth() {
		return health;
	}
	
	// controls the way health is set
	public void takeDamage(int damage, String type) {
		if (type.equals(this.type)) damage *= 0.5;
		health -= damage;
	}
	
	public String getType() {
		return type;
	}
	
	// no setter for a pokemon's type! effectively makes it impossible to
	// change after the pokemon gets constructed
	
	public void attack() {
		System.out.println("The pokemon used tackle!");
	}
}
