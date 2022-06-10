package com.example.demo.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class controller {

	@GetMapping("/{name}")
	public ResponseEntity<String> getGreeting(@PathVariable("name") String name) {
		return new ResponseEntity<String>("Hello dear: " + name, HttpStatus.OK);
	}
}
