package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import business.Pet;
import interfaces.DAO;
import ui.PetStoreConsole;

public class PetDB extends BaseDB implements DAO<Pet> {

	@Override
	public Pet get(int id) {
		Pet pet = null;
		String sql = "Select * from Pet where id = ?";
		try {
			PreparedStatement stmt = getConnection().prepareStatement(sql);
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				pet = getPetFromRow(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pet;
	}
	
	public List<Pet> get(String gender) {
		List<Pet> pets = new ArrayList<>();
		String sql = "Select * from Pet where gender = ?";
		try {
			PreparedStatement stmt = getConnection().prepareStatement(sql);
			stmt.setString(1, gender);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Pet pet = getPetFromRow(rs);
				pets.add(pet);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pets;
	}
	@Override
	public List<Pet> getAll() {
		List<Pet> pets = new ArrayList<>();
		Statement stmt;
		try {
			stmt = getConnection().createStatement();
			ResultSet rs = stmt.executeQuery("Select * from Pet order by id");
			while (rs.next()) {
				Pet pet = getPetFromRow(rs);
				pets.add(pet);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pets;
	}

	@Override
	public boolean add(Pet pet) {
		boolean success = false;
		String sql = "insert into pet (type, breed, name, birthDate, gender,"
				+ " disposition, available) values (?, ?, ?, ?, ?, ?, ?)";
		try 
			(PreparedStatement stmt = getConnection().prepareStatement(sql)){
			stmt.setString(1, pet.getType());
			stmt.setString(2, pet.getBreed());
			stmt.setString(3, pet.getName());
			stmt.setString(4, pet.getBirthDate().toString());
			stmt.setString(5, pet.getGender());
			stmt.setString(6, pet.getDisposition());
			stmt.setBoolean(7, pet.isAvailable());
			int rowsAffected = stmt.executeUpdate();
			if (rowsAffected == 1) {
				success = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return success;
	}

	@Override
	public boolean update(Pet pet) {
		return false;
	}

	@Override
	public boolean delete(Pet pet) {
		boolean success = false;
		String sql = "delete from Pet where id = ?";
		try 
			(PreparedStatement stmt = getConnection().prepareStatement(sql)){
			stmt.setInt(1, pet.getId());
			int rowsAffected = stmt.executeUpdate();
			if (rowsAffected == 1) {
				System.out.println("Pet deleted!");
			}else {
				System.out.println("Error deleting pet. Try again.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return success;
	}

	public Pet getPetFromRow(ResultSet rs) throws SQLException {
		// for each row parse information
		// pull information by column index
		int id = rs.getInt(1);
		String type = rs.getString(2);
		String breed = rs.getString(3);
		String name = rs.getString(4);
		String birthDateStr = rs.getString(5);
		LocalDate birthDate = LocalDate.parse(birthDateStr);
		String gender = rs.getString(6);
		String disposition = rs.getString(7);
		Boolean available = rs.getBoolean(8);
		Pet pet = new Pet(id, type, breed, name, birthDate, gender, disposition, available);
		return pet;
	}

}
