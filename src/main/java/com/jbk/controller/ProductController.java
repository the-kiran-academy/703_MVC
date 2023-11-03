package com.jbk.controller;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.jbk.model.Product;
import com.jbk.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService service;

	@PostMapping("/add-product")
	public String addProduct(@ModelAttribute  Product product,Model model) {
		
		int status = service.addProduct(product);
		
		if(status==1) {
			model.addAttribute("msg", "Added");
			return "add-product";
		}
		else if(status==2) {
			model.addAttribute("msg", "Already exists");
			return "add-product";
		}
		else {
			model.addAttribute("msg", "Something wrong");
			return "add-product";
		}
		
		

	}

	@GetMapping("delete-product")
	public String deleteProduct(@RequestParam long pid,Model model) {
		
		List<Product> allProduct = service.deleteProduct(pid);
		model.addAttribute("list", allProduct);
		return "list-of-product";
		

	}

	@GetMapping("/get-product-by-id")
	public String getProductById(@RequestParam long pid,Model model) {
		
		Product product = service.getProductById(pid);
		
		
		model.addAttribute("product", product);
		return "update-product";
		
	}

	@GetMapping("/get-all-product")
	public String getAllProduct(Model model) {
		
		List<Product> allProduct = service.getAllProduct();
		
		model.addAttribute("list", allProduct);
		return "list-of-product";
		
	}

	@PostMapping("/update-product")
	public String updateProduct(@ModelAttribute Product product) {
		
	System.out.println("in update");
		 service.updateProduct(product);
		
		return "redirect:get-all-product";
		
	}

	@GetMapping("/get-all-product-by-order")
	public String getAllProductByName(@RequestParam String orderType, @RequestParam String propertyName) {
		return null;
		
	}

	

}
