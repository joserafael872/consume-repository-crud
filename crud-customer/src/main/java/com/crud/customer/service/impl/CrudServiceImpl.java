package com.crud.customer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.customer.feign.FeignClient;
import com.crud.customer.request.CrudCustomerData;
import com.crud.customer.request.CrudCustomerName;
import com.crud.customer.response.CrudCustomerResponse;
import com.crud.customer.service.CrudService;

@Service("CrudServiceImpl")
public class CrudServiceImpl implements CrudService{
	
	@Autowired
	private FeignClient feignClient;

	@Override
	public void insertDataFromCustomer(CrudCustomerData customerData) {
		feignClient.insertDataCustomer(customerData);
	}

	@Override
	public CrudCustomerResponse getDataFromCustomerByName(CrudCustomerName customerName) {
		
		return feignClient.retrieveDataFromCustomer(customerName);
	}

}
