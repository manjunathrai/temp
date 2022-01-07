package com.te.Springbean;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Pet {
	@Value("Tommy")
	String name;
	@Autowired
	@Qualifier("dog")
	Animal animal;
//	List<Animal> animals;

//	public List<Animal> getAnimals() {
//		return animals;
//	}
//
//	public void setAnimals(List<Animal> animals) {
//		this.animals = animals;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	void myPet() {
//		for(int i=0;i<animals.size();i++)
//		if (animals.get(i).isPet()) {
//			animals.get(i).eat();
//			animals.get(i).makeSound();
//		}
		if (animal.isPet()) {
			animal.eat();
			animal.makeSound();
		}
	}
}
