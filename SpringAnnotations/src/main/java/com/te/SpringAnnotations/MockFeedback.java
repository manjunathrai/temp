package com.te.SpringAnnotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class MockFeedback {
	@Value("Can improve")
	String feedback;

	@Override
	public String toString() {
		return "MockFeedback [feedback=" + feedback + "]";
	}
	

}
