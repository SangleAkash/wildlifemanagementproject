package com.wild.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Animal {
	@Id
	private String ID;
	private String species;
	private int age;
	private String color;
	private String habitat;
	private String description;

	public Animal() {
		super();
	}

	public Animal(String iD, String species, int age, String color, String habitat, String description) {
		super();
		ID = iD;
		this.species = species;
		this.age = age;
		this.color = color;
		this.habitat = habitat;
		this.description = description;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Animal [ID=" + ID + ", species=" + species + ", age=" + age + ", color=" + color + ", habitat="
				+ habitat + ", description=" + description + "]";
	}

}
