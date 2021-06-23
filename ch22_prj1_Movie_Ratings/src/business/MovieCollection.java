package business;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MovieCollection {

	List<Movie> movies = new ArrayList<>();

	public MovieCollection(List<Movie> movies) {
		super();
		this.movies = movies;
	}

	public MovieCollection() {
		super();
	}
	
	public void add(Movie movie) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @return the movies
	 */
	public List<Movie> getMovies(Predicate<Movie> condition) {
		List<Movie> filterMovies = new ArrayList<>();
				for (Movie m: movies) {
					if (condition.test(m)) {
						filterMovies.add(m);
					}
				}
		return filterMovies;
	}
	


	/**
	 * @param movies the movies to set
	 */
	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}

	@Override
	public String toString() {
		return "MovieCollection [movies=" + movies + "]";
	}

	
	
}
