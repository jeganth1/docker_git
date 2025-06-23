package com.example.maven_build.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {
	@GetMapping("/get")
	public String get() {
		System.out.println("hi helo");
		return "hi hello";
	}

}
