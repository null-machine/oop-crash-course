class Ivysaur extends Pokemon {
	
	public Ivysaur(int health) {
		super(health, "Grass");
	}
	
	public void attack() {
		System.out.println("Ivysaur used razor leaf!");
	}
	
	public void interact() {
		System.out.println("Saauur!");
	}
}
