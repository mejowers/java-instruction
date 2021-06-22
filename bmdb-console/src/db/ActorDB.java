package db;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Interface.DAO;
import business.Actor;

public class ActorDB extends BaseDB implements DAO<Actor> {
	

	@Override
	public Actor get(int id) {
		Actor actor = null;
		String sql = "Select * from actor where id = ?";
		try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
		if (rs.next()) {
				actor = getActorFromRow(rs);
			} 
		}	catch (SQLException e) {
				e.printStackTrace();
	}
		return actor;
	}

	@Override
	public List<Actor> getAll() {
		List<Actor> actors = new ArrayList<>();
		try {Statement stmt = getConnection().createStatement();
			ResultSet rs = stmt.executeQuery("select * from actor order by id");
			while (rs.next()) {
			Actor actor = getActorFromRow(rs);
			actors.add(actor);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return actors;
	}

	/**
	 * @param rs 
	 * 
	 */
	private Actor getActorFromRow(ResultSet rs) throws SQLException {
		// for each row parse an item
		int id = rs.getInt(1);
		String fName = rs.getString(2);
		String lName = rs.getString(3);
		String gender = rs.getString(4);
		String birthDateStr = rs.getString(5);
		LocalDate birthDate = LocalDate.parse(birthDateStr);
		Actor actor = new Actor(id, fName, lName, gender, birthDate);
		return actor;
	}

	@Override
	public boolean add(Actor actor) {
		Boolean success = false;
		String sql = "insert into actor (firstName, lastName, gender, birthDate"
				+ ") values (?, ?, ?, ?)";
		try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
				stmt.setString(1, actor.getfName());
				stmt.setString(2, actor.getlName());
				stmt.setString(3, actor.getGender());
				stmt.setString(4, actor.getBirthDate().toString());
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
	public boolean update(Actor actor) {
		boolean success = false;
		String sql = "Update Actor set "
				   + " FirstName = ?, "
				   + " LastName = ?, "
				   + " Gender = ?, "
				   + " BirthDate = ? "
				   + "Where id = ? ";
		try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
			stmt.setString(1, actor.getfName());
			stmt.setString(2, actor.getlName());
			stmt.setString(3, actor.getGender());
			stmt.setString(4, actor.getBirthDate().toString());
			stmt.setInt(5, actor.getId());
			int rowsAffected = stmt.executeUpdate();
			if (rowsAffected ==1) {
				success = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	return success;
	}
		

	@Override
	public boolean delete(Actor actor) {
		boolean success = false;
		String sql = "delete from actor where id = ?";
		try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
				stmt.setInt(1, actor.getId());
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
