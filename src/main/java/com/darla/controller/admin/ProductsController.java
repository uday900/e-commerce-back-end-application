package com.darla.controller.admin;

import org.springframework.web.bind.annotation.RestController;

import com.darla.modal.Product;
import com.darla.service.ProductService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/admin")
public class ProductsController {
	
	@Autowired
    private ProductService productService;

    // Endpoint to add a new product
    @PostMapping("/add-product")
    public Product addProduct(@RequestBody Product product) {
    	System.out.println(product);
    	System.out.println("sldkgjgfskjgodajgofjgsdfjgkflbhwrgjds;kajgfsd");
        return productService.addProduct(product);
        
    }
    
    @GetMapping("/products")
    public List<Product> getMethodName() {
        return productService.getProducts();
    }
    
    @GetMapping("/test")
    public String getMethodName2() {
        return "Hello this is fucking working";
    }
    
    
	
}
