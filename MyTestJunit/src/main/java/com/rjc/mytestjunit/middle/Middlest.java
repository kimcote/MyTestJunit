package com.rjc.mytestjunit.middle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rjc.mytestjunit.lower.Lowest;

@Component
public class Middlest {

	@Autowired
	Lowest lower;
	
	public String getMiddlest() {
		return lower.getLowest() + " Middlest";
	}
}
