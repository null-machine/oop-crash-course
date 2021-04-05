import java.util.Random;

public class SecurityAgent {
	
	public Combination combo;
	public DoorLock lock;
	
	// @ future me, start here if peeps wanted to review lab two
	public SecurityAgent() {
		Random random = new Random();
		int first = random.nextInt(5) + 1;
		int second = random.nextInt(5) + 1;
		int third = random.nextInt(5) + 1;
		combo = new Combination(first, second, third);
		lock = new DoorLock(combo);
	}
	
	public void activateDoorLock() {
		lock.activate(combo);
	}
}
