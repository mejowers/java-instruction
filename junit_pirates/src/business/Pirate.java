package business;

public class Pirate {

	private String name;
	private int limbsRemaining;
	private static int numPirates;
	private static int totalLimbsLost;

	public Pirate(String name) {
		super();
		this.name = name;
		this.limbsRemaining = 4;
		numPirates++;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the limbsRemaining
	 */
	public int getLimbsRemaining() {
		return limbsRemaining;
	}

	/**
	 * @param limbsRemaining the limbsRemaining to set
	 */
	public void setLimbsRemaining(int limbsRemaining) {
		this.limbsRemaining = limbsRemaining;
	}

	/**
	 * @return the pirates
	 */
	public static int getNumPirates() {
		numPirates++;
		return numPirates;
	}

	/**
	 * @param pirates the pirates to set
	 */
	public static void setNumPirates(int pirates) {
		Pirate.numPirates = pirates;
		numPirates++;
	}

	/**
	 * @return the totalLimbsLost
	 */
	public static int getTotalLimbsLost() {
		return totalLimbsLost;
	}

	/**
	 * @param totalLimbsLost the totalLimbsLost to set
	 */
	public static void setTotalLimbsLost(int totalLimbsLost) {
		Pirate.totalLimbsLost = totalLimbsLost;
	}

	public Pirate() {
		super();
	}

	public Pirate(String name, int limbsRemaining) {
		super();
		this.name = name;
		this.limbsRemaining = limbsRemaining;
	}

	@Override
	public String toString() {
		return "Pirate '" + name + "' has " + limbsRemaining + " limbsRemaining.";
	}

	// Method to determine if the pirate is dead.
	// If limbs remaining is negative, pirate is dead.
	public boolean isDead() {
		return (limbsRemaining < 0);
	}

	public void loseALimb() {
		if (isDead()) {
			System.out.println(name + " is dead.  Can't lose more limbs!");
		} else if (limbsRemaining == 0) {
			limbsRemaining--;
			totalLimbsLost++;
			System.out.println("AAAARGH!!!!  " + name + " has died.");
		} else {
			limbsRemaining--;
			totalLimbsLost++;
			System.out.println("AAAARGH!!!!  " + name + " says 'I lost me limb!!!!'.");
		}
	}

}
