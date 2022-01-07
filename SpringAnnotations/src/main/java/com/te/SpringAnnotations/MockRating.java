package com.te.SpringAnnotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MockRating {
	@Value("Good")
	String rating;
	@Value("80")
	int Theory;
	@Value("70")
	int Practical;

	@Override
	public String toString() {
		return "MockRating [rating=" + rating + ", Theory=" + Theory + ", Practical=" + Practical + "]";
	}

}
