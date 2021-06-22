package db;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Interface.DAO;
import business.Actor;
import business.Credit;
import business.Movie;

public class CreditDB implements DAO<Credit> {
	
	
	private Connection getConnection() throws SQLException {
		String dbURL = "jdbc:mysql://localhost:3306/bmdb";
		String username = "bmdb_user";
		String pwd = "sesame";
		Connection conn = DriverManager.getConnection(dbURL, username, pwd);
		return conn;
	}

	@Override
	public Credit get(int id) {
		Credit credit = null;
		String sql = "select * from credit c"
				+ "	join actor on actorid = actor.ID"
				+ "	join movie on movieid = movie.ID"
				+ " where c.id = ?";
		try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
		if (rs.next()) {
				credit = getCreditFromRow(rs);
			} 
		}	catch (SQLException e) {
				e.printStackTrace();
	}
		return credit;
	}

	@Override
	public List<Credit> getAll() {
		List<Credit> credits = new ArrayList<>();
		try {Statement stmt = getConnection().createStatement();
			ResultSet rs = stmt.executeQuery("select * from credit"
					+ " join actor on actorid = actor.ID"
					+ " join movie on movieid = movie.ID;");
			while (rs.next()) {
			Credit credit = getCreditFromRow(rs);
			credits.add(credit);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return credits;
	}

	/**
	 * @param rs 
	 * 
	 */
	private Credit getCreditFromRow(ResultSet rs) throws SQLException {
		// for each row parse a credit, actor and movie
		// parse actor
		int actorId = rs.getInt(5);
		String firstName = rs.getString(6);
		String lastName = rs.getString(7);
		String gender = rs.getString(8);
		String bdStr = rs.getString(9);
		LocalDate bd = LocalDate.parse(bdStr);
		Actor actor = new Actor(actorId, firstName, lastName, gender, bd);
		
		int movieId = rs.getInt(10);
		String title = rs.getString(11);
		int year = rs.getInt(12);
		String rating = rs.getString(13);
		String director = rs.getString(14);
		Movie movie = new Movie(movieId, title, rating, year, director);
		
		int creditId = rs.getInt(1);
		String role = rs.getString(4);
		Credit credit = new Credit(creditId, actor, movie, role);
		return credit;
	}

	@Override
	public boolean add(Credit credit) {
		Boolean success = false;
		String sql = "insert into credit (actorId, movieId, role"
				+ ") values (?, ?, ?, ?)";
		try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
				stmt.setInt(1, credit.getActor().getId());
				stmt.setInt(2, credit.getMovie().getId());
				stmt.setString(3, credit.getRole());
				int rowsAffected = stmt.executeUpdate();
				if (rowsAffected ==1) {
					success = true;
				}
			}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return success;
	}

	@Override
	public boolean update(Credit credit) {
		boolean success = false;
//		String sql = "Update Credit set "
//				   + " ActorId = ?, "
//				   + " MovieId = ?, "
//				   + " Role = ?, "
//				   + "Where id = ? ";
//		try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
//			stmt.setInt(1, credit.getActor());
//			stmt.setInt(2, credit.getMovieId());
//			stmt.setString(3, credit.getRole());
//			stmt.setInt(5, credit.getId());
//			int rowsAffected = stmt.executeUpdate();
//			if (rowsAffected ==1) {
//				success = true;
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
	return success;
	}
		

	@Override
	public boolean delete(Credit credit) {
		boolean success = false;
		String sql = "delete from credit where id = ?";
		try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
				stmt.setInt(1, credit.getId());
				int rowsAffected = stmt.executeUpdate();
				if (rowsAffected == 1)  {
					success = true;
				} 
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return success;
	}
	
		
}
