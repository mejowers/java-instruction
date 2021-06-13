
public class Alligator extends Animal {
	
	private int alligatorCount;

	public Alligator(int count, int alligatorCount) {
		super(count);
		this.alligatorCount = alligatorCount;
	}

	public Alligator(int count) {
		super(count);
	}

	public int getAlligatorCount() {
		return alligatorCount;
	}

	public void setAlligatorCount(int alligatorCount) {
		this.alligatorCount = alligatorCount;
	}

	@Override
	public String toString() {
		return "Counting alligators..."+"\n" + alligatorCount;
	}
	
	

}
