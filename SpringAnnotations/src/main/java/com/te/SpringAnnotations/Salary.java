package com.te.SpringAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Salary {
	MockRating mockRating1;
	MockFeedback feedback;

	public void setMockRating1(MockRating mockRating1) {
		this.mockRating1 = mockRating1;
	}

	public void setFeedback(MockFeedback feedback) {
		this.feedback = feedback;
	}

	@Override
	public String toString() {
		return "Salary [mockRating1=" + mockRating1 + ", feedback=" + feedback + "]";
	}

}
