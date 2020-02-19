package com.example.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BootController {

	@RequestMapping("/")
	public String getString(){
		return "This is Rest Controller.";
	}
}
