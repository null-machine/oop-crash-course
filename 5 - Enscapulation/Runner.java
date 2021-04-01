class Runner {
	
	public static void main(String[] args) {
		
		// none of these will work. why?
		
		Pikachu pikachu = new Pikachu(20);
		pikachu.type = "Fire";
		
		/*
		
		Pikachu pikachu = new Pikachu(20);
		System.out.print("Pikachu is an " + pikachu.type + " pokemon, ");
		System.out.println("and it has " + pikachu.health + " health.");
		
		
		Ivysaur ivysaur = new Ivysaur(25, "Grass");
		System.out.print("Ivysaur is an " + ivysaur.getType() + " pokemon, ");
		System.out.println("and it has " + ivysaur.getHealth() + " health.");
		
		
		int damage = 10;
		String type = "Dark";
		
		System.out.print("Ivysaur has " + ivysaur.getHealth() + " and ");
		System.out.println("gets hit by a " + type + " attack for " + damage + "damage!");
		ivysaur.health -= damage;
		System.out.println("Ivysaur now has " + ivysaur.getHealth() + " health remaining.");
		
		
		Pokemon pokemon = new Pokemon(30, "Basic");
		pokemon.attack();
		
		*/
	}
}
