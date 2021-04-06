abstract class Pokemon {
	
	protected static int attackCount;
	
	private int health;
	private String type;
	
	protected Pokemon(int health, String type) {
		this.health = health;
		this.type = type;
	}
	
	public int getHealth() {
		return health;
	}
	
	public void takeDamage(int damage, String type) {
		// exceptions let you define error messages
		// standardized way to replace print statements that highlight errors
		if (damage < 1) throw new IllegalArgumentException("damage cannot be negative");
		if (type.equals(this.type)) damage *= 0.5;
		health -= damage;
	}
	
	public String getType() {
		return type;
	}
	
	public abstract void attack();
}
