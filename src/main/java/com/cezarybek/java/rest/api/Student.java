package com.cezarybek.java.rest.api;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;

@Document
@JsonInclude
public class Student {
	@Id
	private String id;
	private String firstName;
	private String lastName;
	private String email;
	private Gender gender;
	private Address address;
	private List<String> favoriteSubjects;
	private BigDecimal totalSpentInBooks;
	private LocalDateTime created;

	public Student(String firstName, String lastName, String email, Gender gender, Address address,
			List<String> favoriteSubjects, BigDecimal totalSpentInBooks, LocalDateTime created) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.address = address;
		this.favoriteSubjects = favoriteSubjects;
		this.totalSpentInBooks = totalSpentInBooks;
		this.created = created;
	}

	public Student(String id, String firstName, String lastName, String email, Gender gender, Address address,
			List<String> favoriteSubjects, BigDecimal totalSpentInBooks, LocalDateTime created) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.address = address;
		this.favoriteSubjects = favoriteSubjects;
		this.totalSpentInBooks = totalSpentInBooks;
		this.created = created;
	}

	public Student() {
	}
}


//{
//"firstName":"Cesare",
//"lastName":"Bek",
//"email":"cesarebek1@gmail.com",
//"gender":"FEMALE",
//"address":{
//    "country":"ITA",
//    "city":"Udine",
//    "postCode":"33100"
//},
//"favoriteSubjects":["Computer Science", "Math"],
//"BigtotalSpentInBooks": 64
//}