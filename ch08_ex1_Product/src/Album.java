
public class Album extends Product {
	
	private String artist;

	public Album(String artist) {
		super();
		this.artist = artist;
	}

	public Album() {
		super();
		artist = "";
		count++;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	@Override
	public String toString() {
		return " "+getDescription()+ " ("+ artist + ")";
	}
	
	

}