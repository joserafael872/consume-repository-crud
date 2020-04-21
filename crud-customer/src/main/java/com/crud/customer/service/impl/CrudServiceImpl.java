package com.crud.customer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.customer.feign.FeignClient;
import com.crud.customer.request.CustomerData;
import com.crud.customer.request.CustomerName;
import com.crud.customer.response.CustomerResponse;
import com.crud.customer.service.CrudService;

@Service("CrudServiceImpl")
public class CrudServiceImpl implements CrudService{
	
	@Autowired
	private FeignClient feignClient;

	@Override
	public void insertDataFromCustomer(CustomerData customerData) {
		feignClient.insertDataCustomer(customerData);
	}

	@Override
	public CustomerResponse getDataFromCustomerByName(CustomerName customerName) {
		
		return feignClient.retrieveDataFromCustomer(customerName);
	}

}
