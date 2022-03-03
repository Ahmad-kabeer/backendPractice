package com.example.demo;

import java.util.Random;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin
public class EmployeeController {

	
	@RequestMapping("/")
	public String hi() {
//		return "helloThere";
		Random rand = new Random(); //instance of random class
	      int upperbound = 100;
	        //generate random values from 0-99
	      int int_random = rand.nextInt(upperbound); 
	      return "Random integer value from 0 to " + (upperbound-1) + " : "+ int_random;
	}

}