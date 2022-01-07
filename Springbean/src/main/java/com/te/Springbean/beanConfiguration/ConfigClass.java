package com.te.Springbean.beanConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.te.Springbean.Cat;
import com.te.Springbean.Dog;
import com.te.Springbean.Pet;


public class ConfigClass {
	@Bean("dog")
	@Primary
	public Dog getDog() {
		return new Dog();
	}

	@Bean("cat")
	public Cat getCat() {
		return new Cat();
	}

	@Bean
	public Pet getPet() {
//		 Pet pet = new Pet();
//		 pet.setAnimal(getCat());
//		 return pet;
		return new Pet();
	}
}
