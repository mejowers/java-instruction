
public class Animal implements Countable {
	
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
		count++;
		System.out.println(count);
	}

	@Override
	public void resetCount() {
		count = 0;
	}

	@Override
	public int getCount() {
		return count;
	}

	@Override
	public String getCountString() {
		return "Animal count: "+count;
	}



}
