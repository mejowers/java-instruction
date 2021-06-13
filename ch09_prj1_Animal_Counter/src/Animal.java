
public class Animal implements Counter {
	
	private int count;
	
	public Animal(int count) {
		super();
		this.count = count;
	}
	
	public Animal() {
		super();
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public void incrementCount() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resetCount() {
		// TODO Auto-generated method stub

	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getCountString() {
		// TODO Auto-generated method stub
		return null;
	}

}
