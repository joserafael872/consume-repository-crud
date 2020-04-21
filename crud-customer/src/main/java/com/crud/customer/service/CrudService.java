package com.crud.customer.service;

import com.crud.customer.request.CustomerData;
import com.crud.customer.request.CustomerName;
import com.crud.customer.response.CustomerResponse;

public interface CrudService {
	
	void insertDataFromCustomer (CustomerData customerData);
	
	CustomerResponse getDataFromCustomerByName(CustomerName customerName);

}
