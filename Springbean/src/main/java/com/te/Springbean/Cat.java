package com.te.Springbean;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal {

	@Override
	public void eat() {
		System.out.println("i eat fish");
	}

	@Override
	public void makeSound() {
		System.out.println("Meow Meow");
	}

	@Override
	public boolean isPet() {
		return true;
	}

}
