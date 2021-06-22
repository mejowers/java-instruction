package business;

public class CreditOld {
	//instance variables
	private int id;
	private int actorId;
	private int movieId;
	private String role;
	
	//constructors
	public CreditOld(int id, int actorId, int movieId, String role) {
		super();
		this.id = id;
		this.actorId = actorId;
		this.movieId = movieId;
		this.role = role;
	}


	public CreditOld() {
		super();
	}

	// setters and getters
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getActorId() {
		return actorId;
	}


	public void setActorId(int actorId) {
		this.actorId = actorId;
	}


	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	
	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}


	@Override
	public String toString() {
		return "Credit id: " +"\n"+
			   "Actor id: " +actorId+", "+"Movie id: " +movieId+"\n"+
			   "Role: "+role+"\n";
	}
	
	

}
