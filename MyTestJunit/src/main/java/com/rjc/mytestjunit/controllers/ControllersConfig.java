package com.rjc.mytestjunit.controllers;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.rjc.mytestjunit.model.Child;
import com.rjc.mytestjunit.model.Parent;

@Configuration
public class ControllersConfig {

	@Bean
	public Parent parent () {
		return new Parent();
	}
	
	@Bean
	public Child getChild() {
		return new Child();
	}
}
