package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/hi") //localhost:8080/hi
	
	String displayHelloPage(){
		
		return "hello";//hello.jsp
		
	}
	

}
