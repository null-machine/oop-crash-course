class Pikachu<E> extends Pokemon<E> {
	
	public Pikachu() {
		super(20, "Electric");
	}
	
	public void attack() {
		System.out.println("Pikachu used thunderbolt!");
		attackCount++;
	}
	
	public void interact() {
		System.out.println("Pika pika!");
	}
}
