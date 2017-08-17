package br.com.ecommerce.store.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.ecommerce.store.daos.ProductDAO;
import br.com.ecommerce.store.models.Product;

@Controller
public class ProductsController {
	@Autowired
	private ProductDAO productDAO;
	
	@RequestMapping("/products")
	public String save(Product product) {
		System.out.println("Registering the product " + product);
		productDAO.save(product);
		return "products/ok";
	}

	@RequestMapping("/products/form")
	public String form() {
		return "products/form";
	}
}
