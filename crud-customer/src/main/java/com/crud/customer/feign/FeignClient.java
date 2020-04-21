package com.crud.customer.feign;

import org.springframework.web.bind.annotation.PostMapping;

import com.crud.customer.request.CustomerData;
import com.crud.customer.request.CustomerName;
import com.crud.customer.response.CustomerResponse;

@org.springframework.cloud.openfeign.FeignClient("${feign-url.host}")
public interface FeignClient {

	@PostMapping("${feign-url.feign-insert-data}")
	void insertDataCustomer(CustomerData customerData);
	
	@PostMapping("${feign-url.feign-get-data}")
	CustomerResponse retrieveDataFromCustomer(CustomerName customerName);
}
