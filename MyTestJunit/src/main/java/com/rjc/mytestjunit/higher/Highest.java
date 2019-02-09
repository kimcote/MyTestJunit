package com.rjc.mytestjunit.higher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rjc.mytestjunit.middle.Middlest;

@Component
public class Highest {

	@Autowired
	private Middlest middle;
	
	public String getHighest() {
		return middle.getMiddlest() + " Highest";
	}
}
