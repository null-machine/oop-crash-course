
// this class itself can no longer be constructed
 class Pokemon {
	
	// only accessible to inheritors
	protected static int attackCount;
	
	// access controlled with getters and setters
	private int health;
	
	// never changed after being set
	public final String type;
	
	/*
	private String type;
	public String getType() ...
	(no setter)
	*/
	
	protected Pokemon(int health, String type) {
		this.health = health;
		this.type = type;
	}
	
	// health getter
	public int getHealth() {
		return health;
	}
	
	// health setter
	public void takeDamage(int damage, String type) {
		if (type.equals(this.type)) damage *= 0.5;
		health -= damage;
	}
	
	// attackCount getter
	public int getAttackCount() {
		return attackCount;
	}
	
	// abstract on a method forces non-abstract inheritors to override it
	public abstract void attack();
}
