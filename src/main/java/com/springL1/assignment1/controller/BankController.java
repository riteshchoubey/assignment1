package com.springL1.assignment1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class BankController {
	
	@GetMapping("/bankName")
	public String getBankName() {
		return "State Bank of India";
	}
	
	@GetMapping("/bankAddress")
	public String getBankAddress() {
		return "123 Bank Street, Financial District, City, Country";
	}
	
}
