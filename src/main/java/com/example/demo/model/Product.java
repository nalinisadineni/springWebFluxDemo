package com.example.demo.model;

import com.example.demo.validation.ValidateProductType;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class Product {
	@NotNull(message="id should not be null")
		private int id;
	@NotBlank(message="name should not be empty")
		private String name;
	@Email(message="incorrect email id. please check again")
	private String email;
	@Min(value=250,message="minimum amount should be 250")
	private int amount;
	//@NotBlank(message="productType is mandatory")
	@ValidateProductType(message="product type should be among Electronics, Baby&Kids")
	private String productType;
	
		
}
