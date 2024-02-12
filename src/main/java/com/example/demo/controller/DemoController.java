package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;

import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RequestMapping("/rest")
@RestController
public class DemoController {
	@ApiResponse(responseCode = "200",description = "returned products successfully")
	@ApiResponse(responseCode = "404",description = "product not found",
	content = @Content(examples = @ExampleObject(name = "product",value = "not found")))
	@GetMapping("/getProd")
	public Product getProduct() {
		Product prod = new Product();
		prod.setId(12);
		prod.setName("Nalini");
		prod.setEmail("nalini.developer@gmail.com");
		prod.setAmount(270);
		return prod;
	}
	
	@PostMapping("/saveProd")
	public Product saveProduct(@RequestBody @Valid Product prod) {
		return prod;
	}
    
}
