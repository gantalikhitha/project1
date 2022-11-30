package com.example.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethod {
	
	
	@GetMapping("/userservicefallback")
	public String userServiceFallBackMethod() {
		return"user service is taking longer  than expected ." +"please try again later" ;
	}
	
	

	@GetMapping("/departmentservicefallback")
	public String departmentServiceFallBackMethod() {
		return"department service is taking longer  than expected ." +"please try again later" ;
	}

}
