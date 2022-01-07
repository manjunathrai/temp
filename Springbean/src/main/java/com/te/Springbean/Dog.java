package com.te.Springbean;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal {

	@Override
	public void eat() {
		System.out.println("I eat Dog food");
	}

	@Override
	public void makeSound() {
		System.out.println("Bow Bow");
	}

	@Override
	public boolean isPet() {
		return true;
	}

}
