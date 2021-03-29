class Pikachu extends Pokemon {
	
	public Pikachu(int health) {
		super(health, "Electric");
	}
	
	public void attack() {
		System.out.println("Pikachu used thunderbolt!");
	}
	
	public void interact() {
		System.out.println("Pika pika!");
	}
}
