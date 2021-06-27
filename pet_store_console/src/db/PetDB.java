package db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import business.Pet;
import interfaces.DAO;

public class PetDB extends BaseDB implements DAO<Pet>{
	
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
	

	public Pet getByGender() {
	Pet pets = null;
		String sql = "Select * from pet where gender = ?";
		try {
			PreparedStatement stmt = getConnection().prepareStatement(sql);
			stmt.setString(1, pets.getGender());
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
			pets = getPetFromRow(rs);	
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
		return false;
	}

	@Override
	public boolean update(Pet pet) {
		return false;
	}

	@Override
	public boolean delete(Pet pet) {
		return false;
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
		Pet pet = new Pet(id, type, breed, name, birthDate, gender, 
				disposition, available);		
		return pet;
	}

}
