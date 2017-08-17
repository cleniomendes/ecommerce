package br.com.ecommerce.store.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
		//loading products
		System.out.println("loading products");
		return "hello-world";
	}
}