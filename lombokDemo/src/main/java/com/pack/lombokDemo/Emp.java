package com.pack.lombokDemo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.Value;

//@Getter
//@Setter
//@ToString
//@RequiredArgsConstructor
//@EqualsAndHashCode
//@NoArgsConstructor
//@AllArgsConstructor
//@Data
@Value

public class Emp {
	
	final String name;
	int age;
	float salary;
	String designation;
	
}
