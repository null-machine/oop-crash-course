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
		
		/*
		System.out.println("\ninstanceof Pikachu?");
		for (int i = 0; i < party.length; i++) {
			System.out.println(party[0] instanceof Pikachu);
		}
		
		System.out.println("\ninstanceof Pokemon?");
		for (int i = 0; i < party.length; i++) {
			System.out.println(party[0] instanceof Pokemon);
		}
		
		// object.getClass() == other.getClass() compares class directly
		
		// `object instanceof Class` checks if object is an instance of
		// that class, or one of that class' inheritors
		*/
	}
}
