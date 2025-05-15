package com.klu;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebAppController {
	@GetMapping("/add/{a}/{b}")
	public String add(@PathVariable int a, @PathVariable int b) {
		
		return "Addition result value is :"+(a+b);
		
	}

}
