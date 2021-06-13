
public abstract class Animal implements Counter{
	
private int count;

public Animal(int count) {
	super();
	this.count = count;
}

public Animal() {
	super();
}

public int getCount() {
	return count;
}

public void setCount(int count) {
	this.count = count;
}

@Override
public String toString() {
	return "Animal [count=" + count + "]";
}


	
}
