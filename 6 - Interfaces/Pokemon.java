abstract class Pokemon implements Interactable {
	
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
		if (type.equals(this.type)) damage *= 0.5;
		health -= damage;
	}
	
	public String getType() {
		return type;
	}
	
	public abstract void attack();
	
	public abstract void interact();
}
