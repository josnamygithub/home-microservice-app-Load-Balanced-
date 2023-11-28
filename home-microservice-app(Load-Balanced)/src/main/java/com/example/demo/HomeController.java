package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HomeController {
	
	@Autowired
	RestTemplate restTemplates;
	
	@GetMapping("/home")
	
	public String home() {
		String products =restTemplates.getForObject("http://PRODUCT-APPLICATION/products", String.class);
		return products;
	}

}
