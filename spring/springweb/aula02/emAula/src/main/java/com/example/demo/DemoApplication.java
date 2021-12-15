
package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "apelido", defaultValue = "World") String name) {
		return String.format("Hello %s! Numero fixo %d", name,10);
	}

	@GetMapping("/outro")
	public String greeting(@RequestParam(value = "numero", defaultValue = "10") String nro) {
		return String.format("O número é %s!", nro);
	}

}
            