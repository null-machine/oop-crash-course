class Ivysaur extends Pokemon {
	
	public Ivysaur() {
		super(25, "Grass");
	}
	
	public void attack() {
		System.out.println("Ivysaur used razor leaf!");
		attackCount++;
	}
	
	public void interact() {
		System.out.println("Saauur!");
	}
}
