abstract class Pokemon {
	
	protected static int attackCount;
	
	private int health;
	public final String TYPE;
	
	protected Pokemon(int health, String type) {
		this.health = health;
		this.TYPE = TYPE;
	}
	
	public int getHealth() {
		return health;
	}
	
	public void takeDamage(int damage, String TYPE) {
		if (TYPE.equals(this.TYPE)) damage *= 0.5;
		health -= damage;
	}
	
	public abstract void attack();
}
