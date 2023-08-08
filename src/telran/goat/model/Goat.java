package telran.goat.model;

public class Goat {
	private int count;
	public final int max;

	public Goat(int max) {
		this.max = max;
	}

	public int getCount() {
		return count;
	}

	public void incrementCount() {
		count++;
	}

}
