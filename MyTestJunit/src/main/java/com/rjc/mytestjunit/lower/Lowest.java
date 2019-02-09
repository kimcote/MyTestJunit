package com.rjc.mytestjunit.lower;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rjc.mytestjunit.model.Parent;

@Component
public class Lowest {
	
	@Autowired
	private Parent parent;

	public String getLowest() {
		return "Lowest";
	}
	
	public String getName() {
		return parent.getChild().getName();
	}
}
