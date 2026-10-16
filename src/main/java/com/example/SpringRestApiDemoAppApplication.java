package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class SpringRestApiDemoAppApplication {

	@RequestMapping("/")
	public String home(){
		return "Hello World";
	}

	//public String requestMethodName(@RequestParam String param) {
	//	return new String();
	//}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringRestApiDemoAppApplication.class, args);
	}

}
