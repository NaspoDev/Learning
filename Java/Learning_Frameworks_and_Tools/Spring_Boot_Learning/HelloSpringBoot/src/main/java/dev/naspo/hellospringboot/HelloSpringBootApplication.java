package dev.naspo.hellospringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// Following the Spring Boot quick-start guide: https://spring.io/quickstart

@SpringBootApplication // This annotation is used to define the class as a Spring Boot application.
@RestController // This annotation is used to define the class as a REST controller. (Handles requests).
public class HelloSpringBootApplication {

	// The main method is the entry point of the application.
	public static void main(String[] args) {
		SpringApplication.run(HelloSpringBootApplication.class, args);
	}

	// @GetMapping("/route") defines this method as a GET method for the specified route.
	// This method is used to define a route that returns a greeting message.
	// @RequestParam is used to define a query parameter.
	@GetMapping("/hello")
	public String helloRoute(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

}
