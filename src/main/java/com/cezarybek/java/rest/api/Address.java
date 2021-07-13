package com.cezarybek.java.rest.api;

public class Address {
	
	private String country;
	private String city;
	private String postCode;
	
	public Address(String country, String city, String postCode) {
		this.country = country;
		this.city = city;
		this.postCode = postCode;
	}

	public Address() {
	}
	
	
}
