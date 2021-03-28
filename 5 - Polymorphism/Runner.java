class Runner {
	
	public static void main(String[] args) {
		
		// casting upwards works
		Pokemon pikachu = (Pokemon) new Pikachu(20);
		pikachu.attack();
		
		// casting downwards or sideways is impossible
		// Pikachu pokemon = (Pikachu) new Pokemon(20);
		// Ivysaur pikachu = (Ivysaur) new Pikachu(20);
		
		Pokemon[] party = new Pokemon[2];
		party[0] = new Pikachu(20);
		party[1] = new Ivysaur(25);
		
		for (int i = 0; i < party.length; i++) {
			party[i].attack();
			// for a pokecenter, party[i].healToMax()
		}
	}
}
