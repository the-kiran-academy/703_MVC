package com.jbk.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

	
	private long productId;
	
	@NotBlank
	@Pattern(regexp = "^[a-zA-Z]+[a-zA-Z0-9]*$", message = "Product not valid")
	private String productName;
	
	@Min(1)
	private int productQty;

	@Min(1)
	private double productPrice;

}
