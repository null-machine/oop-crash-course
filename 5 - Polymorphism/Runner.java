class Runner {
	
	public static void main(String[] args) {
		
		// cast syntax is `Type objectName = (Type)objectToCast`
		
		// casting "upwards" works
		Pokemon pikachu = (Pokemon) new Pikachu();
		pikachu.attack();
		
		// casting "downwards" or "sideways" is impossible
		// Pikachu pokemon = (Pikachu) new Pokemon();
		// Ivysaur pikachu = (Ivysaur) new Pikachu();
		
		Pokemon[] party = new Pokemon[2];
		party[0] = (Pokemon) new Pikachu();
		party[1] = (Pokemon) new Ivysaur();
		// @ future me, talk about implicits
		
		for (int i = 0; i < party.length; i++) {
			party[i].attack();
			// for a pokecenter, party[i].healToMax()
		}
		
		
		// System.out.println("instanceof Pikachu?");
		// for (int i = 0; i < party.length; i++) {
		// 	System.out.println(party[0] instanceof Pikachu);
		// }
		//
		// System.out.println("instanceof Pokemon?");
		// for (int i = 0; i < party.length; i++) {
		// 	System.out.println(party[0] instanceof Pokemon);
		// }
		
		
		// `object instanceof Class` checks if object is an instance of
		// that class, or one of that class' inheritors
		
		// object.getClass() == other.getClass() compares class directly
		
	}
}
