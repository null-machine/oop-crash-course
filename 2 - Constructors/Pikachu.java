class Pikachu {
	
	public int health;
	public String type;
	
	public Pikachu(int newHealth, String newType) {
		health = newHealth;
		type = newType;
	}
	
	/*
	public Pikachu(int health, String type) {
		this.health = health;
		this.type = type;
	}
	// */
	
	public void attack() {
		System.out.println("Pikachu used thunderbolt!");
	}
}
