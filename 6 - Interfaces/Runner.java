class Runner {
	
	public static void main(String[] args) {
		
		// interfaces let you store completely different classes under the same data type!!
		Interactable[] npcs = new Interactable[3];
		npcs[0] = new Trainer();
		npcs[1] = new Pikachu(20);
		npcs[2] = new Ivysaur(25);
		for (int i = 0; i < npcs.length; i++) {
			npcs[i].interact();
		}
	}
}
