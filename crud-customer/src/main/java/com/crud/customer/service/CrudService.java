package com.crud.customer.service;

import com.crud.customer.request.CrudCustomerData;
import com.crud.customer.request.CrudCustomerName;
import com.crud.customer.response.CrudCustomerResponse;

public interface CrudService {
	
	void insertDataFromCustomer (CrudCustomerData customerData);
	
	CrudCustomerResponse getDataFromCustomerByName(CrudCustomerName customerName);

}
