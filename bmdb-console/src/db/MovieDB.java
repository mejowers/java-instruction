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
		Statement stmt;
		try {
			stmt = getConnection().createStatement();
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
		int year = rs.getInt(3);
		String rating = rs.getString(4);
		String director = rs.getString(5);
		Movie movie = new Movie(id, title, rating, year, director);
		return movie;
	}

	@Override
	public boolean add(Movie movie) {
		// TODO Auto-generated method stub
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
