
public class Sheep extends Animal implements Cloneable {
	
	private String name;

	public Sheep(int count, String name) {
		super(count);
		this.name = name;
	}

	public Sheep(int count) {
		super(count);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getCountString() {
		return "Counting "+name+"..."+"\n" + getCount() + name;
	}
	
	
	

}
