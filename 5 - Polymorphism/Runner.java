class Runner {
	
	public static void main(String[] args) {
		
		// casting from a subclass to a superclass always works
		Pokemon pikachu = new Pikachu();
		
		// polymorphism lets you store different subclasses in the same collection!
		Pokemon[] party = new Pokemon[2];
		party[0] = new Pikachu();
		party[1] = new Ivysaur();
		
		for (int i = 0; i < party.length; i++) {
			party[i].attack();
		}
		
		System.out.println("The opposing pokemon used Discharge!");
		for (int i = 0; i < party.length; i++) {
			party[i].takeDamage(10, "Electric");
			System.out.println(party[i] + " has " + party[i].getHealth() + " health remaining!");
		}
		
		// System.out.println("instanceof Pikachu?");
		// for (int i = 0; i < party.length; i++) {
		// 	System.out.println(party[i] instanceof Pikachu);
		// }
		
		// System.out.println("instanceof Pokemon?");
		// for (int i = 0; i < party.length; i++) {
		// 	System.out.println(party[0] instanceof Pokemon);
		// }
		
		// `object instanceof Class` checks if object is an instance of
		// that class, or one of that class' inheritors
		
		// object.getClass() == other.getClass() compares class directly
		
	}
}
