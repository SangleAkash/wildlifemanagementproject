package com.wild.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wild.dao.AnimalDao;
import com.wild.entity.Animal;
import com.wild.service.AnimalService;
@Service
public class AnimalServiceimpl implements AnimalService {
@Autowired
AnimalDao ad;
	@Override
	public boolean registerAnimal(Animal animal) {
		// TODO Auto-generated method stub
		return ad.registerAnimal(animal);
	}

	@Override
	public boolean updateAnimal(Animal animal) {
		// TODO Auto-generated method stub
		return ad.updateAnimal(animal);
	}

	@Override
	public String deleteAnimal(String ID) {
		// TODO Auto-generated method stub
		return ad.deleteAnimal(ID);
	}

	@Override
	public List<Animal> getAnimalList() {
		// TODO Auto-generated method stub
		return ad.getAnimalList();
	}

	@Override
	public Animal getSingleAnimal(String ID) {
		// TODO Auto-generated method stub
		return ad.getSingleAnimal(ID);
	}

}
