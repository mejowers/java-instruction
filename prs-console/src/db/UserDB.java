package db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import business.User;
import interfaces.DAO;

public class UserDB extends BaseDB implements DAO<User> {

	@Override
	public User get(int id) {
		User user = null;
		String sql = "Select * from user where id = ?";
		try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
		if (rs.next()) {
			user = getUserFromRow(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
			return user;
	}

	@Override
	public List<User> getAll() {
		List<User> users = new ArrayList<>();
		try {
			Statement stmt = getConnection().createStatement();
			ResultSet rs = stmt.executeQuery("Select * from user order by id");
			while (rs.next()) {
				User user = getUserFromRow(rs);
				users.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}

	@Override
	public boolean add(User user) {
		Boolean success = false;
		String sql = "insert into user (username, password, firstName, lastName, "+
				     "phone, email, reviewer, admin)values (?, ?, ?, ?, ?, ?, ?, ?)";
		try 
			(PreparedStatement stmt = getConnection().prepareStatement(sql)) {
			stmt.setString(1, user.getUserName());
			stmt.setString(2, user.getPassword());
			stmt.setString(3, user.getFirstName());
			stmt.setString(4, user.getLastName());
			stmt.setString(5, user.getPhone());
			stmt.setString(6, user.getEmail());
			stmt.setBoolean(7, user.isReviewer());
			stmt.setBoolean(8, user.isAdmin());
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
	public boolean update(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(User user) {
		boolean success = false;
		String sql = "Delete from user where id = ?";
		try (PreparedStatement stmt = getConnection().prepareStatement(sql)){
			stmt.setInt(1, user.getId());
			int rowsAffected = stmt.executeUpdate();
			if (rowsAffected == 1) {
				success = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	private User getUserFromRow(ResultSet rs) throws SQLException {
		int id = rs.getInt(1);
		String userName = rs.getString(2);
		String password = rs.getString(3);
		String firstName = rs.getString(4);
		String lastName = rs.getString(5);
		String phone = rs.getString(6);
		String email = rs.getString(7);
		Boolean reviewer = rs.getBoolean(8);
		Boolean admin = rs.getBoolean(9);
		User user = new User(id, userName, password, firstName, lastName, phone, 
				email, reviewer, admin);
		return user;
	}

}
