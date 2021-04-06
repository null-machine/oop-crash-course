class Ivysaur<E> extends Pokemon<E> {
	
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
