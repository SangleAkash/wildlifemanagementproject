package com.wild.dao;

import java.util.List;

import com.wild.entity.Animal;

public interface AnimalDao {
	
public boolean registerAnimal(Animal animal);

public boolean updateAnimal(Animal animal);

public String deleteAnimal(String ID);

public List<Animal> getAnimalList();

public Animal getSingleAnimal(String ID);




}
