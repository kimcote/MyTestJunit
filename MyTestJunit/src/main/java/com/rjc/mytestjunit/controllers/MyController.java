package com.rjc.mytestjunit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rjc.mytestjunit.model.Child;
import com.rjc.mytestjunit.model.Parent;

@RestController
//@Controller
//@ResponseBody
//@EnableAutoConfiguration

@RequestMapping("/")
public class MyController {

//	@Value("${spring.application.name}")
//	String appName;
//	
	@Autowired
	private Parent parent;
	
	@Autowired
	private Child child;

//	@RequestMapping("/")
//	public String index() {
//		System.out.print("index");
//		return higher.getHighest();
//	}
	
	@GetMapping("/child")
	public String getName() {
		return parent.getChild().getName();
	}
	
	@PostMapping("/child")
	public ResponseEntity<HttpStatus> setName(@RequestBody String name) {
//		Child child = new child();
		parent.setChild(child);
		parent.getChild().setName(name);
		return ResponseEntity.ok(HttpStatus.OK);
	}
}