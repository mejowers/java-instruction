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
	public boolean add(User t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(User t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(User t) {
		// TODO Auto-generated method stub
		return false;
	}
	private User getUserFromRow(ResultSet rs) throws SQLException {
		int id = rs.getInt(1);
		String userName = rs.getString(2);
		String password = rs.getString(3);
		String firstName = rs.getString(4);
		String lastName = rs.getString(5);
		String phone = rs.getString(6);
		return null;
	}

}
