package Business;

public class Dice {

		private int value;

		public Dice(int value) {
			super();
			this.value = value;
		}

	// this is going to call the roll method
		public Dice() {
			super();
			roll();
		}

		public int getValue() {
			return value;
		}

		//Disabling setter to protect the integrity of the roll
//		public void setValue(int value) {
//			this.value = value;
//		}

		//this replaces the setter
private void roll() {
	value = (int)(Math.random()*6)+1;
}
	}
