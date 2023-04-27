package com.wild.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.wild.dao.AnimalDao;
import com.wild.entity.Animal;

@Controller
public class AnimalController {
	@Autowired
	AnimalDao ad;

	@PostMapping(value = "/register")
	public boolean registerAnimal(@RequestBody Animal animal) {
		boolean registerAnimal = ad.registerAnimal(animal);
		return registerAnimal;
	}

	@PostMapping(value = "/updateAnimal")
	public boolean updateAnimal(@RequestBody Animal animal) {
		boolean updateAnimal = ad.updateAnimal(animal);
		return updateAnimal;
	}

	@DeleteMapping(value = "/deleteAnimal/{ID}")
	public String deleteAnimal(@PathVariable String ID) {
		String deleteAnimal = ad.deleteAnimal(ID);
		return deleteAnimal;
	}

	@GetMapping(value = "/getanimalList")
	public List<Animal> getAnimalList() {
		List<Animal> animalList = ad.getAnimalList();
		return animalList;
	}

	@GetMapping(value = "/getSingleanimal/{ID}")
	public Animal getSingleAnimal(String ID) {
		Animal singleAnimal = ad.getSingleAnimal(ID);
		return singleAnimal;
	}
}
