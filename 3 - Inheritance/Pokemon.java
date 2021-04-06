class Pokemon {
	
	public static int attackCount;
	
	public int health;
	public String type;
	
	public Pokemon(int health, String type) {
		this.health = health;
		this.type = type;
	}
	
	public void attack() {
		System.out.println("The pokemon used tackle!");
		attackCount++;
	}
}
