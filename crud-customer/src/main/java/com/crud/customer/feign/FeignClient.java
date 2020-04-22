package com.crud.customer.feign;

import org.springframework.web.bind.annotation.PostMapping;

import com.crud.customer.request.CrudCustomerData;
import com.crud.customer.request.CrudCustomerName;
import com.crud.customer.response.CrudCustomerResponse;

@org.springframework.cloud.openfeign.FeignClient("${feign-url.host}")
public interface FeignClient {

	@PostMapping("${feign-url.feign-insert-data}")
	void insertDataCustomer(CrudCustomerData customerData);
	
	@PostMapping("${feign-url.feign-get-data}")
	CrudCustomerResponse retrieveDataFromCustomer(CrudCustomerName customerName);
}
