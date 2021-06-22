package db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import Interface.DAO;
import business.Movie;

public class MovieDB implements DAO<Movie> {
	
	
	private Connection getConnection() throws SQLException {
		String dbURL = "jdbc:mysql://localhost:3306/bmdb";
		String username = "bmdb_user";
		String pwd = "sesame";
		Connection conn = DriverManager.getConnection(dbURL, username, pwd);
		return conn;
	}

	@Override
	public Movie get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> getAll() {
		List<Movie> movies = new ArrayList<>();
		try {Statement stmt = getConnection().createStatement();
			ResultSet rs = stmt.executeQuery("select * from movie order by id");
			while (rs.next()) {
			Movie movie = getMovieFromRow(rs);
			movies.add(movie);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return movies;
	}

	/**
	 * @param rs 
	 * 
	 */
	private Movie getMovieFromRow(ResultSet rs) throws SQLException {
		// for each row parse an item
		int id = rs.getInt(1);
		String title = rs.getString(2);
		String rating = rs.getString(3);
		int year = rs.getInt(4);
		String director = rs.getString(5);
		Movie movie = new Movie(id, title, rating, year, director);
		return movie;
	}

	@Override
	public boolean add(Movie movie) {
		Boolean success = false;
		String sql = "insert into movie (title, rating, year, director) values (?, ?, ?, ?)";
		try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
				stmt.setString(1, movie.getTitle());
				stmt.setString(2, movie.getRating());
				stmt.setInt(3, movie.getYear());
				stmt.setString(4, movie.getDirector());
				int rowsAffected = stmt.executeUpdate();
				if (rowsAffected ==1) {
					success = true;
				}
			}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean update(Movie movie) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Movie movie) {
		// TODO Auto-generated method stub
		return false;
	}

}
