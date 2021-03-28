class Runner {
	
	public static void main(String[] args) {
		
		Pikachu pikachu = new Pikachu(20);
		System.out.print("Pikachu is an " + pikachu.type + " pokemon, ");
		System.out.println("and it has " + pikachu.health + " health.");
		pikachu.attack();
		
		// if youre readin this think about what these will
		// print bc i'm gonna ask yall to participate
		
		/*
		Ivysaur ivysaur = new Ivysaur(25);
		System.out.print("Ivysaur is an " + ivysaur.type + " pokemon, ");
		System.out.println("and it has " + ivysaur.health + " health.");
		ivysaur.attack();
		// */
	}
}
