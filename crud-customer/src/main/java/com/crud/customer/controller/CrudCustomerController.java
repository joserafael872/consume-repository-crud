package com.crud.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.customer.request.CrudCustomerData;
import com.crud.customer.request.CrudCustomerName;
import com.crud.customer.response.CrudCustomerResponse;
import com.crud.customer.service.CrudService;

@CrossOrigin
@RestController
@Validated
@RequestMapping("${controller.base-path}")
public class CrudCustomerController {
	
	@Autowired
	private CrudService service;
	
	@PostMapping("${controller.insert-data}")
	public ResponseEntity<String> insertDataCustomer(@RequestBody CrudCustomerData customerData){
		
		service.insertDataFromCustomer(customerData);
		
		return new ResponseEntity<>(HttpStatus.OK);		
	}
	
	@PostMapping("${controller.get-data}")
	public CrudCustomerResponse getDataCustomer(@RequestBody CrudCustomerName customerName){
		
		return service.getDataFromCustomerByName(customerName);		
	}

}
