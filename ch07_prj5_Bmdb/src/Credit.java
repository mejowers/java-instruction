
public class Credit {
	
	private int id;
	private int actorId;
	private int movieId;
	
	
	public Credit(int id, int actorId, int movieId) {
		super();
		this.id = id;
		this.actorId = actorId;
		this.movieId = movieId;
	}


	public Credit() {
		super();
	}


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


	@Override
	public String toString() {
		return "Credit [id=" + id + ", actorId=" + actorId + ", movieId=" + movieId + "]";
	}
	
	

}
