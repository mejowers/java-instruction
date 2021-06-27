package db;

import java.util.List;

import business.Pet;
import interfaces.DAO;

public class PetDB extends BaseDB implements DAO<Pet>{
	
	public Pet get(int id) {
		
		
	}

	@Override
	public List<Pet> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Pet pet) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Pet t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Pet t) {
		// TODO Auto-generated method stub
		return false;
	}

}
