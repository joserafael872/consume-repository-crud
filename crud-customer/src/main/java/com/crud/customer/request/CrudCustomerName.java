package com.crud.customer.request;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class CrudCustomerName {
	
	/**
	 * client name.
	 */
	@NotNull
	@NotEmpty
	@JsonProperty("nombre")
	private String nombre;

}
